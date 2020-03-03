import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("How many members of a row should I output?");
        System.out.print("Answer: ");
        Scanner scan = new Scanner(System.in);
        int members = scan.nextInt();
        double sum = 0;
        for (int i=0;i<members;i++) {
            if ((i+1)%2==1) {
                sum+= (double) 1/Math.pow((i*2+1),2);
            }
            else {
                sum-= (double) 1/Math.pow((i*2+1),2);
            }
        }
        System.out.println("The sum is equal to: " + sum);
    }
}
