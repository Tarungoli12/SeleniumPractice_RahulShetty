package interview;

import java.util.Scanner;

public class problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        int noOfOccurrence = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
                noOfOccurrence = 1;
            } else if (max == ar[i]) {
                noOfOccurrence++;
            }
        }
        System.out.println("max value = " + max + ", repetitions = " + noOfOccurrence);
    }
}
