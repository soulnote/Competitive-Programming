import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();  
            }
            int min = Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                if(arr[i]>=arr[i-1]){
                    min = Math.min(min, arr[i]-arr[i-1]);
                }
                else{
                    min = Integer.MAX_VALUE;
                    break;
                }
            }
            int ans = (min/2)+1;
            if(min!=Integer.MAX_VALUE){
                System.out.println(ans);
            }
            else{
                System.out.println("0");
            }    
        }
        sc.close();
    }
    
}
