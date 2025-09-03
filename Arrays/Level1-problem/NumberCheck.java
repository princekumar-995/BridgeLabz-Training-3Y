import java.util.*;

class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is Positive and Even");
                else
                    System.out.println(num + " is Positive and Odd");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        if (arr[0] == arr[arr.length - 1])
            System.out.println("First and last are equal");
        else if (arr[0] > arr[arr.length - 1])
            System.out.println("First is greater than last");
        else
            System.out.println("First is less than last");
    }
}
