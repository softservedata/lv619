package introduction.homework;
import java.util.Scanner;


public class Homework03 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.print("Enter call cost for the first country:");
        double c1=Double.parseDouble(str.nextLine());
        System.out.print("Enter the duration of the first call:");
        double t1=Double.parseDouble(str.nextLine());
        double p1=c1*t1;
        System.out.println("First call price is: " + p1 + "\n");

        System.out.print("Enter call cost for the second country:");
        double c2=Double.parseDouble(str.nextLine());
        System.out.print("Enter the duration of the second call:");
        double t2=Double.parseDouble(str.nextLine());
        double p2=c2*t2;
        System.out.println("Second call price is:" + p2 + "\n");

        System.out.print("Enter call cost for the third country:");
        double c3=Double.parseDouble(str.nextLine());
        System.out.print("Enter the duration of the third call:");
        double t3=Double.parseDouble(str.nextLine());
        double p3=c3*t3;
        System.out.println("Third call price is:" + p3 + "\n");

        System.out.println("Total price:" + (p1+p2+p3));


    }
}
