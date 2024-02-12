package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
  /* 내가 짠 코드
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("입력받을 숫자의 개수를 입력하세요:");
    int count = scanner.nextInt();

    int[] numbers = new int[count];
    System.out.println(count + "개의 정수를 입력하세요:");


    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = scanner.nextInt();
    }
    int min = numbers[0];
    int max = numbers[numbers.length - 1];

    System.out.println("가장 작은 정수: " + min);
    System.out.println("가장 큰 정수: " + max);
  }
   */

  // 영한쌤이 짠 코드
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("입력 받을 숫자의 개수를 입력하세요:");
    int n = scanner.nextInt();

    int [] numbers = new int[n];
    int minNumber, maxNumber;

    System.out.println(n + "개의 정수를 입력하세요:");
    for (int i = 0; i < n; i++) {
      numbers[i] = scanner.nextInt();
    }

    minNumber = numbers[0];
    maxNumber = numbers[0];
    // 배열의 두 번째 항목 (i 가 1)과 첫 번째 항목(i 가 0)인 항목을 비교
    for (int i = 1; i < n; i++) {
      if (numbers[i] < minNumber) {
          minNumber = numbers[i];
      }
      if (numbers[i] > maxNumber) {
          maxNumber = numbers[i];
      }
    }

    System.out.println("가장 작은 정수: " + minNumber);
    System.out.println("가장 큰 정수: " + maxNumber);
  }
}
