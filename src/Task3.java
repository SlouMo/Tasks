import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("What is the base of the triangle?");
        System.out.print("Answer: ");
        Scanner scan = new Scanner(System.in);
        int sideTriangle = scan.nextInt();
        System.out.println("If you want to display a right triangle enter 1");
        System.out.println("If you want to print an isosceles triangle enter 2");
        int triangleShape = scan.nextInt();
        switch (triangleShape) {
            case 1:
                for (int i = 0; i < sideTriangle; i++) {
                    for (int n = i + 1; n > 0; n--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < sideTriangle; i++) {
                    int n = i + 1;
                    int centre = (sideTriangle - n) / 2;
                    for (int m = 0; m < centre; m++) {
                        System.out.print(" ");
                    }
                    if (n % 2 == 1) {
                        for (; n > 0; n--) {
                            System.out.print("*");
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("You entered an incorrect value");
        }
    }
}
