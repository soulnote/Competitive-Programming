import java.util.Scanner;

public class ArrayColoring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int odds = 0, even = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(arr[i]%2==0)even++;
                else odds++;
            }
            odds = odds%2;
            even = even%2;
            if(odds==0 && even==0)System.out.println("YES");
            else if (odds==0  && even ==1) {
                System.out.println("Yes");
            }
            else System.out.println("No");

        }
        sc.close();
    }
    
}
