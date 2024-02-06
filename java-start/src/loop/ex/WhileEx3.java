package loop.ex;

public class WhileEx3 {
    // 영한님 풀이
    public static void main(String[] args) {
        int max = 100;

        int sum = 0;
        int i = 1;

        while (i <= max) {
            sum += i;
            System.out.println("sum = "+ sum + " i = "+ i);
            i++;
        }
        System.out.println(sum);
    }
}
