package BasicSort;
import java.util.*;
public class BasicSort {
    public static void bubbleSort(int [] arr){
        //comparison with n-2 idx only
        int n = arr.length-1;
    for (int i = 0; i < n; i++) {
        //comparison with only unfixed elements
        for (int j = 0; j <n-i; j++) {
            if (arr[j]>arr[j+1]) {
             int temp = arr[j];
             arr[j] = arr[j+1];
            arr[j+1] = temp;
            }
            System.out.println(arr[i]);
        }
        
    }
    for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
    }
    }
    public static void selectionSort(int []arr){
        int min ;
        for (int i = 0; i <= arr.length-2; i++) {
            min = i;
            for (int j = i+1; j <= arr.length-1; j++) {
                if(arr[min]>arr[j]){
               min = j;
            }
           
        }
       int temp = arr[i];
       arr[i]= arr[min];
        arr[min]= temp;
       
    }
    arrayDisplay(arr);
}
public static void insertionSort(int [] arr){
    for (int i = 1; i < arr.length; i++) {
        int curr = arr[i];
        int prev = i-1;
        //pushing largest element to the sorted array
        while(prev >= 0 && arr[prev]>curr){
            arr[prev+1] = arr[prev];
            prev--;
        }
        //curr postion to insert 
        arr[prev+1]= curr;
    }
    arrayDisplay(arr);
}
public static void arrayDisplay(int arr[]){
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
    }
}

public static void countingSort(int []arr){
    // two Array are use 1.frequencyt Array 2.Normal array mmanipulation
    // Frequency Array

//finding max element to assign the size of frequency array
int max = Integer.MIN_VALUE;
for (int i = 0; i < arr.length; i++) {
    if(max<arr[i]){
        max = arr[i];
    }
}
    int freq [] = new int[max+1];
    for (int i = 0; i < arr.length; i++) {
        freq[arr[i]] =  freq[arr[i]]+1;
    }
    int j = 0;
    for (int i = 0; i < freq.length; i++) {
        while(freq[i]>0){
            arr[j++] = i;
            freq[i] = freq[i]-1;
        }
    }
    arrayDisplay(arr);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter elements");
            arr[i] = sc.nextInt();
        } 
        // selectionSort(arr);
        // insertionSort(arr);
        // inbuilt sort below code
        // Integer [] brr = {5,6,1,2,4};  
        // Arrays.sort(brr,Collections.reverseOrder());
        // for (int index = 0; index < brr.length; index++) {
        //     System.out.print(brr[index]+" ");
        // }
        countingSort(arr);
        sc.close();
    }
}
