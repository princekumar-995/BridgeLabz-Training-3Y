import java.util.*;

class Copy2Dto1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and cols: ");
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] array = new int[rows * cols];
        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[idx++] = matrix[i][j];
            }
        }

        System.out.println("1D Array:");
        for (int val : array) System.out.print(val + " ");
    }
}
