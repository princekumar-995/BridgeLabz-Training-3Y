import java.util.*;

public class CalendarProgram {
    static String[] months = {"January","February","March","April","May","June","July","August",
                              "September","October","November","December"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    public static boolean isLeap(int year) {
        return (year%400==0 || (year%4==0 && year%100!=0));
    }

    public static int getFirstDay(int month, int year) {
        int d = 1;
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (d + x + (31*m)/12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (isLeap(year)) days[1] = 29;
        else days[1] = 28;

        System.out.println("\n   " + months[month-1] + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDay(month, year);
        for (int i = 0; i < firstDay; i++) System.out.print("    ");

        for (int d=1; d <= days[month-1]; d++) {
            System.out.printf("%3d ", d);
            if ((d+firstDay) % 7 == 0) System.out.println();
        }
    }
}
