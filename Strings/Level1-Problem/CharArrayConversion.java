import java.util.*;

class CharArrayConversion {
    // Method to convert string to char array manually
    public static char[] myToCharArray(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Compare two char arrays
    public static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String text = sc.next();
        
        char[] myArray = myToCharArray(text);
        char[] builtInArray = text.toCharArray();
        
        System.out.println("Both arrays equal? " + compareArrays(myArray, builtInArray));
    }
}
