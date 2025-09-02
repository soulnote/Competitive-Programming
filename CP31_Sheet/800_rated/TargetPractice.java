import java.util.Scanner;

public class TargetPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-- > 0) {
            char[][] grid = new char[10][10];
            for(int i=0; i<10; i++) {
                String line = sc.nextLine();
                grid[i] = line.toCharArray();
            }
            int totalSum = 0;
            for(int i=0; i<10; i++) {
                for(int j=0; j<10; j++) {
                    if(grid[i][j] == 'X') {
                        if(i<5 && j<5) totalSum += Math.min(i+1, j+1);
                        else if(i<5 && j>=5) totalSum += Math.min(i+1, 10-j);
                        else if(i>=5 && j<5) totalSum += Math.min(10-i, j+1);
                        else if(i>=5 && j>=5) totalSum += Math.min(10-i, 10-j);
                    }
                    else continue;
                }
            }
            System.out.println(totalSum);
        }
    }
}
