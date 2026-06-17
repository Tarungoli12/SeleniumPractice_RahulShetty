package interview;

import java.util.Scanner;

public class problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
        for(int i=0;i<n;i++){
            int count = 1;
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }else{
                    count *=ar[j];
                }
            }
            System.out.println(count);
        }
    }
}
