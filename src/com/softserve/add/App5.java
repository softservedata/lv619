package com.softserve.add;

public class App5 {
    public static void main(String[] args) {
        double[] sides= {1, 2, 3};

    }
    public static int defineTriangle(double[] sides){
        boolean check = false;
        if ((sides[0] >= sides[1] + sides[2]) ||
                    (sides[1] >= sides[0] + sides[2])||
                    (sides[2] >= sides[0] + sides[1])) {
            return 0;
        }
        if (sides[0] == sides[1] && sides[2] == sides[1]) {
            return 3;
        }
        if ((sides[0] == sides[1] && sides[2] != sides[1])||
                (sides[2] == sides[1] && sides[0] != sides[1])||
                (sides[0] == sides[2] && sides[2] != sides[1])) {
            return 2;
        }
        return 1;
    }
}
