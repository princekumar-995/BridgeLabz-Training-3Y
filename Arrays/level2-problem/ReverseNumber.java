import java.util.*;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String str = String.valueOf(num);
        char[] arr = str.toCharArray();

        System.out.print("Reversed number = ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}
