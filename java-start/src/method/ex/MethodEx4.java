package method.ex;

import java.util.Scanner;

public class MethodEx4 {

  public static void main(String[] args) {
    int balance = 0;
    bank(balance);
  }

  public static void bank(int balance) {
    while (true) {
      Scanner userInput = new Scanner(System.in);

      System.out.println("--------------------------------------\n1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료\n--------------------------------------");
      System.out.print("선택: ");

      balance = bankService(balance, userInput);
    }
  }

  public static int enterDepositAmount(Scanner userInput) {
    System.out.print("입금액을 입력하세요: ");
    int depositAmount = userInput.nextInt();
    return depositAmount;
  }

  public static int deposit(int balance, int amount) {
    balance += amount;
    System.out.println(amount + "원을 입급하였습니다. 현재 잔액: " + balance + "원");
    return balance;
  }

  public static int enterWithdrawAmount(Scanner userInput) {
    System.out.print("출금액을 입력하세요: ");
    int withdrawAmount = userInput.nextInt();
    return withdrawAmount;
  }

  public static int withdraw(int balance, int withdrawAmount) {
    if (balance >= withdrawAmount) {
      balance -= withdrawAmount;
      System.out.println(withdrawAmount + "원을 출금했습니다. 현재 잔액: " + balance + "원");
    } else {
      System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
    }
    return balance;
  }

  public static int bankService(int balance, Scanner userInput) {
    int userSelect = userInput.nextInt();

    if (userSelect == 1) {
      int depositAmount = enterDepositAmount(userInput);
      balance = deposit(balance, depositAmount);
      return balance;
    } else if (userSelect == 2) {
      int withdrawAmount = enterWithdrawAmount(userInput);
      balance = withdraw(balance, withdrawAmount);
      return balance;
    } else if (userSelect == 3) {
      System.out.println("현재 잔액: " + balance + "원");
      return balance;
    } else if (userSelect == 4) {
      System.out.println("시스템을 종료합니다.");
    } else {
      System.out.println("잘못된 선택입니다.");
    }
    return balance;
  }
}
