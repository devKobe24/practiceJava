package method;

public class Method2 {

  public static void main(String[] args) {
    // 매개변수가 없기 때문에 전달하는 인수,인자도 없다.
    printHeader();
    System.out.println("프로그램이 동작합니다.");
    printFooter();
  }
  // 반환타입과 매개변수가 없는 함수
  public static void printHeader() {
    System.out.println("= 프로그램을 시작합니다 =");
    return;
  }

  public static void printFooter() {
    System.out.println("= 프로그램을 종료합니다 =");
  }
}
