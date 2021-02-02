import java.util.Scanner;

class PlusOrMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();
        long sum = 0;

        for (int i = 0; i < times; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (n == m) {
                sum += n * m;
            } else {
                sum += (n + m);
            }
        }

        System.out.println(sum);
    }
}