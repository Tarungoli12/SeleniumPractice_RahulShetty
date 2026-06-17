package interview;

import java.util.Scanner;

public class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%100==53){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}
