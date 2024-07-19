package Oops;

public class CopyConstructor {
    public static void main(String[] args) {
        Pen p2 = new Pen();
        p2.name="Reymonds";
        p2.cost = 34;
        p2.variety[0]='A';
        p2.variety[1]='B';
        p2.variety[2]='c';
        
        Pen p3 = new Pen(p2);
        p2.variety[2]='Z';
        for (int i = 0; i < p3.variety.length; i++) {
            System.out.println(p3.variety[i]);
        }
    }
}
class Pen{
String name ;
int cost;
char [] variety;
Pen(){
variety = new char[3];
    }
//Shallow Copy
// Pen(Pen p1){
//     variety = new char[3];
//     this.name = p1.name;
//     this.cost = p1.cost;
//     this.variety = p1.variety;
// }
//deep copy 
Pen(Pen p1){
    variety = new char[3];
    this.name = p1.name;
    this.cost = p1.cost;
    for (int i = 0; i < p1.variety.length; i++) {
        this.variety[i]= p1.variety[i];
    }
}
 
}
