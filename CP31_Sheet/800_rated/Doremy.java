import java.util.*;

public class Doremy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
                freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            }
            if(n == 2 || freq.size() == 1) {
                System.out.println("Yes");
            } else if(freq.size() == 2) {
                // Check if counts differ by at most 1
                Iterator<Integer> it = freq.values().iterator();
                int a = it.next();
                int b = it.next();
                if(Math.abs(a - b) <= 1) System.out.println("Yes");
                else System.out.println("No");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
