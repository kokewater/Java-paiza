import java.util.*;

public class Forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int[] a = new int[m];

            for (int j = 0; j < m; j++) {
                a[j] = sc.nextInt();
            }

            int ans = 0;

            for (int j = 0; j < m; j++) {
                if (a[j] == k) {
                    ans += 1;
                }
            }
            
            System.out.println(ans);
        }
    }
}