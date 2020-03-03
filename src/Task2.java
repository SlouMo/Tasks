import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("What is the side of the square?");
        System.out.print("Answer: ");
        Scanner scan = new Scanner(System.in);
        int sideSquare = scan.nextInt();
        for (int i = 0; i < sideSquare; i++) {
            for (int n = 0; n < sideSquare; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
