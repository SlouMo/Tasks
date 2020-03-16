import java.util.Scanner;

public class ContinuousNumberOfUnits {
    public static void main(String[] args) {
        boolean binaryNumber = true;
        int countUnit = 0;
        int maxUnit = 0;
        System.out.println("Enter finally purely in binary");
        System.out.print("Here please: ");
        Scanner readInput = new Scanner(System.in);
        long userNumber = readInput.nextLong();
        long varToCount = userNumber;
        while (varToCount != 0 && binaryNumber) {
            if (varToCount % 10 == 1) {
                countUnit++;
            } else if (varToCount % 10 == 0) {
                if (countUnit > maxUnit) {
                    maxUnit = countUnit;
                    countUnit = 0;
                } else {
                    countUnit = 0;
                }
            } else {
                System.out.println("You entered a non binary number");
                binaryNumber = false;
            }
            varToCount /= 10;
        }
        if (binaryNumber) {
            System.out.println("The maximum number of units in the number: " + userNumber);
            System.out.println("Answer: " + maxUnit);
        }
    }
}
