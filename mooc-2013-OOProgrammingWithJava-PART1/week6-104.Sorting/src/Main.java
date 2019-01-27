
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // indexes:   0  1  2  3  4
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int value : array) {
            if (value < smallest) {
                smallest = value;
            }
        }
        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        // code goes here
        int smallest = smallest(array);
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int smallest = array[index];

        for (int i = index; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        int indexOfSmallest = index;
        for (int i = index; i < array.length; i++) {
            if (smallest == array[i]) {
                indexOfSmallest = i;
            }
        }

        return indexOfSmallest;

    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        //int[] values = {3, 2, 5, 4, 8};
        //0, 1, 2, 3, 4

        int helper = array[index2];
        array[index2] = array[index1];
        array[index1] = helper;

    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int a = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, a);
        }
    }

}
