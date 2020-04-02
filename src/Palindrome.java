import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Enter the word");
        System.out.print("Here please: ");
        Scanner scannerInput = new Scanner(System.in);
        String input = scannerInput.nextLine();
        char[] arrayPalindrome = convertStringToChar(input);
        boolean palindrome = true;
        for (int i = 0; i < arrayPalindrome.length / 2; i++) {
            if (arrayPalindrome[i] != arrayPalindrome[arrayPalindrome.length - 1 - i]) {
                palindrome = false;
                break;
            }
        }
        if (palindrome == true) {
            System.out.println("Word " + input + " is a palindrome!");
        } else {
            System.out.println("Word " + input + " not a palindrome!");
        }
    }

    public static char[] convertStringToChar(String str) {
        char[] charArray = str.toCharArray();
        return charArray;
    }
}
