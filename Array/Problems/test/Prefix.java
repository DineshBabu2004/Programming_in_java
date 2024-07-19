// import java.util.*;
public class Prefix {
    //calculating sum of two sub array which are equal
    public static void main(String[] args) {
        // System.out.println(" Enter");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int[] arr = {5,3,2,6,3,1};
        //calculating prefix 
        int prefix [] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = arr[i]+prefix[i-1];
        }
        for(int e :prefix){
            System.out.print(e+" ");
        }
        boolean flag  = false;
        for (int i = 0; i < prefix.length-1; i++) {
            // calculating suffix sum
            int sufix = prefix[arr.length-1] - prefix[i];
            if(sufix == prefix[i]){
                System.out.println("\n"+i);
                flag = true;
                break;
            }
        }
        if(!flag)
        System.out.println("prefix sum not found");
       
    }
}
