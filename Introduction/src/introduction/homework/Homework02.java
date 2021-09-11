package introduction.homework;
import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String name, address;

        System.out.println("What is your name?");
        name = str.nextLine();

        System.out.println("Where are you live, " + name + "?");
        address= str.nextLine();

        System.out.println("Your name:" + name + "\nYour address:" + address);
    }
}
