package interview;

import java.util.Arrays;

public class problem24 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = arr.length + 1; // because one number is missing

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;
        System.out.println("Missing number: " + missing);
    }

    public void missingNumberUnSorted() {
        int[] arr = {8, 6, 4, 5, 9};
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]!=arr[i]+1){
                System.out.println("missing number = " + arr[i]+1);
            }
        }
    }
}
