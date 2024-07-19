package Oops;

public class Abstract {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.walk();

    }
}
abstract class Animal{
    Animal(){
        System.out.println("Parent class");
    }
    void eat(){
        System.out.println("eat something");
        }
    abstract void walk();
}

class Dog extends Animal{
    Dog(){
       System.out.println("Bow Bow"); 
    }
    void walk(){
        System.out.println("it can walk with four legs"); 
    }
}
