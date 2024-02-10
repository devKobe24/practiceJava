package array;

public class Array1Ref1 {

    public static void main(String[] args) {
        int [] students; // int형 배열 변수 선언
        students = new int[5]; // 배열 생성.

        System.out.println(students); //[I@a09ee92의 [I는 int형 배열을 뜻한다. @뒤에 16진수는 참조값을 뜻한다.

        // 배열에 변수 값 대입.
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        // 배열의 사용, 변수 값 사용.
        System.out.println("student1 = " + students[0]);
        System.out.println("student2 = " + students[1]);
        System.out.println("student3 = " + students[2]);
        System.out.println("student4 = " + students[3]);
        System.out.println("student5 = " + students[4]);
    }
}
