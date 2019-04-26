/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | 
 * and open the template in the editor.
 */
package javaapplication1;

class Shape {
    public Shape() {
        System.out.println("Shape()");
    }
    
    public void draw() {
        System.out.println("Shape draw()");
    }
    
    public void erase() {
        System.out.println("Shape erase()");
    }
    
    public static String getStaticString() {
        return "Shape static getString";
    }
    
    public String getDynamicString() {
        return "Shape Dynamic String";
    }
}

class Circle extends Shape {
    
    public Circle() {
        
        System.out.println("Circle()");
    }
    
    @Override
    public void draw() {
        System.out.println("Circle draw()");
    }
    
    
    @Override
    public void erase() {
        System.out.println("Circle draw()");
    }
    
    public static String getStaticString() {
        return "Circle static getString";
    }

    @Override
    public String getDynamicString() {
        return "Circle Dynamic String";
    }
    
}

class Rectangle extends Shape {
    
    public Rectangle() {
        super();
        System.out.println("Rectangle()");
    }
    
    @Override
    public void draw() {
        System.out.println("Rectangle draw()");
    }
    
    
    @Override
    public void erase() {
        System.out.println("Rectangle draw()");
    }
    
}


/**
 *
 * @author harrison
 */
public class MyClass {
    
    
    public static void drawImage(Shape s) {
           s.draw();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO main code here
    Shape circle = new Circle();
    System.out.println(circle.getDynamicString());
    System.out.println(Circle.getStaticString());
        
    }
    

}
    
