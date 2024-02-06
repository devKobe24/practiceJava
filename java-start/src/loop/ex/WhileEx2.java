package loop.ex;

public class WhileEx2 {
    // 내가 만든 코드
   /* public static void main(String[] args) {
        int num = 1;
        int countUp = 1;
        while (num < 20) {
            num = countUp * 2;
            System.out.println(num);
            countUp++;
        }
    }*/

    // 영한님 코드 풀이
    // 내가 느낀점 : 훨씬 읽기 편하고, 간결하다.
    public static void main(String[] args) {
        int num = 2;
        int count = 1;

        while (count <= 10) {
            System.out.println(num);
            num += 2;
            count ++;
        }
    }
}
