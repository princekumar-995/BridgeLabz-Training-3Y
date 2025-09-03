import java.util.*;

class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];

        System.out.println("Enter 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum += mat[i][i];
        }

        System.out.println("Diagonal Sum = " + sum);
    }
}
