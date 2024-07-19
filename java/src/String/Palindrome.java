package String;
import java.util.*;
public class Palindrome {
    public static boolean palindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                System.out.println("not a palindrome");
                return false;
            }
            i++;j--;
            System.out.println(str);
        }

         return true;
    }

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <=str.length() ; j++) {
                String s = str.substring(i,j);
                if(palindrome(s)== true)
                    count++;

            }

        }
        if(count>0)
            System.out.println("palindrome "+count );
        else
            System.out.println("not a palindrome");
            sc.close();
    }



}
