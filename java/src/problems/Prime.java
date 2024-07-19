package problems;
import java.util.*;
public class Prime {
    public static void main(String[] args) {
        System.out.println("give a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= (int)Math.sqrt(n); i++) {
            if(n%i==0)
                flag=false;
            
        }
        if(flag==true){
            System.out.println("prime number");
        }
        else{
            System.out.println("not a prime number");
        }
        sc.close();
    }
    
}
