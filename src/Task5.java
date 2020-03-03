import java.util.Scanner;
/*
class Coordinates {
    static int[] enteredCoordinates() {
        Scanner scan = new Scanner(System.in);
        int xCord = scan.nextInt();
        int yCord = scan.nextInt();

    }
}


 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Entered coordinates of the center, separated by a space, x y, respectively: ");
        int xCordCenter = scan.nextInt();
        int yCordCenter = scan.nextInt();
        //Coordinates.enteredCoordinates(int xCordCenter, int yCordCenter);
        //System.out.println(xCordCenter + " " + yCordCenter);
        System.out.print("Entered coordinates of the point, separated by a space, x y, respectively: ");
        int xCordPoint = scan.nextInt();
        int yCordPoint = scan.nextInt();
        System.out.print("Entered radius: ");
        int radius = scan.nextInt();
        if (Math.pow((xCordPoint-xCordCenter),2) + Math.pow((yCordPoint-yCordCenter),2) <= Math.pow(radius,2)) {
            System.out.println("The point belongs to the circle");
        }
        else {
            System.out.println("The point does not belong to the circle");
        }



    }
}
