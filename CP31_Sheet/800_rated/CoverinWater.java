import java.util.Scanner;

public class CoverinWater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int count = 0;
            int currCount = 0;
            int sum = 0;
            for(int i=0;i<n;i++){
                char ch = s.charAt(i);
                if(ch=='#'){
                    currCount = 0;
                }
                else{
                    sum++;
                    currCount++;
                    count = Math.max(currCount, count);
                }
            }
            if(count>2){
                System.out.println(2);
            }
            else{
                System.out.println(sum);
            }
        }
        sc.close();
    }
}