package com.softserve.refresh;


public class God {

    public static Human[] create() {
        Human[] result = new Human[2];
        result[0] = new Man();
        result[1] = new Woman();
        return result;
    }
}

class Human {

}

class Man extends Human {

}

class Woman extends Human {

}




