package com.company;

public class Box {
    protected double height = 1;
    protected double width = 1;
    protected double depth = 1;
    protected Material material;

    public Box() {
    }
    public Box(double height) {
        this.height = height;
    }
    public Box(double height, double weight) {
        this.height = height;
        this.width = weight;
    }
    public Box(double height, double weight, double depth) {
        this.height = height;
        this.width = weight;
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Argument is not valid");
        } else {
            this.height = height;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Argument is not valid");
        } else {
            this.width = width;
        }
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        if (depth <= 0) {
            throw new IllegalArgumentException("Argument is not valid");
        } else {
            this.depth = depth;
        }
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getBoxVolume() {
        return height * width * depth;
    }
}

