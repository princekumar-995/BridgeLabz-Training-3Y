import java.util.*;

class SubstringCompare {
    // Method to create substring manually using charAt
    public static String mySubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method to compare two strings manually
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.next();
        
        System.out.print("Enter start index: ");
        int start = sc.nextInt();
        
        System.out.print("Enter end index: ");
        int end = sc.nextInt();
        
        String mySub = mySubstring(text, start, end);
        String builtInSub = text.substring(start, end);
        
        System.out.println("Substring using charAt(): " + mySub);
        System.out.println("Substring using substring(): " + builtInSub);
        System.out.println("Are both equal? " + compareStrings(mySub, builtInSub));
    }
}
