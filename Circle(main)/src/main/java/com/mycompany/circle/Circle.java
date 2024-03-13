/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.circle;

/**
 *
 * @author 111ma
 */
public class Circle {
    // Private instance variable
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate and return the area of the circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate and return the circumference of the circle
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter method for radius (optional)
    public double getRadius() {
        return radius;
    }

    // Setter method for radius (optional)
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        
        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}

