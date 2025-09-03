import java.util.*;

public class CurrencyConverter {
    static final double USD_TO_INR = 83.5; // Example rate

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. USD to INR");
        System.out.println("2. INR to USD");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount in USD: ");
            double usd = sc.nextDouble();
            double inr = usd * USD_TO_INR;
            System.out.println("Amount in INR = " + inr);
        } else if (choice == 2) {
            System.out.print("Enter amount in INR: ");
            double inr = sc.nextDouble();
            double usd = inr / USD_TO_INR;
            System.out.println("Amount in USD = " + usd);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
