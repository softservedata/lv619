package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Color[] colors = Color.values();
        Material[] materials = Material.values();

        Box[] box = new Box[5];
        box[0] = new Box();
        box[1] = new Box(2.8);
        box[2] = new Box(3.4, 5.7);
        box[3] = new Box(2.3, 3.2, 3.0);
        box[4] = new Box(5.5, 3.6, 4.6);
        System.out.println("5 instances of 'Box' have created:");

        for (int i = 0; i < box.length; i++) {
            box[i].setMaterial(materials[i]);
            System.out.println("Box[" + i + "]:" +
                    box[i].getHeight() + " x " +
                    box[i].getWidth() + " x " +
                    box[i].getDepth() + ", " +
                    box[i].getMaterial() + ". Volume: " +
                    box[i].getBoxVolume());
        }

        ColorBox colorBox = new ColorBox();
        colorBox.setHeight(10);
        colorBox.setWidth(10);
        colorBox.setDepth(10);

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Color-numbers:");
        for (Color color : colors) {
            System.out.println(color.ordinal() + " - " + color.name());
        }
        System.out.println();
        System.out.print("For create a Color Box, please enter a Color number: ");

        while (true) {
            if(!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Invalid data. Repeat please: ");
            } else {
                int colorCode = scanner.nextInt();
                if (colorCode < colors.length) {
                    colorBox.setColor(colors[colorCode]);
                    break;
                } else {
                    System.out.print("Invalid data. Repeat please: ");
                }
            }
        }

        System.out.println();
        System.out.println("Material numbers:");
        for (Material material : materials) {
            System.out.println(material.ordinal() + " - " + material.name());
        }

        System.out.println();
        System.out.print("Choose a material of your Color Box and to enter a Material number): ");

        while (true) {
            if(!scanner.hasNextInt()) {
                scanner.next();
                System.out.print("Invalid data. Repeat please: ");
            } else {
                int materialCode = scanner.nextInt();
                if (materialCode < materials.length) {
                    colorBox.setMaterial(materials[materialCode]);
                    break;
                } else {
                    System.out.print("Invalid data. Repeat please: ");
                }
            }
        }

        System.out.println();
        System.out.println("ColorBox: " +
                colorBox.getHeight() + " x " +
                colorBox.getWidth() + " x " +
                colorBox.getDepth() + ", " +
                colorBox.getMaterial() + ", " +
                colorBox.getColor() + ". Volume: " +
                colorBox.getBoxVolume());

    }
}
