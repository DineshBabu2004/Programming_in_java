import java.util.Scanner;
public class javaMain {
    public static void spiralMatrix(int [] [] arr, int r,int c){
        int element = 0, strow = 0, endrow = r-1, stcol =0,endcol = c-1; 
        while(element<r*c){
            //TOP
            for (int i = stcol; i <= endcol && element<r*c; i++) {
                System.out.print(arr[strow][i]+ " ");
                element++;
            }
            strow++;
            //RIGHT
            for (int j = strow; j<=endrow && element<r*c ; j++) {
                System.out.print(arr[j][endcol]+ " ");
                element++;
            }
            endcol--;
            //BELOW
            for (int i = endcol; i >=stcol && element<r*c; i--) {
                System.out.print(arr[endrow][i]+ " ");
                element++;
                  }
            endrow--;
            //LEFT
            for (int j = endrow; j >=strow && element<r*c ; j--) {
                System.out.print(arr[j][stcol]+ " ");
                element++;
            }
           stcol++;
        }
    }
    public static void diagonalSum(int [][]arr){
        int sum =0, n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==j)
                sum+=arr[i][j];
                if(i+j==arr.length-1)
                sum+=arr[i][j];
            }
        }
        if(arr.length % 2 ==0)
        System.out.println(sum);
        else
        System.out.println(sum-(arr[n/2][n/2]));
    }
    public static void diagonalSumTime(int [][]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][i];
            //i+j=arr.length-1;
            if(i!=arr.length-i-1)
            sum+=arr[i][arr.length-1-i];
        }
        System.out.println(sum);
       
    }
    public static void stairCase(int arr[][], int key){
        int r = 0;
        int c = arr[0].length-1;
        while(r<arr.length && c>=0){
            if(key == arr[r][c]){
                System.out.println("("+r+c+")");
                break;
            }
            else if (key<arr[r][c]) {
                c--;
            }
            else {
                r++;
            }
        }
        System.out.println("not found");
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int arr [][] = new int [rows] [col] ;
        System.out.println("Enter elements : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <col; j++) {
                arr[i][j] =  sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <col; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
         int key = sc.nextInt();
        // spiralMatrix(arr,rows,col);
        // diagonalSum(arr);
        // diagonalSumTime(arr);
        stairCase(arr, key);
        System.out.println();
        sc.close();
    }
   
}
