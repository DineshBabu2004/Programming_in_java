package problems;

import java.util.Scanner;

public class Factorial {
    public static int binomial(int n, int r){
       int  n_fact = fact(n);
        int r_fact = fact(r);
        int n_rfact = fact(n-r);
        return (n_fact/(r_fact*n_rfact));
    }

public static int fact(int n ){
    int ans = 1;
    for (int i = 1; i <= n; i++) {
        ans = ans*i;
    }
    return ans ;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter n");
    int n = sc.nextInt();
    System.out.println("enter r");
    int r = sc.nextInt();

  
    int ans = binomial(n, r);
    System.out.println(ans);
    sc.close();
    
}

}
