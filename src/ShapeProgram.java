package com.example.shapes;

/**
 * The ShapeProgram class demonstrates the use of inheritance and polymorphism
 * through a Shape hierarchy. This program includes the abstract Shape class and
 * its concrete subclasses Circle and Rectangle.
 * 
 * <p>
 * The program calculates the area and perimeter of various shapes.
 * </p>
 * 
 * @author Shiyas&Titus
 * @version 1.0
 */
public class ShapeProgram {

    /**
     * The abstract {@code Shape} class represents a generic geometric shape.
     * Subclasses must provide implementations for calculating area and perimeter.
     */
    public static abstract class Shape {
        /**
         * Calculates the area of the shape.
         * 
         * @return the area of the shape
         */
        public abstract double calculateArea();

        /**
         * Calculates the perimeter of the shape.
         * 
         * @return the perimeter of the shape
         */
        public abstract double calculatePerimeter();
    }

    /**
     * The {@code Circle} class represents a circle and extends the {@code Shape}
     * class.
     * It provides implementations for calculating the area and perimeter of a
     * circle.
     * 
     * <p>
     * Area = π * radius², Perimeter = 2 * π * radius.
     * </p>
     */
    public static class Circle extends Shape {
        private double radius;

        /**
         * Constructs a new {@code Circle} with the specified radius.
         * 
         * @param radius the radius of the circle
         */
        public Circle(double radius) {
            this.radius = radius;
        }

        /**
         * Calculates the area of the circle.
         * 
         * @return the area of the circle
         */
        @Override
        public double calculateArea() {
            return Math.PI * radius * radius;
        }

        /**
         * Calculates the perimeter (circumference) of the circle.
         * 
         * @return the perimeter of the circle
         */
        @Override
        public double calculatePerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    /**
     * The {@code Rectangle} class represents a rectangle and extends the
     * {@code Shape} class.
     * It provides implementations for calculating the area and perimeter of a
     * rectangle.
     * 
     * <p>
     * Area = width * height, Perimeter = 2 * (width + height).
     * </p>
     */
    public static class Rectangle extends Shape {
        private double width;
        private double height;

        /**
         * Constructs a new {@code Rectangle} with the specified width and height.
         * 
         * @param width  the width of the rectangle
         * @param height the height of the rectangle
         */
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        /**
         * Calculates the area of the rectangle.
         * 
         * @return the area of the rectangle
         */
        @Override
        public double calculateArea() {
            return width * height;
        }

        /**
         * Calculates the perimeter of the rectangle.
         * 
         * @return the perimeter of the rectangle
         */
        @Override
        public double calculatePerimeter() {
            return 2 * (width + height);
        }
    }

    /**
     * Main method to demonstrate the use of the Shape hierarchy.
     * 
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a Circle with radius 5
        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        // Create a Rectangle with width 4 and height 7
        Shape rectangle = new Rectangle(4, 7);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}