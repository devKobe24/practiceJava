package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int paymentCost = 0;
        int totalCost = 0;

        while (true) {
            //3 가지 옵션 1. 상품 입력, 2. 결제, 3. 프로그램 종료
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();
            input.nextLine();

            totalCost = 0;

            if (option == 1) {
                System.out.print("상품명을 입력하세요: ");
                String productName = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int productPrice = input.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int productQuantity = input.nextInt();

                totalCost += productPrice * productQuantity;

                System.out.println("상품명:" + productName + " 가격:" + productPrice + " 수량:" + productQuantity + " 합계:" + totalCost);
                paymentCost += totalCost;
                continue;
            } else if (option == 2) {
                System.out.println("총 비용: " + paymentCost);
                paymentCost = 0;
                continue;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                totalCost = 0;
                paymentCost = 0;
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
                continue;
            }
        }
    }
}
