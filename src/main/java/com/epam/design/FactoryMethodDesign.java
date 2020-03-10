package com.epam.design;

import java.util.Scanner;

interface Shape{
    void select();
}
class Circle implements Shape{
    public void select() {
        System.out.println("Circle is Selected!");
    }
}
class Rectangle implements Shape{
    public void select() {
        System.out.println("Rectangle is Selected!");
    }
}
class Square implements Shape{
    public void select() {
        System.out.println("Square is Selected!");
    }
}
class Triangle implements Shape{
    public void select() {
        System.out.println("Triangle is Selected!");
    }
}
class GetShape{
    void getShape(int choice) {
        switch(choice) {
            case 1 : Circle circle = new Circle();
                circle.select();
                break;
            case 2 : Rectangle rectangle = new Rectangle();
                rectangle.select();
                break;
            case 3 : Square square = new Square();
                square.select();
                break;
            case 4 : Triangle triangle = new Triangle();
                triangle.select();
                break;
            default: System.out.println("Enter a valid choice : ");
        }
    }
}
public class FactoryMethodDesign {

    public static void main(String[] args) {
        int choice;
        Scanner r = new Scanner(System.in);
        System.out.println("\n\n ****MENU ****\n\n");
        System.out.println("1.Circle.");
        System.out.println("2.Rectangle.");
        System.out.println("3.Square.");
        System.out.println("4.Triangle.");
        System.out.print("Enter your choice : ");
        choice = r.nextInt();
        GetShape ob = new GetShape();
        ob.getShape(choice);
        r.close();
    }

}