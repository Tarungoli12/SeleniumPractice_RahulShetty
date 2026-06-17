package interview;

import java.util.Scanner;

public class problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]>max){
                max = ar[i];
                index = i;
            }
        }
        System.out.println(index);
        System.out.println(max);
    }
}
