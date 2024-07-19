package problems;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to reverse");
        int n = sc.nextInt();
        int sum,rem;
        sum=rem=0;
        while(n>0){
            rem = n%10;
            sum = sum*10+(rem);
            // pow*=10;
            n/=10;

        }
        System.out.println(sum);
        sc.close();
    }
}
