package interview;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%3==0 && n%5==0){
            System.out.println("Given no is divisible by 3 and 5");
        }else{
            System.err.println("Given no is not divisible by 3 and 5");

        }
    }
}
