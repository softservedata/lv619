package introduction.task01;
import java.util.Scanner;

public class Task1
{
    public static void main(String[] args)
    {
        Scanner str = new Scanner(System.in);

        System.out.print("Enter value of a:");
        int a = Integer.parseInt(str.nextLine());

        System.out.print("Enter value of b:");
        int b = Integer.parseInt(str.nextLine());

        System.out.println("Your results:");
        System.out.println("a+b=" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a*b=" + (a*b));
        System.out.println("a/b=" + (a/b));

    }
}