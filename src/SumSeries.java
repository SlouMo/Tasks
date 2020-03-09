import java.util.Scanner;

/*
Row Calculation (m-1)!^2/(2*m)! , where m = 1, up to the number n entered by the user
 */

public class SumSeries {
    public static void main(String args[]) {

        double resultExpression = 0;
        double resultSeries = 1;
        System.out.println("To which row will we consider?");
        System.out.print("Answer: ");
        Scanner readAnsw = new Scanner(System.in);
        int series = readAnsw.nextInt();
        if (series > 0) {
            for (int m = 1; m <= series; m++) {
                for (int i = 1; i <= m; i++) {
                    resultSeries = (factorialCalc(i - 1) * factorialCalc(i - 1)) / (factorialCalc(2 * i));
                }
                resultExpression += resultSeries;
            }
            System.out.println(resultExpression);
        } else {
            System.out.println("The entered number must be positive");
        }
    }

    public static double factorialCalc(int factorial) {
        double resultFactorial = 1;
        if (factorial > 0) {
            for (int i = 1; i <= factorial; i++) {
                resultFactorial = resultFactorial * i;
            }
            return resultFactorial;
        } else {
            return 1;
        }
    }
}