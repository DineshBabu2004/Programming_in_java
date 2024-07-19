package Oops;

public class Interface {
    public static void main(String[] args) {
        Bear b = new Bear();
        b.eat();
    }
}
// using for 100% abstraction 
//to have multiple inheritance
 interface Herbivore {
 void eat();
    
}
 interface Carnivore {
 void eat();
    
}

class Bear implements Herbivore,Carnivore{
    //all methods in interface are public and abstract so implements methos shoould be public 
    public void eat(){
        System.out.println("eat according to availability");
    }
}

