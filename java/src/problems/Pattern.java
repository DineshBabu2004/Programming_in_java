package problems;
import java.util.Scanner;
public class Pattern {
    public static void twistedPyramid(int n ){
        int start =1;
        for (int i = 1; i <= n; i++) {
            int num = start;
                for (int j = 1; j <=n-i; j++) {
                    System.out.print("    ");
                }
                for (int j = 1; j <=i; j++) {
                    System.out.printf("%4d",num);
                    num = num-(n-i+j);
                }
                start+=(n-i+1);
                System.out.println();
                
            
        }
    }
    public static void pascalTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2*i-1; j++) {
                if(j==1||j==n){
                    System.out.print(1+" ");
                }else{
                    System.out.print(((j-1)+(j+1))+" ");
                }
            }
        }
    }
    public static void waterPattern(char []arr){
        int n = arr.length;
        int mid = n/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // printing the horizontal water
                if(i == mid){
                    System.out.print(arr[j]+"  ");
                }// printing left diagonal
                else if(i==j ){
                    if(i!=n-i-1)//checks if center elemet is present there
                    System.out.print(arr[i]+"  ");
                    else{
                        System.out.print("   ");
                    }

                }
               
                else if(j == mid || j == n-i-1){ //right diagonal and  vertical mid
                    if(i!=n-i-1)
                    System.out.print(arr[i]+"  ");
                    else{
                        System.out.print("  ");
                    }
                }
                else{
                    System.out.print("   ");
                }
                
              
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the row of rows ");
       int rows  = sc.nextInt();
    //    int cols= sc.nextInt();
    //    Star st = new Star();
    //    st.printPattern(n);
    // Alphabet a = new Alphabet();
    // a.alphabetPatter(n);
    //    HollowPyramid hp = new HollowPyramid();
    //    hp.hollowPyramid(n);
    // InvertedPyramid ip = new InvertedPyramid();
    // ip.invertedpyramid(n);
    // InvertedHalfPyramid ihp = new InvertedHalfPyramid();
    // ihp.invertedHalfPyramid(n);
    // Floydstriangle ft  = new Floydstriangle();
    // ft.floydsTriangle(n);
    //  ZeroOne zo = new ZeroOne();
    //  zo.zeroOne(n);
    // Butterfly bf = new Butterfly();
    // bf.butterfly(n);
    // Rhombus r = new Rhombus();
    // r.rhombus(rows);
    // HollowRhombus hr = new HollowRhombus();
    // hr.hollowRhombus(rows);
    // Diamond d = new Diamond();
    // d.diamond(rows);
    // Swastika s = new Swastika();
    // s.swastika(rows);
    // NumberPyramid np = new NumberPyramid();
    // np.numberPyramid(rows);
    // PalindromicNumber pn = new PalindromicNumber();
    // pn.palindromicNumbers(rows);
    // String str = sc.nextLine();
    // ProgramPattern p = new ProgramPattern();
    // p.programPattern(str);
    // Mpattern m = new Mpattern();
    // m.mpattern(rows);
    // char []arr= {'g','o','u','r','a','v','r'};
    // waterPattern(arr);
    twistedPyramid(rows);
   
    sc.close();
    }
   
}

class Star {
    public  void printPattern(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Alphabet pyramid
class Alphabet{
    public void alphabetPatter(int rows){
        char ch = 'A';
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}


class HollowPyramid{
public void hollowPyramid(int n){
    for (int i = 1; i <= n ; i++) {
        for (int j =1; j <=n ; j++) {
            if(i==1||i==n||j==1||j==n){
                System.out.print("*"+" ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}
class InvertedPyramid {
    public void invertedpyramid(int n ){
        for (int i = 1; i <=n; i++) {
            
                // spaces
                for (int j2 = 1; j2 <= n-i; j2++) {
                    System.out.print(" ");
                }
                // stars
                for (int j2 = 1; j2 <= i; j2++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            
        }
    }
class InvertedHalfPyramid {
    public void invertedHalfPyramid(int n ){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
            // for (int j = 1; j <= n; j++) {
                
            // }
        }
    }
}
class Floydstriangle{
public void floydsTriangle(int n){
    int c = 1;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <=i; j++) {
            System.out.print((c++)+" ");
        }
        System.out.println();
    }

}
}
class ZeroOne {
  public void zeroOne(int n ){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <=i; j++) {
            if((i+j)%2==0)
            System.out.print(1+" ");
            else
            System.out.print(0+" ");
        }
        System.out.println();
    }

}
  }  
  class Butterfly{
    public void butterfly(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*n-2*i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i>=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*n-2*i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

  }
  class Rhombus{
    public void rhombus(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
}
  }
class HollowRhombus{
    public void hollowRhombus(int rows){
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= rows; j++) {
              if(i==1||i==rows||j==1||j==rows)
              System.out.print("*");
              else
              System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Diamond{
    public void diamond(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i >=1; i--) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class Swastika{
    public void swastika(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // For printing horizontal and vertical lines of the Swastika
                if(n%2==0){
                if (i == n / 2  || j == n / 2 )
                    System.out.print("* ");
                // For printing upper right and lower left arms
                else if ((i == 1 && j > n / 2 ) || (i <= n / 2 && j == 1))
                    System.out.print("* ");
                // For printing upper left and lower right arms
                else if ((i == n && j < n / 2 ) || (i > n / 2  && j == n))
                    System.out.print("* ");
                // For printing spaces
                else
                    System.out.print("  ");
            }
                else{
                if (i == n / 2+1 || j == n / 2 +1 )
                    System.out.print("* ");
                // For printing upper right and lower left arms
                else if ((i == 1 && j > n / 2 + 1) || (i <= n / 2 + 1 && j == 1))
                    System.out.print("* ");
                // For printing upper left and lower right arms
                else if ((i == n && j < n / 2 + 1) || (i > n / 2 + 1  && j == n))
                    System.out.print("* ");
                // For printing spaces
                else
                    System.out.print("  ");
            }

        }
            System.out.println();
        }
    
}
}

class NumberPyramid {
    public void numberPyramid(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

class PalindromicNumber{
    public void palindromicNumbers(int n ){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class ProgramPattern{
    public void programPattern(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(i==j)
                System.out.print(str.charAt(i));
                if(i!=str.length()-1-i)
                if(i+j==str.length()-1){
                    System.out.print(str.charAt(i));
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
class Mpattern {
    public void mpattern(int n) {
        for (int i = 1; i <= n; i++) {
            // Leading spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // First half of the M
            for (int j = 0; j < 2 * i - 1; j++) {
                if (i == 1 || j == 0 || j == 2 * i - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Trailing spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Second half of the M
            for (int j = 0; j < 2 * i - 1; j++) {
                if (i == n && j == 0) {
                    continue;
                }
                if (i == 1 || j == 0 || j == 2 * i - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
