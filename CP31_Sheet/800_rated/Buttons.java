import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(c%2!=0){
                a+=1;
            }
            if(a > b){
                System.out.println("First");
            }
            else {
                System.out.println("Second");
            }
        }
        sc.close();
    }
}
