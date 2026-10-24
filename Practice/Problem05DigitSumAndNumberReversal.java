import java.util.Scanner;

public class Problem05DigitSumAndNumberReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        if (number < 0) throw new IllegalArgumentException("Enter a non-negative integer.");
        long remaining = number, sum = 0, reversed = 0;
        do {
            long digit = remaining % 10;
            sum += digit;
            reversed = reversed * 10 + digit;
            remaining /= 10;
        } while (remaining > 0);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + reversed);
    }
}
