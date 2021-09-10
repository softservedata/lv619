package com.softserve.edu5;

public class CalcArrays {
    private int[] arrayOfNumbers;

    public CalcArrays(int[] arrayOfNumbers) {
        this.arrayOfNumbers = arrayOfNumbers;
    }

    public int calcSum() {
        int result = 0;

        for(int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] > 0) {
                result += arrayOfNumbers[i];
            }
            else if(arrayOfNumbers[i] < 0) {
                result = 0;
                for (int j = 5; j < arrayOfNumbers.length; j++) {
                    result += arrayOfNumbers[j];
                }
                break;
            }
            else if (i == 5) {
                break;
            }
        }

        return result;
    }

}
