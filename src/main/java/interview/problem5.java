package interview;

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%10==0){
            System.out.println("divisible by 0");
        }else{
            System.out.println("not divisible by 0");
        }
    }
}
