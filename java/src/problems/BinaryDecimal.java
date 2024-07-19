package problems;
import java.util.Scanner;

public class BinaryDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary Nummber");
        int n = sc.nextInt();
        // Binary b = new Binary();
        // b.binarytoDecimal(n);
        Decimal d = new Decimal();
        d.decimaltoBinary(n);
        sc.close();

    }
}

class Binary{
    public void binarytoDecimal(int n ){
        int dec = 0;
        int ld , i = 0;
       while(n>0){
        ld = n%10;
        dec = dec + (ld* (int)(Math.pow(2,i++)));
        n/=10;
       }
       System.out.println(dec);
    }
}
class Decimal{
    public void decimaltoBinary(int n ){
        int rem ,i,bin;
        rem=bin=i=0;
        while(n>0){
            rem = n%2;
            bin = bin + (rem * (int)Math.pow(10,i++));
            n/=2;
        }
        System.out.println(bin);
    }
}
