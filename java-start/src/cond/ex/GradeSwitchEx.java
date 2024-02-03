package cond.ex;

public class GradeSwitchEx {

    public static void main(String[] args) {
        // 방법 1
        String grade = "A";

        switch (grade) {
            case "A":
                System.out.println("탁월한 성과입니다!");
                break;
            case "B":
                System.out.println("좋은 성과입니다!");
                break;
            case "C":
                System.out.println("준수한 성과입니다!");
                break;
            case "D":
                System.out.println("향상이 필요합니다.");
                break;
            case "F":
                System.out.println("불합격입니다.");
                break;
            default:
                System.out.println("잘못된 학점입니다.");
        }

        // 방법 2
        String grade2 = "C";
        switch (grade2) {
            case "A" -> System.out.println("탁월한 성과입니다!");
            case "B" -> System.out.println("좋은 성과입니다!");
            case "C" -> System.out.println("준수한 성과입니다!");
            case "D" -> System.out.println("향상이 필요합니다.");
            case "F" -> System.out.println("불합격입니다.");
            default -> System.out.println("잘못된 학점입니다.");
        }
    }
}
