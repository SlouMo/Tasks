import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("How many times do we multiply?");
        System.out.print("Answer: ");
        Scanner scan = new Scanner(System.in);
        int multiplyUpTo = scan.nextInt();
        for (int i = 0; i < multiplyUpTo; i++) {
            for (int n = 0; n < multiplyUpTo;n++) {
                System.out.print((n+1)*(i+1) + " ");
            }
            System.out.println();
        }
    }
}
