
import java.util.*;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int pre = -1;
            boolean sorted = true;
            for(int i=0;i<n;i++){
                if(arr[i]<pre){
                    sorted = false;
                    break;
                }
                pre = arr[i];
            }
            if(sorted){
                System.out.println("Yes");

            }
            else{
                if(k<=1)System.out.println("No");
                else System.out.println("Yes");
            }
        }
        sc.close();
    }
}
