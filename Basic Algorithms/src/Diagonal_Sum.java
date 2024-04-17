// Given 2D array calculate the sum of diagonal elements.

public class Diagonal_Sum {
    public static void main(String[] args) {
        int[][] testArray = {{1,2,3},{4,5,6},{7,8,9}};
        diagonal(testArray);
    }

    public static void diagonal(int[][] array){

        int sum = 0;

        for (int i = 0 ; i < array.length ; i++){
            for (int j = 0 ; j < array[i].length ; j++){

                if (i == j){
                    sum += array[i][j];
                }

            }
        }

        System.out.println(sum);

    }



}
