import java.util.Scanner;

public class MaximumHandshakes {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculate
        int handshakes = calculateHandshakes(numberOfStudents);

        // Output
        System.out.println("Maximum number of possible handshakes: " + handshakes);

        sc.close();
    }
}
