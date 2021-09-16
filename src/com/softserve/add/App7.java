package com.softserve.add;



public class App7 {

    public static void main(String[] args) {

        System.out.println(findPosition(180));

    }

    public static int findPosition(int n) {
        int [] numbers = generateArray();
        return numbers[n - 1];
    }


    public static int[] generateArray() {
        int [] numbers = new int[180];
        int j = 0;
        for (int i = 10; i < 100; i++) {
            numbers[j] = i/10;
            j++;
            numbers[j] = i % 10;
            j++;
        }
        return numbers;
    }
}
