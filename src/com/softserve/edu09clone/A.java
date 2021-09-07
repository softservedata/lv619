package com.softserve.edu09clone;

public class A implements Cloneable {
    public int i = 11;
    public StringBuilder sb = new StringBuilder("first");
    
    /*-
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    */
    
    // Deep Clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        A a = (A) super.clone();
        a.sb = new StringBuilder(sb.toString());
        return a;
    }
}
