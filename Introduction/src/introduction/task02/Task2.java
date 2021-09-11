package introduction.task02;
import java.util.Scanner;

public class Task2
{
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);

        System.out.println("How are you?");
        String answer = str.nextLine();
        System.out.println("You are " + answer);
    }

}
