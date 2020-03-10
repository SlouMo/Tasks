import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        System.out.println("Enter the first two numbers of the arithmetic progression");
        System.out.print("Here please: ");
        Scanner readAnsw = new Scanner(System.in);
        int memberOne = readAnsw.nextInt();
        int memberTwo = readAnsw.nextInt();
        System.out.println("Which member of an arithmetic progression would like to write?");
        int memberUser = readAnsw.nextInt();
        int stepProgression = memberTwo - memberOne;
        int resultMemberUser = memberOne + (memberUser - 1) * stepProgression;
        System.out.println(memberUser + " member of arithmetic progression equals " + resultMemberUser);
    }
}