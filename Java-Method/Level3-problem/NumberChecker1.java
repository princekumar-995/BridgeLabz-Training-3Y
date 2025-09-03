import java.util.Arrays;
import java.util.Random;

public class FootballTeamHeights {

    // Generate 11 random heights in [150, 250]
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150..250 inclusive
        }
        return heights;
    }

    // Sum of array
    public static int sum(int[] arr) {
        int s = 0;
        for (int v : arr) s += v;
        return s;
    }

    // Mean of array
    public static double mean(int[] arr) {
        if (arr.length == 0) return 0.0;
        return sum(arr) / (double) arr.length;
    }

    // Shortest (min)
    public static int shortest(int[] arr) {
        int mn = Integer.MAX_VALUE;
        for (int v : arr) if (v < mn) mn = v;
        return mn;
    }

    // Tallest (max)
    public static int tallest(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int v : arr) if (v > mx) mx = v;
        return mx;
    }

    // Pretty print helper
    public static void printArray(String label, int[] arr) {
        System.out.println(label + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // 1) Create heights array of size 11 with random 3-digit heights (150–250)
        int[] heights = generateHeights(11);

        // 2) Compute required stats
        int total = sum(heights);
        double avg = mean(heights);
        int minH = shortest(heights);
        int maxH = tallest(heights);

        // 3) Display results
        printArray("Heights (cm): ", heights);
        System.out.println("Sum of heights: " + total + " cm");
        System.out.printf("Mean height: %.2f cm%n", avg);
        System.out.println("Shortest height: " + minH + " cm");
        System.out.println("Tallest height: " + maxH + " cm");
    }
}
