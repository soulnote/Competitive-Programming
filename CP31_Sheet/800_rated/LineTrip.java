import java.util.Arrays;
import java.util.Scanner;

public class LineTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt() +2;
            int x = sc.nextInt();
            int[] arr = new int[n];
            arr[0] = 0;
            arr[n-1] = x;
            for(int i=1;i<n-1;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int diff = arr[0];
            int pre = arr[0];
            for(int i=1;i<n;i++){
              if(i==n-1){
                int dist = (arr[i]-pre)*2;
                if(diff<dist){
                  diff = dist;
                }
              }
              else{
                if(diff<(arr[i]-pre)){
                  diff = arr[i] - pre;
                }
              }
              pre = arr[i];
            }
            System.out.println(diff);
            
        }
        sc.close();
    }
}
