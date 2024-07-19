import java.util.*;



public class Problems {
    public static void pascalTriangle(int n){
        int pas[][] = new int[n][];
        for (int i = 0; i < pas.length; i++) {
             pas[i] = new int[i+1];
            pas[i][0]= pas[i][i] = 1; 
            for (int j = 1; j <i; j++) {
                pas[i][j]=pas[i-1][j]+pas[i-1][j-1];
            }
        }
        // for(int []a : pas){
        //     for (int b  : a) {
        //         System.out.print(b+" ");
        //     }
        //     System.out.println();
        // }
        for (int i = 0; i < pas.length; i++) {
            for (int j = 0; j < pas.length-i+1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pas[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pascalTriangle(n);
        sc.close();
    }


}
