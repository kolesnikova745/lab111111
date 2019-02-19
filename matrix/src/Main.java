/**
 * Created by Anna Kolesnikova on 19.02.2019.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter n:");
//        int n = sc.nextInt();
        int n = 4;
       // sc.close();
        int[][] matrixA  = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][i] = 1;
                matrixA[i][n - i - 1] = 1;
                System.out.print(matrixA[i][j] + "   ");
            }
            System.out.println();
        }

    }
}
