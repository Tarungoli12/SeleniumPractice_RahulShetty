package interview;

import java.util.Scanner;

public class problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int max = Math.max(Math.max(a,b),Math.max(c,d));
        System.out.println(max);

    }
}
