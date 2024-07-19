package Recursion;

public class Recursion {
    public static void sumOfSubsequences(int [] arr,int idx,int sum){
        if(idx>=arr.length){
            System.out.println(sum);
            return ;
        }
        sumOfSubsequences(arr, idx+1, arr[idx]+sum );
        sumOfSubsequences(arr, idx+1, sum );
    }

    public static int lastOccurence(int []arr, int i , int key){
        if(i==arr.length){
            int isfound = -1;
            return isfound;
        }
         
        int isfound = lastOccurence(arr, i+1, key) ;
        if(isfound!=-1)
        return isfound;
         if( arr[i]==key  ){
            return i;
         }else{
            return -1;
         }
    }

    public static int tiling(int n ){
        // base case 
        if(n==0||n==1){
            return 1;
        }
        int verticallyPlaced = tiling(n-1);
        int horizantallyPlaced = tiling(n-2);
        return verticallyPlaced+horizantallyPlaced;
    }
    public static void duplicate (String str, int idx, StringBuilder sb, boolean [] alplhabetChecker){
        if(idx >= str.length()){
            System.out.println(sb);
            return;
        }
        char curr = str.charAt(idx);
        if(alplhabetChecker[curr-'a']==false){
            alplhabetChecker[curr-'a'] = true;
            duplicate(str, idx+1, sb.append(curr), alplhabetChecker);
        }
        else{
            duplicate(str, idx+1, sb, alplhabetChecker);

        }
    }
    public static int friendsPairing(int n){
        if(n==1||n==2)
        return n;
        return friendsPairing(n-1)+(n-1)*friendsPairing(n-2);
    }
    public static void  binaryProblem(int n,int lastDigit,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        if(lastDigit ==0){
            binaryProblem(n-1, 0, str+"0");
            binaryProblem(n-1, 1, str+"1");
        }
        else{
            binaryProblem(n-1, 0, str+"0");
        }
    }
     public static void main(String [] args){
        // int [] arr = {2,4,5,2,4,6,8,2};
        // int key = 4;
        // boolean [] alplhabetChecker = new boolean [26];
        // // System.out.println(tiling(4));
        // String str = "apnacollege";
        // StringBuilder sb = new StringBuilder("");
        // duplicate(str, 0, sb, alplhabetChecker);
        // System.out.println(friendsPairing(4));
        // sumOfSubsequences(arr, 0, 0);
        binaryProblem(3, 0, "");
     }
}
