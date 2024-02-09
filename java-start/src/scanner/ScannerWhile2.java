package scanner;

import java.util.Scanner;

public class ScannerWhile2 {

    public static void main(String[] args) {
        // 내가 짠 코드
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0입력시, 프로그램 종료.");
//
//        while (true) {
//            System.out.print("첫 번째 숫자를 입력해주세요:");
//            int num1 = scanner.nextInt();
//
//            System.out.print("두 번째 숫자를 입력해주세요:");
//            int num2 = scanner.nextInt();
//
//            if (num1 == 0 && num2 == 0) {
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            } else {
//                int sum = num1 + num2;
//                System.out.println("두 숫자의 합: " + sum);
//            }
//        }
        // 영한 쌤께서 짠 코드
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0입력시, 프로그램 종료.");

        while (true) {
            System.out.print("첫 번째 숫자를 입력해주세요:");
            int num1 = scanner.nextInt();

            System.out.print("두 번째 숫자를 입력해주세요:");
            int num2 = scanner.nextInt();

            if (num1 == 0 && num2 == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            // else 문이 있고 없고의 차이 -> 자질구래한 코드가 없음
            // 깔끔함.
            // 딱히 else에 대한 생각을 안해도 됨.
            int sum = num1 + num2;
            System.out.println("두 숫자의 합: " + sum);
        }
    }
}
