package interview;

import java.util.Scanner;

public class problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > largest) {
                secondLargest = largest;
                largest = ar[i];
            } else if (secondLargest < ar[i] && largest != ar[i]) {
                secondLargest = ar[i];
            }
            if (ar[i] < smallest) {
                secondSmallest = smallest;
                smallest = ar[i];
            } else if (secondSmallest > ar[i] && smallest != ar[i]) {
                secondSmallest = ar[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
        System.out.println(smallest);
        System.out.println(secondSmallest);
    }
}
