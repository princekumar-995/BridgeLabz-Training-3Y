import java.util.*;

public class ElectricityBill {
    public static double calculateBill(int units) {
        double bill = 0;
        if (units <= 100) {
            bill = units * 1.5;
        } else if (units <= 200) {
            bill = 100 * 1.5 + (units - 100) * 2.5;
        } else if (units <= 300) {
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 3.5;
        } else {
            bill = 100 * 1.5 + 100 * 2.5 + 100 * 3.5 + (units - 300) * 5;
        }
        return bill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double totalBill = calculateBill(units);
        System.out.println("Total Electricity Bill: Rs. " + totalBill);
    }
}
