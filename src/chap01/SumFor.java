package chap01;

import java.util.Scanner;

public class SumFor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int 입력숫자 = 100;
        System.out.println("숫자를 입력하세요~");
        int 누적합 = 0;

        for (int i = 1; i <= 입력숫자; i++) {

            누적합 += scanner.nextInt();

            if (누적합 > 1000) {

                System.out.println("넌 " + 누적합 + "만큼 입력했어 그만 입력해라.");
                break;
            }

        }
    }

}
