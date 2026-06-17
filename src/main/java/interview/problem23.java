package interview;

import java.util.Arrays;
import java.util.Scanner;

public class problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        Arrays.sort(ar);
        if (n == 1 || ar[0] != ar[1]) {
            System.out.println(ar[0]);
            return;
        }
        for (int i = 1; i < n - 1; i++) {
            if (ar[i] != ar[i - 1] && ar[i] != ar[i + 1]) {
                System.out.println(ar[i]);
                return;
            }
        }
        if (ar[n - 1] != ar[n - 2]) {
            System.out.println(ar[n - 1]);
        }
    }
}
