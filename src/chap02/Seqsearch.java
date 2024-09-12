package chap02;

public class Seqsearch {

    static int Seqsearch(int[] a, int n, int key) {

        int i = 0;
        while (true) {

            if (i == n) {
                return -1;
            }
        if (a[i] == key) {
            return i;
        }
        i++;
    }
}

    public static void main(String[] args) {
        int[] a = { 2, 3, 4 };
        System.out.println(Seqsearch(a, 3, 1));
    }
}
