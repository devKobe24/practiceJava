package array.ex;

import java.util.Scanner;

public class ProductAdminEx_Minseong {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] productNames = new String[10];
    int[] productPrices = new int[10];
    int productCount = 0;

    while (true) {
      System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
      System.out.print("메뉴를 선택하세요:");
      int userInput = scanner.nextInt();
      scanner.nextLine();
      if (productCount < 10) {
        if (userInput == 1) {
          System.out.print("상품 이름을 입력하세요:");
          String productName = scanner.nextLine();
          productNames[productCount] = productName;

          System.out.print("상품 가격을 압력하세요:");
          int productPrice = scanner.nextInt();
          productPrices[productCount] = productPrice;

          ++productCount;
          continue;
        } else if (userInput == 2) {
          for (int i = 0; i < productNames.length; i++) {
            if (i <= 0) {
              System.out.println("등록된 상품이 없습니다.");
              continue;
            } else {
              if (productNames[i] != null) {
                System.out.println(productNames[i] + ":" + productPrices[i] + "원");
              }
            }
          }
        } else if (userInput == 3) {
          System.out.println("프로그램을 종료합니다.");
          break;
        }
      } else if (productCount >= 10 && userInput == 1) {
        System.out.println("더 이상 상품을 등록할 수 없습니다.");
      } else if (productCount >= 10 && userInput == 2) {
        for (int i = 0; i < productNames.length; i++) {
          if (i <= 0) {
            System.out.println("등록된 상품이 없습니다.");
            continue;
          } else {
            if (productNames[i] != null) {
              System.out.println(productNames[i] + ":" + productPrices[i] + "원");
            }
          }
        }
      } else if (productCount >= 10 && userInput == 3) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }
    }
  }
}
