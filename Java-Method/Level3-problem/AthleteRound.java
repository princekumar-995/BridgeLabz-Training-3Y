import java.util.Scanner;

public class AthleteRounds {

    // Method to calculate rounds
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km = 5000 meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 3 sides of triangle
        System.out.print("Enter side 1: ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double side3 = sc.nextDouble();

        // Calculate
        double rounds = calculateRounds(side1, side2, side3);

        // Output
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to cover 5 km.");

        sc.close();
    }
}
