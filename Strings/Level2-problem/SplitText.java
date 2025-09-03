import java.util.*;

class SplitText {
    // custom length function
    public static int myLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    // split using charAt
    public static String[] mySplit(String str) {
        int n = myLength(str);
        List<String> words = new ArrayList<>();
        String word = "";

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (!word.equals("")) {
                    words.add(word);
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        if (!word.equals("")) {
            words.add(word);
        }
        return words.toArray(new String[0]);
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] myWords = mySplit(text);
        String[] builtInWords = text.split(" ");

        System.out.println("Custom Split: " + Arrays.toString(myWords));
        System.out.println("Built-in Split: " + Arrays.toString(builtInWords));
        System.out.println("Are both same? " + compareArrays(myWords, builtInWords));
    }
}
