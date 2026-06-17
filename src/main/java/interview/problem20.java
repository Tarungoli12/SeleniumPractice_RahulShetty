package interview;

import java.util.Scanner;

public class problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (k == ar[i] - ar[j] || k == ar[j] - ar[i]) System.out.println(ar[i] + " " + ar[j]);
            }
        }
    }
}
