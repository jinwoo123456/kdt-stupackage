package chap01;

import java.util.Arrays;

public class Max_google {
    public static void main(String[] args) {
        // 최댓값을 구할 데이터 배열 생성
        int[] var = { 1, 2, 3, 4, 5, 6, 7, 8 };

        // Arrays.stream().max() 메서드는 배열의 값들 중 최댓값을 반환합니다.
        int max = Arrays.stream(var).max().getAsInt();
        // 계산된 최댓값을 출력
        System.out.println("최댓값: " + max); // 출력: 5.0
    }
}