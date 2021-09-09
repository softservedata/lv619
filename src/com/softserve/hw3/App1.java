package com.sofserve.hw3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App1 {
    public enum HTTPError{
        HTTP_ERROR401(401, "Unauthorized") ,
        HTTP_ERROR402(402, "Payment Required") ,
        HTTP_ERROR403(403, "Forbidden") ,
        HTTP_ERROR404(404, "Not Found") ;
        private final int NUMBER;
        private final String ERROR;
        HTTPError(int number,String error ) {
            this.NUMBER = number;
            this.ERROR = error;
        }

    }

    public static void main(String[] args) throws IOException {
        FirstTask();
        SecondTask();
        ThirdTask();

    }

    public static void FirstTask() throws IOException {
        for (int i=0; i<3; i++) {
            System.out.format("Input %d st number %n",i+1);
            float number = inputFloatNumber();
            if((number >= -5.) && (number <= 5.)) {
                System.out.format("%d number belong to the range [-5,5] %n", i + 1);
            } else {
                System.out.format("%d number doesn't belong to the range [-5,5] %n", i + 1);
            }
        }
    }

    public static void SecondTask() throws IOException {
        System.out.format("Input 1 st number %n");
        int min = inputIntNumber();
        int max = min;
        for (int i = 2; i<4; i++) {
            System.out.format("Input %d st number %n",i);
            int number = inputIntNumber();
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.format("Max = %d, Min= %d%n", max, min);
    }

    public static void ThirdTask() throws IOException {
        System.out.format("Input HTTP error number %n");
        int number = inputIntNumber();

        for(HTTPError httpError: HTTPError.values()){
            if (number == httpError.NUMBER)
                System.out.println(httpError.ERROR);
        }
    }

    public static float inputFloatNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Float.parseFloat(reader.readLine());
    }

    public static int inputIntNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(reader.readLine());
    }

}
