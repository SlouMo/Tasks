import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("What is the length of the array?");
        System.out.print("Answer: ");
        Scanner readAnsw = new Scanner(System.in);
        int arrayLength = readAnsw.nextInt();
        int[] bubbleSort = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            bubbleSort[i] = (int) (Math.random() * 101);
        }
        String bubbleSortString = Arrays.toString(bubbleSort);
        System.out.println("Array before sorting");
        System.out.println(bubbleSortString);
        int arrayLengthCount = arrayLength;
        for (int n = 0; n < arrayLength; n++) {
            for (int m = 0; m < arrayLengthCount - 1; m++) {
                if (bubbleSort[m] > bubbleSort[m + 1]) {
                    bubbleSort[m + 1] += bubbleSort[m];
                    bubbleSort[m] = bubbleSort[m + 1] - bubbleSort[m];
                    bubbleSort[m + 1] -= bubbleSort[m];
                }
            }
            arrayLengthCount--;
        }
        bubbleSortString = Arrays.toString(bubbleSort);
        System.out.println("Array after sorting");
        System.out.println(bubbleSortString);
    }
}
