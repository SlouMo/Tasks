import java.util.Scanner;

public class SearchForSubarray {
    public static void main(String[] args) {
        System.out.println("Enter the first array");
        System.out.print("Here please: ");
        Scanner scannerInput = new Scanner(System.in);
        String inputOne = scannerInput.nextLine();
        int[] arrayOne = convertStringToInt(inputOne);
        System.out.println("Enter the second array");
        System.out.print("Here please: ");
        String inputTwo = scannerInput.nextLine();
        int[] arrayTwo = convertStringToInt(inputTwo);
        boolean arrayEntry = false;
        int startOfEntry = 0;
        for (int i = 0; i < arrayTwo.length; i++) {
            if (arrayTwo[i] == arrayOne[0]) {
                startOfEntry = i;
                arrayEntry = entryCheck(arrayOne, arrayTwo, i);
                if (arrayEntry == true) {
                    break;
                }
            }
        }
        if (arrayEntry == false) {
            System.out.println("No occurrences found.");
        } else {
            System.out.println("Entries start with item number: " + ++startOfEntry);
        }
    }

    public static boolean entryCheck(int[] arrayOne, int[] arrayTwo, int startOfEntry) {
        boolean entry = true;
        for (int i = 1; i < arrayOne.length; i++) {
            try {
                if (arrayOne[i] != arrayTwo[startOfEntry + i]) {
                    entry = false;
                }
            } catch (Exception ex) {
                entry = false;
                break;
            }
        }
        return entry;
    }

    public static int[] convertStringToInt(String str) {
        String[] strArr = str.split(" ");
        int[] numArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            numArr[i] = Integer.parseInt(strArr[i]);
        }
        return numArr;
    }
}
