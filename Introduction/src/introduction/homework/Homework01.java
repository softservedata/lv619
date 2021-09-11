package introduction.homework;
import java.util.Scanner;

public class Homework01
{
    public static void main(String[] args){
        Scanner str = new Scanner(System.in);

        System.out.print("Enter the radius of flower bed:");
        double r = Double.parseDouble(str.nextLine());

        System.out.println("Perimeter = " + 2*r*Math.PI);
        System.out.println("Area = " + Math.pow(r, 32)*Math.PI);
    }

}

