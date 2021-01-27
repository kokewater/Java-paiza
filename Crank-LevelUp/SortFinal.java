import java.util.*;


public class SortFinal.java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        String[] sg = new String[n];

        for (int i = 0; i < n; i++) {
            String g = sc.next();
            String s = sc.next();

            if (g.length() == 1) {
                g = "0" + g;
            }

            if (s.length() == 1) {
                s = "0" + s;
            }
            
            sg[i] = s + g;
        }

        Arrays.sort(sg, Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            System.out.println(Integer.parseInt(sg[i].substring(2,4)) + " " + Integer.parseInt(sg[i].substring(0,2)));
        }
    }
}