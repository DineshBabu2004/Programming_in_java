package Array.Problems;

import java.util.*;

public class Binarysearch {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element of"+i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be searched");
        // int search = sc.nextInt();  
        // Search s = new Search();
        // s.binarySearch(arr, n, search);  
        // ReverseArray ra = new ReverseArray();
        // ra.reverseArray(arr);
        // PairsinArray pia = new PairsinArray();
        // pia.pairsArray(arr);
        // SubArrays sa = new SubArrays();
        // sa.subArrays(arr);
        // PrefixSubArrays psa = new PrefixSubArrays();
        // psa.prefixSubArrays(arr);
        // KadenesAlgorithm ka = new KadenesAlgorithm();
        // ka.kadenes(arr);
        // TrappingRainwater tr = new TrappingRainwater();
        // tr.trappingRainWater(arr);
        Stockprice sp = new Stockprice();
        sp.stockPrice(arr);
        sc.close();    
    }
}
//binary search code 
class Search{
    public void binarySearch(int arr[],int  n,int search){
        int st = 0;
        int end=n-1;
        while(st<=end){
           int mid = (st+end)/2;
           if(arr[mid] ==search){
            System.out.println("found at"+(mid+1)+arr[mid]);
            break;
           }
           if(search>arr[mid]){
            st=mid+1;
           }
           if(search<arr[mid]){
            end = mid-1;
           }
        }
    }
}
class ReverseArray{
    public void reverseArray(int arr[]){
        int st,end=arr.length-1;
        st=0;//swapping using two pointer method
        while(st<=end){
            //swapping
            int temp = arr[st];
            arr[st] = arr[end] ;
            arr[end] = temp;
            st++;end--;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
class PairsinArray{
    public void pairsArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
}

class SubArrays{
    //calculation of subarrays with max sum arrays
    public void subArrays(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
                    int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                System.out.print("[");
                int sum =0;
                for (int j2 = start; j2 <=end; j2++) {
                    System.out.print(arr[j2]+",");
                    sum+=arr[j2];
                }
                if(sum>max)
                max=sum;
                System.out.print("] ");
            }
         System.out.print("  "+max);
            System.out.println();
        }
        System.out.println("max element of of the sub array"+max);
    }
}
class PrefixSubArrays{
    public void prefixSubArrays(int arr[]){
        int max = Integer.MIN_VALUE;
        int prefix [] = new int [arr.length];
        prefix[0]= arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i]= arr[i]+prefix[i-1];
            System.out.print(prefix[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
                    int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum =0;
              sum = start>0 ? prefix[end] - prefix[start-1]:prefix[end];
                if(sum>max)
                max=sum;

            }
         System.out.print("  "+max);
            System.out.println();
        }
        System.out.println("max element of of the sub array"+max);
    }
}

class KadenesAlgorithm{
    public void kadenes(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE  ;
        int currSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum +arr[i];
            if(currSum<0){
                currSum = 0;
            }
            max = Math.max(max,currSum);
            System.out.print(max+" ");
        }
        System.out.println("max is "+max);
        if(max == 0){
            for (int i = 0; i < arr.length; i++) {
                min = Math.max(min,arr[i]);
            }
            System.out.println(min);
        }
    }
}
class TrappingRainwater{
    public void trappingRainWater(int arr[]){
        //calculate left aux array
        int left [] = new int[arr.length];
        left[0]=arr[0]; // left val remains same
        for (int i = 1; i < arr.length; i++) {
            left[i]= Math.max(arr[i],left[i-1]);
        }
        // Calculate right auxillary array
        int right [] = new int[arr.length];
        right[arr.length-1]= arr[arr.length-1];
        for (int i = arr.length-2; i >=0; i--) {
            right[i]=Math.max(arr[i],right[i+1]);
        }
        //find min of them 
        int currLevel =0,sum=0;
        for (int i = 0; i < arr.length; i++) {
         //waterlevel - original value of the bar
            currLevel = Math.min(left[i],right[i]);
            sum = sum+(currLevel-arr[i]);
        }
        System.out.println(sum+" :max  of water can hold ");
       
    }
}
class Stockprice{
    public void stockPrice(int arr[]){
        // buying price 
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit =0;
        for (int i = 0; i < arr.length; i++) {
            if(buyingPrice<arr[i]){
                int profit =arr[i]- buyingPrice;
                maxProfit = Math.max(profit,maxProfit);
            }
            else{
                buyingPrice = arr[i];
            }
        }
        System.out.println("max Profit is "+maxProfit);
    }
}
