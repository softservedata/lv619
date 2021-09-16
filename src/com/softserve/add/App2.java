package com.softserve.add;

import java.util.Arrays;

public class App2 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(createOrder(19)));
    }
    public static double[] createOrder(int i) {
        double [] order = new double[i];
        order[0] = 0;
        order[1] = 5/8F;
        for (int j = 2; j < i; j++) {
            order[j] = order[j-1]/2F + 3 * order[j-2]/4F;
        }
        return order;
    }
}
