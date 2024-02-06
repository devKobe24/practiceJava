package loop.ex;

public class ForEx2 {
    // 내가 만든 코드
    /*public static void main(String[] args) {
        int num = 0;

        for (int count = 1; count <= 10; count ++) {
            num += 2;
            System.out.println(num);
        }
    }*/

    // 영한님 풀이1
    // 좋은 코드라고 생각하지 않는다고 말씀하심.
    /*public static void main(String[] args) {
        for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);
        }
    }*/

    // 영한님 풀이2
    // 이 코드가 더 낫다고 하심.
    // for (초기식; 조건식; 증감식) 이렇게 괄호안에 구조에 알맞은 식을 넣어줘야 번잡하지 않다.
    public static void main(String[] args) {
        int num = 2;
        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }
    }
}
