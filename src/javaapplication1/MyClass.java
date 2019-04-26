/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | 
 * and open the template in the editor.
 */
package javaapplication1;

class Actor {

    //Constructor is the static method, will be called without object
    public Actor() {
        System.out.println("Actor() Constructor");
    }
    
    public void act() {
        System.out.println("Actor() act()");

    }
}

class HappyActor extends Actor {
    
    @Override
    public void act() {
        System.out.println("Happy Actor act()");
    }
}

class SadActor extends Actor {

    @Override
    public void act() {
        System.out.println("Sad Actor act()");
    }
}

class Stage {

    private Actor actor = new Actor();

    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
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
        //TODO main code here
        
        
        Stage stage = new Stage();
        System.out.println("1111111");
        stage.performPlay();
        System.out.println("2222222");
        //the constructor Act was called again. 
        stage.change();
        stage.performPlay();
    }

}
