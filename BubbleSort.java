import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        int endPosition = arr.length - 1;
        while (endPosition > 0) {
            int i = 0;
            while (i < endPosition) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                i++;
            }
            endPosition--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] originalArray = { 4, 7, 5, 3, 8, 1, 2, 9, 0, 6 };
        System.out.println("ORIGINAL ARRAY:\n" + Arrays.toString(originalArray) + "\n");
        int[] sortedArray = bubbleSort(originalArray);
        System.out.println("SORTED ARRAY:\n" + Arrays.toString(sortedArray) + "\n");

    }
}