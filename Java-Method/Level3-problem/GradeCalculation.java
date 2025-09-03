import java.util.*;

public class StudentGrade {
    public static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A+";
        else if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else return "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of 5 subjects (out of 100): ");
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += sc.nextInt();
        }

        double percentage = sum / 5.0;
        String grade = calculateGrade(percentage);

        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
