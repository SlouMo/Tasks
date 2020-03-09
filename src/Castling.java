import java.util.Scanner;

/*
Swap the values of two numeric variables without using the third one
 */
public class Castling {
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        System.out.println("Enter two numbers and we'll swap them! ;)");
        System.out.print("Here please: ");
        int valueOne = readInput.nextInt();
        int valueTwo = readInput.nextInt();
        valueOne += valueTwo;
        valueTwo = valueOne - valueTwo;
        valueOne -= valueTwo;
        System.out.println("We reversed the value.");
        System.out.println("This is the first " + valueOne + ", and this is the second " + valueTwo);
    }
}