package Backtracking;

public class BackTracking {
    static boolean isSafe(char[][]chess,int rows,int columns){
        //vertical checking
        for (int i = rows-1;  i>=0; i--) {
            if(chess[i][columns]=='Q')
            return false;
        }
        //left diagonal
        for (int i = rows-1,j=columns-1; i>=0 && j>=0; i--,j--) {
            if(chess[i][j]=='Q')
            return false;
        }
        //right diagonal
        for (int i = rows-1,j=columns+1; i>=0 && j<chess.length; i--,j++) {
            if(chess[i][j]=='Q')
            return false;
        }
        return true;
    }
    static int count = 0;
    static void nQueens(char[][]chess,int rows){
        if(rows == chess.length){
            count++;
            printQueens(chess);
            return;
        }
        for (int j = 0; j < chess.length; j++) {
            if(isSafe(chess,rows,j)){
                chess[rows][j]='Q';
                nQueens(chess, rows+1);
                 chess[rows][j]='X';
            }
           
        }
    }
    static void printQueens(char[][]chess){
        System.out.println("-------chessboard----");
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                System.out.print(chess[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void assignQueens(char[][]chess){
            for (int i = 0; i < chess.length; i++) {
                for (int j = 0; j < chess.length; j++) {
                    chess[i][j]='X';
                }
            }
    }
    static void permutaion(String str , String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newsStr = str.substring(0, i)+str.substring(i+1, str.length());
            permutaion(newsStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        // permutaion("abcd", "");
        int n = 4;
        char [][]chess = new char[n][n];
        assignQueens(chess);
        nQueens(chess, 0);
        System.out.println(count);
    }
}
