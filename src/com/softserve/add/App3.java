package com.softserve.add;

public class App3 {
    public static void main(String[] args) {
        System.out.println("Sum = " + countSum(30));
    }
    public static double countSum(int i) {
        double sum = 0;
        for (int j = 1; j <=i ; j++) {
            int b = 30 - j;
            if (j % 2 == 1) {
                double a = j;
                sum+= Math.pow((a - b), 2);
            }
            else {
                double a = j/2F;
                sum+= Math.pow((a - b), 2);
            }
        }
        return sum;
    }
}
