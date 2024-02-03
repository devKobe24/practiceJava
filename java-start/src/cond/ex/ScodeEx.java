package cond.ex;

public class ScodeEx {

    public static void main(String[] args) {
        /*
        내가 짠 코드
        int score = 85;
        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80 || 90 < score) {
            grade = "B";
        } else if (score >= 70 || 80 > score) {
            grade = "C";
        } else if (score >= 60 || 70 > score) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("학점은 " + grade + "입니다.");
         */
        // 영한님 코드
        int score = 85;

        if (score >= 90) {
            System.out.println("학점은 A입니다.");
        } else if (score >= 80) {
            System.out.println("학점은 B입니다.");
        } else if (score >= 70) {
            System.out.println("학점은 C입니다.");
        } else if (score >= 60) {
            System.out.println("학점은 D입니다.");
        } else {
            System.out.println("학점은 F입니다.");
        }
    }
}
