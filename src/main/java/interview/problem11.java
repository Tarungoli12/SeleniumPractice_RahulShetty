package interview;

import java.util.Scanner;

public class problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double circle = (2 * 3.142) * n;
        System.out.println(circle);
        System.out.printf("%.2f", circle);
    }
}
