package com.softserve.edu4;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // First task
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[3];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < 3; i++) {
            float number;
            System.out.println("Write one number:");
            number = in.nextFloat();
            if (number >= -5 && number <= 5) {
                System.out.println("Number " + number + " belong to range [-5,5]");
            }
            else {
                System.out.println("Number " + number + " doesn't belong to range [-5,5]");
            }
        }
        for(int i = 0; i < 3; i++) {
            numbers[i] = in.nextInt();
        }
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("The smallest number=" + min);
        System.out.println("The biggest number=" + max);

        int numberOfHTTPError;
        System.out.println("Write type of error");
        numberOfHTTPError = in.nextInt();

        switch (numberOfHTTPError) {
            case 400 :
                System.out.println(HTTPError.BadRequest);
                break;
            case 401 :
                System.out.println(HTTPError.Unauthorized);
                break;
            case 402 :
                System.out.println(HTTPError.PaymentRequired);
                break;
            case 403 :
                System.out.println(HTTPError.Forbidden);
                break;
            case 404 :
                System.out.println(HTTPError.NotFound);
                break;
            case 405 :
                System.out.println(HTTPError.MethodNotAllowed);
                break;
            case 406 :
                System.out.println(HTTPError.NotAcceptable);
                break;
            case 407 :
                System.out.println(HTTPError.ProxyAuthenticationRequired);
                break;
            case 408 :
                System.out.println(HTTPError.RequestTimeout);
                break;
            case 409 :
                System.out.println(HTTPError.Conflict);
                break;
            case 410 :
                System.out.println(HTTPError.Gone);
                break;
            case 411 :
                System.out.println(HTTPError.LengthRequired);
                break;
            case 412 :
                System.out.println(HTTPError.PreconditionFailed);
                break;
            case 413 :
                System.out.println(HTTPError.RequestEntityTooLarge);
                break;
            case  414 :
                System.out.println(HTTPError.RequestURITooLong);
                break;
            case 415 :
                System.out.println(HTTPError.UnsupportedMediaType);
                break;
            case 416 :
                System.out.println(HTTPError.RequestedRangeNotSatisfiable);
                break;
            case 417 :
                System.out.println(HTTPError.ExpectationFailed);
                break;
            default:
                System.out.println("Written incorrect number");
        }
        System.out.println("-----------------------------------------");
        // Second task;

        Dog[] dogs = {
                new Dog(Breeds.AmericanEskimoDog,"Barsik",4),
                new Dog(Breeds.AfghanHound,"Barsik",7),
                new Dog(Breeds.AmericanLeopardHound,"Max",2)
        };
        Dog oldestDog = dogs[0];

        for (Dog dog : dogs) {
            if (dog.getAge() >= oldestDog.getAge()) {
                oldestDog = dog;
            }
        }
        System.out.println("The oldest dog is " + oldestDog);

        for (int i = 0; i < dogs.length-1; i++) {
            if (dogs[i].checkName(dogs[i+1])) {
                System.out.println("Two dogs have same name");
                break;
            }
            else if (i == dogs.length-2) {
                System.out.println("All dogs have different names");
            }
        }
    }
}
