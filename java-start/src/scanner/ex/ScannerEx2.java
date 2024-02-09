package scanner.ex;

import java.util.Scanner;

public class ScannerEx2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int userInput = scanner.nextInt();
        if (userInput % 2 == 0) {
            System.out.print("입력한 숫자 "+userInput+"는 짝수입니다.");
        } else {
            System.out.print("입력한 숫자 "+userInput+"는 홀수입니다.");
        }
    }
}
