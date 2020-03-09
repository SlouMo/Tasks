import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1 {
    private static final double PI = 3.14;

    public static void main(String[] args) {
        final String formatInput = "#0.00";
        int radius = 5;
        //final double Pi = 3.14;
        double perimeter = 0;
        double area = 0;
        System.out.print("Entered radius: ");
        Scanner scan = new Scanner(System.in);
        radius = scan.nextInt();
        if (radius > 0) {
            perimeter = 2 * Math.PI * radius;
            DecimalFormat decimalFormat = new DecimalFormat(formatInput);
            String formattedPerimeter = decimalFormat.format(perimeter);
            area = Math.PI * Math.pow(radius, 2);
            String formattedArea = decimalFormat.format(area);
            System.out.printf("Perimeter of a circle with a radius %d.2 is equal to %f.2\n", radius, perimeter);
            System.out.println("Perimeter of a circle with a radius " + radius + " is equal to " + formattedPerimeter);
            System.out.println("Area of a circle with a radius " + radius + " is equal to " + formattedArea);
        } else if (radius == 0) {
            System.out.println("A circle with a radius of 0 is a point");
        } else {
            System.out.println("The radius cannot be negative");
        }

    }
}
