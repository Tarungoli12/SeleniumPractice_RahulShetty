package interview;

import java.util.Scanner;

public class problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        int totalSum = 0;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            totalSum += ar[i];
            if (ar[i] < minValue) {
                minValue = ar[i];
            }
            if (ar[i] > maxValue) {
                maxValue = ar[i];
            }
        }
        System.out.println("Max sum = " + (totalSum - minValue));
        System.out.println("Min sum = " + (totalSum - maxValue));
    }
}
