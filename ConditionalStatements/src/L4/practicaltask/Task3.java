package L4.practicaltask;
import java.util.Scanner;

public class Task3 {

    public enum Continents{
        Asia, Africa, Europe, NorthAmerica, SouthAmerica, Australia, Antarctica
    }
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.println("Enter the country:");
        String c = str.nextLine();

        switch (c) {
            case "China": System.out.println(Continents.Asia); break;
            case "Nigeria": System.out.println(Continents.Africa); break;
            case "Italy": System.out.println(Continents.Europe); break;
            case "Canada": System.out.println(Continents.NorthAmerica); break;
            case "Brazil": System.out.println(Continents.SouthAmerica); break;
            case "Sydney": System.out.println(Continents.Australia); break;
            default: System.out.println("Sorry) I don't know what you mean");
        }

    }
}
