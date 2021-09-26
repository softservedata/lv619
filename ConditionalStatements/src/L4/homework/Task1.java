package L4.homework;
import L4.practicaltask.Task3;

import java.util.Scanner;

public class Task1 {

    public enum Error {
        BadRequest, NotFound, NotAcceptable, BadGateway, InternalServerError, Unauthorized, Forbidden
    }
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.println("Enter 3 float values:");
        System.out.print("a=");
        float a = Float.parseFloat(str.nextLine());
        System.out.print("b=");
        float b = Float.parseFloat(str.nextLine());
        System.out.print("c=");
        float c = Float.parseFloat(str.nextLine());

        if(a >= -5 && a <= 5 && b >= -5 && b <= 5 && c >= -5 && c <= 5 ) {
            System.out.println("Yes, numbers belong to range");
        }
        else System.out.println("No, numbers don't belong to range");
        System.out.println();

        System.out.println("Enter 3 integer values:");
        System.out.print("A=");
        int A = Integer.parseInt(str.nextLine());
        System.out.print("B=");
        int B = Integer.parseInt(str.nextLine());
        System.out.print("C=");
        int C = Integer.parseInt(str.nextLine());

        int min = 0;
        int max=0;
        if (A>B) {
            max = A;
            min = B;
        }
        else {
            max = B;
            min = A;
        }
        if (C>max) {
            max = C;
        }
        if (C<min) {
            min = C;
        }

        System.out.println("Maximal value: " + max);
        System.out.println("Minimal value: " + min);
        System.out.println();

        System.out.println("Enter the number of HTTP Error:");
        System.out.print("Error =");
        int error = Integer.parseInt(str.nextLine());

        switch (error){
            case 400: System.out.println(Error.BadRequest); break;
            case 401: System.out.println(Error.Unauthorized); break;
            case 403: System.out.println(Error.Forbidden); break;
            case 404: System.out.println(Error.NotFound); break;
            case 406: System.out.println(Error.NotAcceptable); break;
            case 500: System.out.println(Error.InternalServerError); break;
            case 502: System.out.println(Error.BadGateway); break;
            default: System.out.println("Sorry, I don't know this code");
        }
    }
}
