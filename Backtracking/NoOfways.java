package Backtracking;

public class NoOfways {
    static int factor(int n){
        if(n==1||n==0)
        return 1;
        return n*factor(n-1);
    }
    static int optimizedNoOfWay(int n,int m){
        /*
         (n+m)!
         _______
         (n)! (m)!
         */
        int upper = factor((n-1)+(m-1));
        int lower = factor(n-1)*factor(m-1);
        return(upper/lower);

    }
    static int nofWays(int i,int j,int m,int n){
        if(i==n-1 && j ==m-1){
            return 1;
        }
        else if(i==n || j==m){
            return 0;
        }
        return nofWays(i+1, j, m, n)+nofWays(i, j+1, m, n);
    }
    public static void main(String[] args) {
    // System.out.println(nofWays(0, 0, 3, 3)); 
    System.out.println(optimizedNoOfWay(4, 4));
  }
}
