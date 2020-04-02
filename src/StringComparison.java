import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        System.out.println("Enter the first line to compare");
        System.out.print("Here please: ");
        Scanner scannerInput = new Scanner(System.in);
        String inputOne = scannerInput.nextLine();
        char[] arrayOne = convertStringToChar(inputOne);
        System.out.println("Enter the second line to compare");
        System.out.print("Here please: ");
        String inputTwo = scannerInput.nextLine();
        char[] arrayTwo = convertStringToChar(inputTwo);
        int comparingCharacter = 0;
        characterComparison(arrayOne, arrayTwo, comparingCharacter);
    }

    public static char[] convertStringToChar(String str) {
        char[] charArray = str.toCharArray();
        return charArray;
    }

    public static void output(char[] arrayOne, char[] arrayTwo) {
        String strOne = "";
        for (int i = 0; i < arrayOne.length; i++) {
            strOne += arrayOne[i];
        }
        String strTwo = "";
        for (int i = 0; i < arrayTwo.length; i++) {
            strTwo += arrayTwo[i];
        }
        System.out.println(strOne + " > " + strTwo);
    }

    public static void characterComparison(char[] arrayOne, char[] arrayTwo, int comparingCharacter) {
        try {

            if (arrayOne[comparingCharacter] > arrayTwo[comparingCharacter]) {
                output(arrayOne, arrayTwo);
            } else if (arrayOne[comparingCharacter] < arrayTwo[comparingCharacter]) {
                output(arrayTwo, arrayOne);
            } else {
                //expressionsAreEqual = true;
                comparingCharacter++;
                characterComparison(arrayOne, arrayTwo, comparingCharacter);
            }
        } catch (Exception ex) {
            if (comparingCharacter > arrayOne.length - 1 && comparingCharacter < arrayTwo.length) {
                output(arrayTwo, arrayOne);
            } else if (comparingCharacter > arrayTwo.length - 1 && comparingCharacter < arrayOne.length) {
                output(arrayOne, arrayTwo);
            } else {
                System.out.println("Expressions are equal");
            }
        }
    }
}
