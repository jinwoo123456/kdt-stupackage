package chap01;

import java.util.Scanner;

public class PrintStar1_custom {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("*출력하기");

        System.out.println("몇개 입력할래?");

        int n = scanner.nextInt();
        System.out.println("몇개마다 띄어쓸래?");
        int w = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("*");
            if (i % w == 0) {
                System.out.println(); // 줄바꿈
            }

        }
    }
}