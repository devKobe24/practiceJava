package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
  /* 내가 짠 코드
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] inputNumbers = new int[5];

    System.out.println("5개의 정수를 입력하세요: ");
    for (int i = 0; i < 5; i++) {
      int number = input.nextInt();
      inputNumbers[i] = number;
    }
    System.out.println("출력");
    for (int number: inputNumbers) {
      System.out.print(number + ",");
    }
  }
   */

  // 영한쌤 코드
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int [] numbers = new int[5];

    System.out.println("5개의 정수를 입력하세요:");
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }

    System.out.println("출력");
    for (int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i]);
      if (i < numbers.length - 1) {
        System.out.print(", ");
      }
    }
  }
}
