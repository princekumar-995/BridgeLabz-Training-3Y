import java.util.Scanner;

public class QuotientRemainder {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter number: ");
        int number = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        // Find result
        int[] result = findRemainderAndQuotient(number, divisor);

        // Output
        System.out.println("Quotient: " + result[1]);
        System.out.println("Remainder: " + result[0]);

        sc.close();
    }
}
