package array.ex;

import java.util.Scanner;

public class ProductAdminEx_YounghanT {

  public static void main(String[] args) {
    // 최대 상품 등록 갯수를 변수로 미리 등록해둔다. -> 여기서 나와 영한쌤의 차이점.
    // 변수에 넣어두면 유연한 베열 크기를 만들수 있겠다. -> array list 사용하면 된다.
    // 또한 공통으로 사용 가능
    int maxProducts = 10;
    String[] productNames = new String[maxProducts];
    int [] productPrices = new int[maxProducts];
    // 상품이 등록 될 때마다 count 증가, 10개 증 maxProducts를 넘으면 더이상 상품 등록이 안되도록
    // maxProducts 변수의 필요성, 활용도가 상품 등록 limit에도 영향을 끼친다. -> 나는 정적으로 10이라는 숫자로 넣어줘서 굉장히 긴 코드가 작성되었다.
    int productCount = 0;

    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
      int menu = scanner.nextInt();
      // scanner.nextLine(); 코드가 작성된 이유는 바로 윗 라인의 scanner.nextInt(); 때문이다.
      // scanner.nextInt();의 nextInt()의 경우 예를 들어 사용자의 입력 중 10을 받았을 경우 원래 '10\n'을 받는다.
      // 하지만 nextInt()는 이 '10\n'에서 '\n' 줄바꿈 문자를 빼고 오직 숫자인 '10'만 가져간다.
      // 때문에 남은 '\n' 줄바꿈 문자는 코드 흐름상 아래로 넘어가게 되므로 scanner.nextLine();이 받아줘야 한다.
      // 다시 말해 nextLine()는 문자 + 줄바꿈 문자도 받아가기 때문에 nextLine();을 사용하여 '\n'을 받아준다.
      scanner.nextLine();
      if (menu == 1) {

        if (productCount >= maxProducts) {
          System.out.println("더 이상 상품을 등록할 수 없습니다.");
          continue;
        }

        System.out.print("상품 이름을 입력하세요:");
        // 무한루프를 돌면서 사용자의 String 데이터형 입력을 받아 index 0부터 차례대로 넣어준다.
        productNames[productCount] = scanner.nextLine();

        System.out.print("상품 가격을 입력하세요:");
        // 무한루프를 돌면서 사용자의 Int 데이터형 입력을 받아 index 0부터 차례대로 넣어준다.
        productPrices[productCount] = scanner.nextInt();

        // 루프 내부 모든 로직을 다 수행하면 productCount를 증가시켜 다음 index에 데이터를 넣을 수 있도록 한다.
        productCount++;
      } else if (menu == 2) {
        if (productCount == 0) {
          System.out.println("등록된 상품이 없습니다.");
          continue;
        }
        for (int i = 0; i < productCount; i++) {
          System.out.println(productNames[i] + ": " + productPrices[i] + "원");
        }
      } else if (menu == 3) {
        System.out.println("프로그램을 종료합니다.");
        break;
      } else {
        System.out.println("잘못된 입력입니다.");
      }
    }
  }
}
