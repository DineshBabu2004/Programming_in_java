package Oops;

public class Oops {
 public static void main(String[] args) {
    Bank b = new Bank();
    b.setName("Dinewsh");
    b.setPass("1234");
    System.out.println(b.getname());
    System.out.println(b.getpass());
 }
}
class Bank{
    private String name;
    private String pass;
    void setName(String name){
        this.name = name;
    }
    void setPass(String pass){
        this.pass = pass;
    }
    String getname(){
        return this.name;
    }
    String getpass(){
        return this.pass;
    }
    
}
