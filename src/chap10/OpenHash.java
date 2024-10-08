package chap10;

public class OpenHash<K, V> {

    enum Status {
        OCCUPIED, EMPTY, DELETED
    }; // 데이터 저장, 비어있음, 삭제 완료

    // 버킷
    static class Bucket<K, V> {
        private K key; // 키값,데이터,상태
        private V data;
        private Status stat;

        // 생성자
        Bucket() {
            stat = Status.EMPTY;// 버킷이 비어있음
        }

        // 모든필드에 값을 설정
        void set(K key, V data, Status stat) {
            this.key = key;
            this.data = data;
            this.stat = stat;
        }

        void setStat(Status stat) {
            this.stat = stat;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return data;
        }

        public int hashCode() {
            return key.hashCode();
        }
    }

    private int size;
    private Bucket<K, V>[] table;

    public OpenHash(int size) {
        try {
            table = new Bucket[size];
            for (int i = 0; i < size; i++)
                table[i] = new Bucket<K, V>();
            this.size = size;
        } catch (OutOfMemoryError e) {
            this.size = 0;
        }
    }

    public int hashValue(Object key) {
        return key.hashCode() % size;
    }

    public int rehashValue(int key) {
        return (key + 1) % size;
    }

    private Bucket<K, V> searchNode(K key) {
        int hash = hashValue(key);
        Bucket<K, V> p = table[hash];

        for (int i = 0; p.stat != Status.EMPTY && i < size; i++) {
            if (p.stat == Status.OCCUPIED && p.getKey().equals(key))
                return p;
            hash = rehashValue(hash);
            p = table[hash];
        }
        return null;
    }

    public V search(K key) {
        Bucket<K, V> p = searchNode(key);
        if (p != null)
            return p.getValue();
        else
            return null;
    }

    public int add(K key, V data) {
        if (search(key) != null)
            return 1;

        int hash = hashValue(key);
        Bucket<K, V> p = table[hash];

        for (int i = 0; i < size; i++) {
            if (p.stat == Status.EMPTY || p.stat == Status.DELETED) {
                p.set(key, data, Status.OCCUPIED);
                return 0;
            }
            hash = rehashValue(hash);
            p = table[hash];
        }
        return 2;
    }

    public int remove(K key) {
        Bucket<K, V> p = searchNode(key);
        if (p == null)
            return 1;
        p.setStat(Status.DELETED);
        return 0;
    }

    public void dump() {
        for (int i = 0; i < size; i++) {
            System.out.printf("%02d ", i);
            switch (table[i].stat) {
                case OCCUPIED:
                    System.out.printf("%s (%s)\n", table[i].getKey(), table[i].getValue());
                    break;
                case EMPTY:
                    System.out.println("-- 미등록 --");
                    break;
                case DELETED:
                    System.out.println("-- 삭제 완료 --");
                    break;
            }
        }
    }

}
