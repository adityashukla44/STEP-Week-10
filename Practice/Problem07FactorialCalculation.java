import java.math.BigInteger;
import java.util.Scanner;

public class Problem07FactorialCalculation {
    public static BigInteger factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Factorial is undefined for negative integers.");
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) System.out.println(factorial(sc.nextInt()));
    }
}
