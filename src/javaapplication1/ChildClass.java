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
public class ChildClass {
    static int count = 0; 
       
    public ChildClass(int age) {
        
        System.out.println("ChildClass: the age is: " + age);
        
        count ++;
        
        System.out.println("ChildClass: the child Class count is:" + count );
        System.out.println("XXXXXXXXXXXX");
     
    }
    
    
}
