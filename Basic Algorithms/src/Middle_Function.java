import java.util.Arrays;

/**
 *  A function called middle that takes an array.
 *  Returns a new array that contains all but the first and last elements.
 **/


public class Middle_Function {
    public static void main(String[] args) {
        int[] testArray1 = {1, 2, 3, 4};
        printArray(middle(testArray1));

        int[] testArray2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        printArray(middle(testArray2));

    }

    public static int[] middle(int[] array){
        int[] newArray = new int[array.length -2];

        int newArray_Counter = 0;

        for (int i = 1 ; i < array.length -1 ; i++ ){

            newArray[newArray_Counter] = array[i];
            newArray_Counter++;

        }

        return newArray;
    }

    public static void printArray(int []arr){
        System.out.println(Arrays.toString(arr));
    }
}
