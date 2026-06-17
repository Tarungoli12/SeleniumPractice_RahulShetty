package interview;

import java.util.Scanner;

public class problem21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        int count = 1;
        for (int i = 0; i < ar.length - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                count++;
            } else {
                System.out.println(ar[i] + "->" + count);
                count = 1;
            }
        }
        System.out.println(ar[ar.length - 1] + "->" + count);
    }
}
