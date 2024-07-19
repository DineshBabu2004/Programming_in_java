package Oops;

public class Super {
    public static void main(String[] args) {
        Bizon b = new Bizon();
    }
}
class Animal{
    Animal(){
        System.out.println("Animal");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("4 leg");
    }
    String name = "muttal";
}
class Bizon extends Horse {
   Bizon(){
    System.out.println(super.name);
   }
}
