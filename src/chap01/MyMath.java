package chap01;

public class MyMath {  // 클래스 이름을 MyMath로 변경

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // 내장 Math 클래스를 사용하여 최댓값 구하기
        int max = Math.max(a, b);
        System.out.println("최댓값: " + max);
    }
}
