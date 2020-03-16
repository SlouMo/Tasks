import java.util.Scanner;

public class NumberSystemTranslation {
    public static void main(String[] args) {
        int countUnit = 0;
        System.out.println("What number will be converted to binary?");
        System.out.println("Entered number: ");
        Scanner readAnsw = new Scanner(System.in);
        int userNumber = readAnsw.nextInt();
        long valueBinary = Long.parseLong(Long.toBinaryString(userNumber));
        long userNumberBinary = valueBinary;
        while (valueBinary > 0) {
            if (valueBinary % 10 == 1) {
                countUnit++;
            }
            valueBinary /= 10;
        }
        System.out.println("Your binary number looks like this: " + userNumberBinary);
        System.out.println("The number of units in your number: " + countUnit);
    }
}