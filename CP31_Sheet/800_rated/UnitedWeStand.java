import java.util.Arrays;
import java.util.Scanner;

public class UnitedWeStand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            int same = 0;
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                if(i>0 && arr[i] == arr[i-1]){
                    same++;
                }
            }
            Arrays.sort(arr);
            if(same == n-1)System.out.println("-1");
            else{
                int idx = 1;
                while(idx<n && arr[idx] == arr[idx-1]){
                    idx++;
                }
                System.out.print(idx + " ");
                System.out.print(n-idx);
                System.out.println();
                for(int i=0;i<idx;i++){
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                for(int i=idx;i<n;i++){
                    System.out.print(arr[i] + " ");
                }

            }

        }
    }
}
// 5
// 3
// 2 2 2
// 5
// 1 2 3 4 5
// 3
// 1 3 5
// 7
// 1 7 7 2 9 1 4
// 5
// 4 8 12 12 4
