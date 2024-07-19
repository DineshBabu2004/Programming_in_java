package SortQuestions;

public class SortQues {
    public static int searchInrotatedArray(int []arr,int st,int end,int target){
        if(st>=end){
            return -1;
        }
        int mid = (st+end)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[st]<arr[mid]){
            if(arr[st]<=target && arr[mid]>=target){
                return searchInrotatedArray(arr, st, mid, target);
            }
            else{
                return searchInrotatedArray(arr, mid+1, end, target);
            }
        }else{
            if(arr[mid+1]<=target && arr[end]>=target)
            return searchInrotatedArray(arr, mid+1, end, target);
            else
            return searchInrotatedArray(arr, st, mid, target);
        }
    }

    public static void selectionSortQuestion(String []s){
            for (int i = 0; i < s.length-1; i++) {
                int min = i;
                for (int j = i+1; j < s.length; j++) {
                    if(s[min].compareTo(s[j])<0){
                        min = j;
                    }
                }
                String temp = s[i];
                s[i] = s[min];
                s[min]=temp;
                
            }
    }
    public static void buubleSortQuestion(int []arr){
       
       /* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

        Note that you must do this in-place without making a copy of the array.

 

            Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]*/
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]==0 && arr[j+1]!=0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }
            }
            
        }
    }
    public static void display(int []arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
   public static void displayString(String[]s){
        for (String string : s) {
            System.out.print(string+" ");
        }
        System.out.println();
    }
    public static void swap(int []arr,int st,int end){
        int temp = arr[st];
        arr[st]= arr[end];
        arr[end]=temp;
        }
    public static void bubbleSortQues2(int []arr){
        //pushing odd element at the end of the array using optimal method it takes O(n)(two pointer )
        int st =0,end = arr.length-1;
        while(st<end){
            if((arr[st]%2==0))
            st++;
            else if((arr[end]%2)!=0)
            end--;
            if((arr[st]%2!=0)&&(arr[end]%2==0)){
                if(st<end){
                    swap(arr, st, end);
                    st++;end--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {12,34,45,9,8,90,3};
        // display(arr);
        // buubleSortQuestion(arr);
    //    System.out.println(searchInrotatedArray(arr, 0, arr.length-1, 9)); 
        // display(arr);
        // String [] s = {"papaya","lime","watermelon","apple","mango","kiwi"};
        // displayString(s);
        // selectionSortQuestion(s);
        // displayString(s);
        display(arr);
        bubbleSortQues2(arr);
        display(arr);
    }
}
