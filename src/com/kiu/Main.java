package com.kiu;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4, "blue");
        System.out.println(circle);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        
        Cylinder cylinder = new Cylinder(4, "red", 8);
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
