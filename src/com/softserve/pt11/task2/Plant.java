package com.softserve.pt11.task2;


public class Plant {
    public int size;
    public Color color;
    public Type type;

    public Plant(String type, String color, int size) throws ColorException, TypeException{
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Color.BLUE;
            case "red":
                return Color.RED;
            case "white":
                return Color.WHITE;
            default:
                throw new ColorException("Input only color blue, red or white");
        }
    }

    private Type typeStrToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "rose":
                return Type.ROSE;
            case "tulip":
                return Type.TULIP;
            case "aster":
                return Type.ASTER;
            default:
                throw new TypeException("Input only type rose, tulip or aster");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}
