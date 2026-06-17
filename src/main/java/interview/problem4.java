package interview;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%3==0 && n%5==0 && n%7==0){
            System.out.println("given no is divisible by 3 , 5 and 7");
        }else{
            System.err.println("given no is not divisible by 3 , 5 and 7");
        }
    }
}
