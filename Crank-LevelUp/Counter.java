import java.util.*;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();

        int[] paiza = { 0, 1, 1 };
        int[] monster = { 0, 1, 1 };
        int dmg = 2;
        int times = 2;

        while (dmg < h) {
            paiza[0] = paiza[1];
            paiza[1] = paiza[2];
            monster[0] = monster[1];
            monster[1] = monster[2];

            paiza[2] = monster[0] + monster[1];
            monster[2] = paiza[0] + paiza[1] * 2;

            dmg += monster[2];

            times += 1;
        }

        System.out.println(times);
    }
}