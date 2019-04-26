/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | 
 * and open the template in the editor.
 */
package javaapplication1;

abstract class Animal {
    
    private int numberOflegs = 4; 
    
    
    abstract void move(int numberofLegs);
    
    abstract void stay();
}

class Human extends Animal {
    
    @Override
    public void move(int numberofLegs) {
        
}
    @Override
    public void stay() {
        
    }
    
    public void makeSong() {
        
    }
    
    public void makefood() {
        
    }
}

/**
 *
 * @author harrison
 */
public class MyClass {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int numberofLegs = 4; 
        //TODO main code here
//        Animal[] humans = { new Animal(), new Human()};
//        
//        humans[0].move();
        Human[] humans = { new Human(), new Human()};
        humans[0].move(numberofLegs);
       
    }

}
