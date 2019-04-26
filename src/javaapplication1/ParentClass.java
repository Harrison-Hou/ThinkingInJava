/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author harrison
 */
public class ParentClass {
    int age = 34;
    
    
    public ParentClass() {
        System.out.println("The ParentClass Constructor");
        childClass3 = new ChildClass(33);
    }
    
   
    
    void function() {
        System.out.println("it is the Function here");
    }
    
    ChildClass childClass3 = new ChildClass(3);
     ChildClass childClass2 = new ChildClass(2);
    ChildClass childClass1 = new ChildClass(age);
    
    
}
