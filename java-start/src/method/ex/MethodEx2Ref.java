package method.ex;

public class MethodEx2Ref {

  public static void main(String[] args) {
    String message = "Hello, world!";

    printMessage(message,3);
    printMessage(message,5);
    printMessage(message, 7);
  }

  public static void printMessage(String sendMessage, int times) {
    for (int index = 0; index < times; index++) {
      System.out.println(sendMessage);
    }
  }
}
