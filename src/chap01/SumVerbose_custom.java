package chap01;

import java.util.Scanner;

public class SumVerbose_custom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("짝,홀수 계산기: 숫자를 입력하세요");

        int a = scanner.nextInt();

        boolean i = true;

        while (i) {

            if (a / 2 == 0) {

                System.out.println("짝수");
                break;
            } else {
                System.out.println("홀수임");
                break;
            }
        }

    }
}
