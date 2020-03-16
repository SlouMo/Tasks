import java.util.Scanner;

public class Dividers {
    public static void main(String[] args) {
        double tmp;
        System.out.println("Entered you number");
        System.out.print("Here please: ");
        Scanner readInput = new Scanner(System.in);
        double userNumber = readInput.nextInt();
        System.out.println("All number dividers " + (int) userNumber + " :");
        for (int i = 1; i <= userNumber; i++) {
            tmp = userNumber / i;
            if (tmp == (int) tmp) {
                System.out.print(i + " ");
            }
        }
    }
}
