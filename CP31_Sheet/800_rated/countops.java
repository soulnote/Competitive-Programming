import java.util.Scanner;

public class countops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();
            
            String cur = x;
            int ans = -1;
            
            // Try at most 6 times (enough since n*m ≤ 25)
            for (int ops = 0; ops <= 6; ops++) {
                if (cur.contains(s)) {
                    ans = ops;
                    break;
                }
                cur = cur + cur; // operation
            }
            
            System.out.println(ans);
        }
        sc.close();
    }
}
