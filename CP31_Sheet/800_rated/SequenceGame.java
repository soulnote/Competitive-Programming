import java.util.ArrayList;
import java.util.Scanner;

public class SequenceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();       
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i =0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            ArrayList<Integer> list = new ArrayList<>();
            list.add(arr[0]);
            int idx = 1;
            while(idx<n){
                if(list.get(list.size()-1) <= arr[idx]){
                    list.add(arr[idx]);
                }
                else{
                    list.add(arr[idx]);
                    list.add(arr[idx]);
                }
                idx++;
            }
            System.out.println(list.size());
            for(int i=0;i<list.size();i++){
                System.out.print(list.get(i) + " ");
            }
        }
    }
}
// 6
// 3
// 4 6 3
// 3
// 1 2 3
// 5
// 1 7 9 5 7
// 1
// 144
// 2
// 1 1
// 5
// 1 2 2 1 1
