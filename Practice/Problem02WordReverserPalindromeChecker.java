import java.util.Scanner;

public class Problem02WordReverserPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String word = sc.next();
            String reversed = new StringBuilder(word).reverse().toString();
            String status = word.equalsIgnoreCase(reversed) ? "palindrome" : "not a palindrome";
            System.out.println(reversed + " - " + status);
        }
    }
}
