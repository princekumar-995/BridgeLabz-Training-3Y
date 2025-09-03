import java.util.*;

class RowColSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[3][3];

        System.out.println("Enter 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Row-wise sum:");
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += mat[i][j];
            }
            System.out.println("Row " + (i+1) + " = " + sum);
        }

        System.out.println("Column-wise sum:");
        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum += mat[i][j];
            }
            System.out.println("Column " + (j+1) + " = " + sum);
        }
    }
}
