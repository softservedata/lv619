package com.softserve.edu09inner;

class Entity {

    //private static class Counter {
    public static class Counter {
        private String countInfo = "countInfo";
        
        private void setCount() {
            count = count + 1;
            // info = ""; // error
        }
        
        public int getCount() {
            return count;
        }
    }

    //---------------------------------------------

    private static int count = 0;
    private static Counter counter;
    public String info = "data";

    static {
        counter = new Counter();
    }

    public Entity() {
        // new Counter().setCount();
        counter.setCount();
    }

    public static int getCount() {
        return count;
    }

    public String getCountInfo() {
        Counter counter = new Counter();
        return counter.countInfo;
    }
}
