import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("How many times do we multiply?");
        System.out.print("Answer: ");
        Scanner scan = new Scanner(System.in);
        int multiplyUpTo = scan.nextInt();
        for (int i = 1; i <= multiplyUpTo; i++) {
            for (int n = 1; n <= multiplyUpTo; n++) {
                System.out.print(n * i + " ");
            }
            System.out.println();
        }
    }
}
