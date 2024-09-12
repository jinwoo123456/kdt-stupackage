package chap02;

public class PrimeNumber {
    public static void main(String[] args) {

        // 1000 이하의 소수 나열하기;

        int[] sosu_array = new int[1000];
        int cnt = 0;
        // 소수는 1과 자기 자신만으로 나누어지는 숫자
        for (int i = 2; i < 1000; i++) {
            if (i % i == 0 && i % 1 == 0) {
                sosu_array[i] = i;
                cnt++;

            }

        }
        for (int i = 1; i < cnt; i++) {

            System.out.println(sosu_array[i]);
        }

    }
}
