package BitManupulation;

import java.util.Scanner;

public class BitManupulation {
    public static void OddorEven(int n){
        if((n&1)==1){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }
    }
    public static int  getIthBit(int n, int i){
        int bitmask = 1<<i;
        System.out.println(bitmask);
        if((n & bitmask) == 0){
            return 0;
        } else{
            return 1;
        }

    }
    public static void setBit(int  n,int i){
        int bitmask = 1<<i;
       int newint= (n|bitmask);
       System.out.println(newint);

        
    }
    public static int clearBit(int n,int i){
        int bitmask = ~(1<<i);
        return(n & bitmask);
    }
    public static void updateBit(int n, int i, int newBit){
        if(newBit == 0){
            clearBit(n, i);
        }
        else{
            setBit(n, i);
        }
    n = clearBit(n, i);
    int bitmask = newBit<<i;
    System.out.println((n|bitmask));

    }
    public static void clearIbits(int n, int i){
        int bitmask = (~0)<<i;
        System.out.println((n&bitmask)); 
    }
    public static void clearRangeOfBits(int n,int i,int j){
        int a = (~0<<j);
        int b = (1<<i)-1;
        int newBitMask = a|b;
        int ans = n&newBitMask;
        System.out.println(ans);
    }
    public static int countSetBit(int n){
        int count = 0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n = n>>1;
        }
        return count;
    }


    public static boolean powerOf2(int n){
        if((n&(n-1))==0){

        return true;
        }
        return false;
    }
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n = sc.nextInt();
        // OddorEven(n);
        // int i = sc.nextInt();
        // int newBit = sc.nextInt();
        // setBit(n,i);
        // clearBit(n, i);
        // updateBit(n, i, newBit);
        // clearIbits(n, i);
        // clearRangeOfBits(n, i, newBit);
        System.out.println(countSetBit(n));
    //   System.out.println(  getIthBit(n, i));
        sc.close();
    }
}
