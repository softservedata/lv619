package com.softserve.edu5;

public class FindNumbers {
    private int[] array;

    public FindNumbers(int[] array) {
        this.array = array;
    }

    public int findPos() {
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                for (int j = i+1; j < array.length; j++) {
                    if (array[j] < 0) {
                        position = j;
                        break;
                    }
                }
                break;
            }

        }

        return position;
    }
    public int findMin() {
        int min = array[0];
        int position = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                position = i;
            }
        }

        return min;
    }
}
