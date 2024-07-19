package String;
public class Contains {
    public static void main(String[] args) {
    StringBuilder str = new StringBuilder();
    str.append("Vankkam da mapla ");
    System.out.println(str);
    str.setCharAt(0,'d');
    System.out.println(str);
    str.insert(0,'v');
    System.out.println(str);
    str.deleteCharAt(1);
        System.out.println(str);
        str.delete(0,2);
        System.out.println(str);
        str.reverse();
        System.out.println(str);


    }
}
