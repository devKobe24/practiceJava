package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

  // 영한 쌤께서 짜신 코드 보고 리팩토링.
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("입력받을 숫자의 개수를 입력하세요: ");
    int intputNumber = input.nextInt();

    int[] scores = new int[intputNumber];
    int total = 0;
    Double average = 0.0;

    System.out.println(intputNumber + "개의 정수를 입력하세요:");
    for (int i = 0; i < scores.length; i++) {
      scores[i] = input.nextInt();

      total += scores[i];
    }

    average = (double) total / scores.length;
    System.out.println("입력한 정수의 합계: " + total);
    System.out.println("입력한 정수의 평균: " + average);
  }
}
