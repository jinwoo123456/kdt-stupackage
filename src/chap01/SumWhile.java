package chap01;

import java.util.Scanner;

public class SumWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 4번 입력");

        int 입력숫자 = 3;

        int i = 0;
        int 누적합 = 0;
        while (i <= 입력숫자) {
            누적합 += scanner.nextInt();

            i++;

        }
        System.out.println("누적 합은 " + 누적합);

    }

}
