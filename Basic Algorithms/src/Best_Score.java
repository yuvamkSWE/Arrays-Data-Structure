import java.util.Arrays;

/**
 * Given an array, write a function to get first, second best scores from the array and return it in new array.
 **/


public class Best_Score {
    public static void main(String[] args) {
        int[] testArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        printArray(best2Scores(testArray));
    }

    public static int[] best2Scores(int[] array){
        int max = array[0];
        int max2 = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max2 = max;
                max = array[i];
            } else if (array[i] > max2 && max != array[i]) {
                max2 = array[i];
            }
        }

        int [] returnArray = { max , max2 };
        return returnArray;
    }



    public static void printArray(int []arr){
        System.out.println(Arrays.toString(arr));
    }

}
