
import java.util.Scanner;

public class HowMuchDoesDaytonaCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            int[]freq = new int[101];
            for(int i=0; i<n; i++) {
                freq[arr[i]]++;
            }
            if(freq[k] > 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }

        }
        sc.close();
    }
}
