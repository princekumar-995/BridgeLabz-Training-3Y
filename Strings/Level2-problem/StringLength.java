import java.util.*;

class StringLength {
    public static int myLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // end of string reached
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.next();

        int myLen = myLength(str);
        int builtInLen = str.length();

        System.out.println("Length using charAt(): " + myLen);
        System.out.println("Length using built-in: " + builtInLen);
    }
}
