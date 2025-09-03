import java.util.*;

class ShortestLongestWord {
    public static int myLength(String str) {
        int count = 0;
        try {
            while (true) { str.charAt(count); count++; }
        } catch (Exception e) {}
        return count;
    }

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
            } else word += ch;
        }
        if (!word.equals("")) words.add(word);
        return words.toArray(new String[0]);
    }

    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(myLength(words[i]));
        }
        return result;
    }

    public static String[] findShortestLongest(String[][] arr) {
        int minLen = Integer.MAX_VALUE, maxLen = Integer.MIN_VALUE;
        String minWord = "", maxWord = "";

        for (String[] row : arr) {
            int len = Integer.parseInt(row[1]);
            if (len < minLen) { minLen = len; minWord = row[0]; }
            if (len > maxLen) { maxLen = len; maxWord = row[0]; }
        }
        return new String[]{minWord, maxWord};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = mySplit(text);
        String[][] table = wordsWithLengths(words);
        String[] result = findShortestLongest(table);

        System.out.println("Shortest Word: " + result[0]);
        System.out.println("Longest Word: " + result[1]);
    }
}
