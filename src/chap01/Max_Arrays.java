package chap01;

import java.util.Arrays;

//max를 사용한 최댓값 구하기
public class Max_Arrays {
    public static void main(String[] args) {

        int[] var = { 1, 2, 3, 4, 5, 6, 7, 8 };

        int max = Arrays.stream(var).max().getAsInt();

        System.out.println("최댓값: " + max); // 출력: 5.0
    }
}
