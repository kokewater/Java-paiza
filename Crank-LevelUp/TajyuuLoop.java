import java.util.*;

public class TajyuuLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        String[] c = new String[m];

        for (int i = 0; i < m; i++) {
            c[i] = sc.next();
        }

        int n = sc.nextInt();
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (s[j].contains(c[i])) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}