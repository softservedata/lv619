package com.softserve.pt4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number of the day of the week");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        switch (Integer.parseInt(reader.readLine())){
            case 1:
                System.out.println("Monday, Montag, Понеділок");
                break;
            case 2:
                System.out.println("Tuesday, Dienstag, Вівторок");
                break;
            case 3:
                System.out.println("Wednesday, Mittwoch, Середа");
                break;
            case 4:
                System.out.println("Thursday, Donnerstag, Четвер");
                break;
            case 5:
                System.out.println("Friday, Fritag, П'ятниця'");
                break;
            case 6:
                System.out.println("Saturday, Sonnabend, Субота");
                break;
            case 7:
                System.out.println("Sunday,Sonntag, Неділя");
                break;
            default:
                System.out.println("Invalid number");
        }
        reader.close();
    }

}
