package interview;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%2==0){
            System.out.println("even number");
        }else {
            System.out.println("not even number");
        }
    }
}
