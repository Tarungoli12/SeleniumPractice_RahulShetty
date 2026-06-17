package interview;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        Arrays.sort(ar);
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (ar[i] != ar[i + 1]) {
                ar[j] = ar[i];
                j++;
            }
        }
        ar[j] = ar[ar.length - 1];
        for (int i = 0; i <= j; i++) {
            System.out.println(ar[i]);
        }
    }

    public void removeDuplicateUsingSet() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        Set<Integer> set = new LinkedHashSet<>();
        for (int a : ar) {
            set.add(a);
        }
        set.forEach(System.out::println);
    }

    public void removeDuplicateUsingStreams() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        int result[] = Arrays.stream(ar).distinct().toArray();
        Arrays.stream(result).forEach(System.out::println);
    }
}
