import java.util.Scanner;

public class ForbiddenInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int x = scanner.nextInt();
            if (x != 1) {
                System.out.println("YES");
                System.out.println(n);
                for (int i = 0; i < n; i++) {
                    System.out.print("1 ");
                }
                System.out.println();
            }
            else{
                if(k == 1){
                    System.out.println("NO");
                }
                else if(n % 2 == 0){
                    System.out.println("YES");
                    System.out.println(n / 2);
                    for(int i = 0; i < n / 2; i++){
                        System.out.print("2 ");
                    }
                    System.out.println();
                }
                else if(k >= 3){
                    System.out.println("YES");
                    System.out.println((n - 3) / 2 + 1);
                    System.out.print("3 ");
                    for(int i = 0; i < (n - 3) / 2; i++){
                        System.out.print("2 ");
                    }
                    System.out.println();
                }
                else{
                    System.out.println("NO");
                }
            }
    }
    scanner.close();
    }
}
