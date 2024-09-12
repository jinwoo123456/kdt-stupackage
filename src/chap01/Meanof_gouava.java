package chap01;

import com.google.common.math.Stats;

public class Meanof_gouava {

    public static void main(String[] args) {
        // 평균을 계산할 데이터 배열 생성
        double[] values = { 1.0, 2.0, 3.0, 4.0, 5.0 };

        // Stats.meanOf() 메서드는 주어진 값들의 평균을 계산합니다.
        // 여기서는 배열의 모든 값을 더한 후, 값의 개수로 나누어 평균을 구합니다.
        double average = Stats.meanOf(values);

        // 계산된 평균값을 출력
        System.out.println("평균: " + average); // 출력: 3.0
    }

}
