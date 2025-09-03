import java.util.Scanner;

public class SumNaturalNumbers {

    // Method to calculate sum of n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input n
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        // Calculate sum
        int sum = calculateSum(n);

        // Output
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        sc.close();
    }
}
