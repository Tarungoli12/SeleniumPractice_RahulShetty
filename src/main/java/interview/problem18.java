package interview;

import java.util.Scanner;

public class problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > largest) {
                secondLargest = largest;
                largest = ar[i];
            } else if (secondLargest < ar[i] && largest!=ar[i]) {
                secondLargest = ar[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}
