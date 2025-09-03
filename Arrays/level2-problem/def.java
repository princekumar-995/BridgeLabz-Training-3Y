import java.util.*;

class PosNegConvert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Converted Array:");
        for (int i = 0; i < 10; i++) {
            arr[i] = -arr[i]; // sign change
            System.out.print(arr[i] + " ");
        }
    }
}
