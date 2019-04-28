/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | 
 * and open the template in the editor.
 */
package javaapplication1;

interface Service {

    void method1();

    void method2();
}

interface ServiceFactory {

    Service getService();
}

class Implementation1 implements Service {

    public Implementation1() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation1 method1"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2"); //To change body of generated methods, choose Tools | Templates.
    }

}

class Implementation1Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation1(); //To change body of generated methods, choose Tools | Templates.
    }

}

class Implementation2 implements Service {

    public Implementation2() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation1 method1"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void method2() {
        System.out.println("Implementation1 method2"); //To change body of generated methods, choose Tools | Templates.
    }

}

class Implementation2Factory implements ServiceFactory {

    @Override
    public Service getService() {
        return new Implementation2(); //To change body of generated methods, choose Tools | Templates.
    }

}

/**
 *
 * @author harrison
 */
public class MyClass {
    
    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        serviceConsumer(new Implementation2Factory());
        
    }

}
