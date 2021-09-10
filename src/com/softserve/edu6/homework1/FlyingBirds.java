package com.softserve.edu6.homework1;

import com.softserve.edu6.homework1.Bird;

public class FlyingBirds extends Bird {
    private  int heightOfFly;
    private float speedOfFly;

    public  FlyingBirds(String feathers,int heightOfFly, float speedOfFly) {
      super(feathers);
      this.heightOfFly = heightOfFly;
      this.speedOfFly = speedOfFly;
  }
  public int getHeightOfFly() {return heightOfFly;}
  public float getSpeedOfFly() {return speedOfFly;}

  public void  fly() {
      System.out.println("Flying");
  }
  @Override
    public String toString() {
        return "This is bird who can fly from " + getClass().getName();
  }
}
