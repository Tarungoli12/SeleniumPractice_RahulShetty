package interview;

import java.util.Scanner;

public class problem25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        System.out.print(ar[0]);
        for (int i = 1; i < n; i++) {
            if (ar[i] % 2 != 0 && ar[i - 1] % 2 != 0) {
                System.out.print("*" + ar[i]);
            } else if (ar[i] % 2 == 0 && ar[i - 1] % 2 == 0) {
                System.out.print("#" + ar[i]);
            } else {
                System.out.print("$" + ar[i]);
            }
        }
    }
}
