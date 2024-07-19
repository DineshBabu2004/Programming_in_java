package String;
import java.util.*;

public class Example {
    public static float minDist(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'W' || ch == 'w') {
                x--;
            } else if (ch == 'S' || ch == 's') {
                y--;
            } else if (ch == 'N' || ch == 'n') {
                y++;
            } else if (ch == 'E' || ch == 'e') {
                x++;
            }
        }
        int X = x * x;
        int Y = y * y;
        return (float) Math.sqrt(X + Y);
    }
    public static String capitalCase(String str){
        //input : dinesh babu 
        // output : Dinesh Babu
        StringBuilder string = new StringBuilder("");
        str = str.trim();
        string.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)==' '&& str.charAt(i+1)>=65 && str.charAt(i+1)<=123){
                string.append(str.charAt(i));
                i++;
                string.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                string.append(str.charAt(i));
            }
        }
        return string.toString();
    }
    public static String compression(String str){
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;i++;
            }
            if(count>1){
                sb.append(count);
            }
        }
        return sb.toString();
    }


    public static boolean anagrams(String str1, String str2){
        char [] c1 =str1.toCharArray();
        char [] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i = 0; i < c2.length; i++) {
            System.out.print(c1[i]);
        }
        System.out.println();
        boolean result = Arrays.equals(c1,c2);
        if(result == true){
            c1.toString();
            System.out.println(c1);
        return true;
        }
        return false;
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter directions (N, S, E, W): ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        if(str1.length()!=str2.length()){
            System.out.println("not anagrams");
        }
        else
        System.out.println(anagrams(str1, str2));
        // System.out.println(capitalCase(str));
        // System.out.println(compression(str));
        // System.out.println("Minimum distance: " + minDist(str));
        sc.close();
    }
}
