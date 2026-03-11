package pyramidJavaPrograms;

import java.util.Scanner;

public class JavaCode1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int count = 1;
        for(int i=0;i<rows;i++){
            for(int j=1;j<=columns-i;j++){
                System.out.print(count + "\t");
                count++;
            }
            System.out.println();
        }
    }
}
