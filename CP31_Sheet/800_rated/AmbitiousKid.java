import java.util.Scanner;

public class AmbitiousKid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            if(arr[i] ==0) {
                min = 0;
                break;
            } 
            else{
                int a =(int) Math.abs(arr[i]);
                min = Math.min(min, a);
            }
        }
        System.out.print(min);
        sc.close();
    }
}
