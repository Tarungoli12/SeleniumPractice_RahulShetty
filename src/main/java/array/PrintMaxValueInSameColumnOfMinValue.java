package array;

public class PrintMaxValueInSameColumnOfMinValue {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int column = 0;
        int[][] array = {{2,8,4},{8,9,4},{4,5,7}};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(min>array[i][j]){
                    min = array[i][j];
                    column = j;
                }
            }
        }
        int max = Integer.MIN_VALUE;
        int k = 0;
        while(max<array[k][column]){
            max = array[k][column];
            k++;
        }
       System.out.println(max);
    }
}
