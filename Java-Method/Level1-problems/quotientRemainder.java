import java.util.*;

class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int div = sc.nextInt();
        int[] res = findRemainderAndQuotient(num, div);
        System.out.println("Quotient: " + res[0] + ", Remainder: " + res[1]);
    }
}
