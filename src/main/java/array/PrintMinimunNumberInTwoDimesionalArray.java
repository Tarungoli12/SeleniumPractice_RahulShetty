package array;

public class PrintMinimunNumberInTwoDimesionalArray {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int[][] array = {{3,5,2},{6,9,4},{4,0,7}};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(min>array[i][j]){
                    min = array[i][j];
                }
            }
        }
        System.out.println(min);
    }
}
