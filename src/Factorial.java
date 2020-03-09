import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {
        double resultFactorial = 1;
        System.out.println("What number factorial is calculated?");
        System.out.print("Answer: ");
        Scanner readAnsw = new Scanner(System.in);
        int factorial = readAnsw.nextInt();
        if (factorial > 0) {
            for (int i = 1; i <= factorial; i++) {
                resultFactorial = resultFactorial * i;
            }
            System.out.println("Factorial numbers " + factorial + " is equal to " + resultFactorial);
        } else if (factorial == 0) {
            System.out.println("Factorial 0 is 1");
        } else {
            System.out.println("The entered number must be positive");
        }

    }
}
