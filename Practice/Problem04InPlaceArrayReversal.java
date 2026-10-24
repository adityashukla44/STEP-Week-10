import java.util.Arrays;
import java.util.Scanner;

public class Problem04InPlaceArrayReversal {
    public static void reverseInPlace(int[] values) {
        int left = 0, right = values.length - 1;
        while (left < right) {
            int temp = values[left];
            values[left] = values[right];
            values[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) values[i] = sc.nextInt();
        reverseInPlace(values);
        System.out.println(Arrays.toString(values));
    }
}
