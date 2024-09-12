package chap01;

public class MaxOfArray {

    public static int 배열최대값메소드(int[] arr) {
        int max_length = arr.length;
        for (int i = 0; i < max_length; i++) {

        }
        int max = arr[0];
        return max;

    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(배열최대값메소드(array));

    }
}
