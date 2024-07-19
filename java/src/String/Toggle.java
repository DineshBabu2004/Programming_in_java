package String;
import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==' ')
                continue;
            int ascii = (int)str.charAt(i);
            if(ascii>97){
                ascii-=32;
                char ch = (char) ascii;
                str.setCharAt(i,ch);
            }
            else {
                ascii+=32;
                char ch = (char) ascii;
                str.setCharAt(i,ch);
            }

        }
        System.out.println(str);
        sc.close();
    }
}
