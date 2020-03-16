import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        System.out.println("Enter finally purely in binary");
        System.out.print("Here please: ");
        Scanner readInput = new Scanner(System.in);
        int firstNumber = readInput.nextInt();
        int secondNumber = readInput.nextInt();
        System.out.println("Least Common Multiple numbers: " + firstNumber + " and " + secondNumber);
        int greatCommonMultiple;
        int leastCommonMultiple;
        if (firstNumber > secondNumber) {
            greatCommonMultiple = GreatCommonMultiple(firstNumber, secondNumber);
            leastCommonMultiple = firstNumber * secondNumber / greatCommonMultiple;
            System.out.println("Answer: " + leastCommonMultiple);
        } else {
            greatCommonMultiple = GreatCommonMultiple(secondNumber, firstNumber);
            leastCommonMultiple = firstNumber * secondNumber / greatCommonMultiple;
            System.out.println("Answer: " + leastCommonMultiple);
        }
    }

    public static int GreatCommonMultiple(int firstNumber, int secondNumber) {
        boolean remainderFlag = true;
        int remainder;
        while (remainderFlag) {
            remainder = firstNumber % (secondNumber * (firstNumber / secondNumber));
            if (remainder != 0) {
                firstNumber = secondNumber;
                secondNumber = remainder;
            } else {
                remainderFlag = false;
            }
        }
        return secondNumber;
    }
}
