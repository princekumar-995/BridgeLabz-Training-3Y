import java.util.*;

class Multiplication6to9 {
    public static void main(String[] args) {
        int[] result = new int[4 * 10]; 
        int idx = 0;

        for (int num = 6; num <= 9; num++) {
            for (int i = 1; i <= 10; i++) {
                result[idx++] = num * i;
                System.out.println(num + " * " + i + " = " + (num * i));
            }
            System.out.println();
        }
    }
}
