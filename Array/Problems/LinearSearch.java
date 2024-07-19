package Array.Problems;
import java.util.Scanner;

public class LinearSearch {
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
        // FindIndex fi = new FindIndex();
        // fi.findIndex(arr, search);
        LargestElement le = new LargestElement();
        le.largestElement(arr);
        sc.close();
    }
}
class FindIndex{
    public void findIndex(int arr[],int key ){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                System.out.println("Index is at "+(++i));
            }
        }
}
}
class LargestElement{
    public void largestElement(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("max elemnt is "+max);
    }
}