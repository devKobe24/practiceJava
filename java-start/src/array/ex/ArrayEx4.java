package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

  // 영한 쌤께서 짜신 코드 보고 리팩토링.
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int[] scores = new int[5];
    int total = 0;
    Double average = 0.0;

    System.out.println("5개의 정수를 입력하세요:");
    for (int i = 0; i < scores.length; i++) {
      scores[i] = input.nextInt();
      // 아래 for문을 또 만들 필요없이 여기서 아래 코드로 해결함.
      total += scores[i];
    }
    // 이 for문 삭제함.
//    for (int j = 0; j < scores.length; j++) {
//      total += scores[j];
//    }
    average = (double) total / scores.length;
    System.out.println("입력한 정수의 합계: " + total);
    System.out.println("입력한 정수의 평균: " + average);
  }

}
