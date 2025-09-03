import java.util.*;

public class EmployeeBonus {
    public static double calculateBonus(double salary, int years) {
        double bonus = 0;
        if (years > 10) {
            bonus = salary * 0.12;
        } else if (years >= 6) {
            bonus = salary * 0.10;
        } else {
            bonus = salary * 0.08;
        }
        return bonus;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int years = sc.nextInt();

        double bonus = calculateBonus
