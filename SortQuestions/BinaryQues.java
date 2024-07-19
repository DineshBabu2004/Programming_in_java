package SortQuestions;

public class BinaryQues {
    public int[] searchRange(int[] arr, int target) {
        int[] idx = {-1, -1}; // Initialize the index array with -1, -1
        
        // Find the first occurrence of target
        idx[0] = findFirstOccurrence(arr, target);
        
        // Find the last occurrence of target
        if (idx[0] != -1) { // If the first occurrence is found, search for the last occurrence
            idx[1] = findLastOccurrence(arr, target);
        }
        
        return idx;
    }
     public boolean searchMatrix(int[][] arr, int target) {
        int n = arr.length,m=arr[0].length;
        int st = 0, end = n*m -1;
        while(st<=end){
            int mid = st+(end-st)/2;
            int value = arr[mid/m][mid%m];
            if(value == target)
            return true;
            if(value>target){
                    end =mid-1;
            }
            else{
                st = mid+1;
            }
        } 
        return false;
    }

    private int findFirstOccurrence(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        int firstOccurrence = -1;
        
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                firstOccurrence = mid; // Potential first occurrence
                end = mid - 1; // Move to the left side to find the first occurrence
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        
        return firstOccurrence;
    }

    private int findLastOccurrence(int[] arr, int target) {
        int st = 0;
        int end = arr.length - 1;
        int lastOccurrence = -1;
        
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == target) {
                lastOccurrence = mid; // Potential last occurrence
                st = mid + 1; // Move to the right side to find the last occurrence
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        
        return lastOccurrence;
    }

    public static int squareRoot(int n){
        //input = 11 output = 3;
         int st = 0;
         int end = n;
         int value = 0;
        
         while(st<=end){
            int mid = st+(end-st)/2;
            if(mid*mid == n)
                return mid;
             if(mid*mid>n)
             end = mid-1;
             else{
                st = mid+1;
                value =mid;
             }
         }
         return value;
    }
    public static int minElement(int[]arr,int st,int end, int value){
        // find the min element in the rotated array
        if(st>=end){
            return value;
        }
        int mid = st +(end-st)/2;
       if(arr[mid]<=arr[end]){
        value = mid;
        end=mid-1;
        
        return minElement(arr, st, end, value);
       }
       else {
            st = mid+1;
             return minElement(arr, st, end, value);
       }
      

       
    }
    public  static int findPeakElement(int[] arr) {
        /* Input: nums = [1,2,1,3,5,6,4]
             Output: 5
            Explanation: Your function can return either index number 1 
            where the peak element is 2, or index number 5 where the peak element is 6. */
        int st = 0,end = arr.length-1;int ans = 0;  
    
  while(st<=end){
      int mid = st+(end-st)/2;
       if((mid==0 ||arr[mid]>arr[mid-1])&& (mid==arr.length-1||arr[mid]>arr[mid+1]))
               return mid;
      if(arr[mid]<arr[mid+1]){
          ans = mid +1;
          st = mid+1;
      }else{
          end = mid-1;
      }
  }return ans;
}
    public static int peakIndexMountainArray(int[] arr) {
       /* Input: arr = [0,10,5,2]
        Output: 1*/ 
        int st = 0,end = arr.length-1;int ans = 0;
        
   while(st<=end){
       int mid = st+(end-st)/2;
       if(arr[mid]<arr[mid+1]){
           ans = mid +1;
           st = mid+1;
       }else{
           end = mid-1;
       }
   }return ans;
}

    public static void main(String[] args) {
         int []arr = {1,2};
        // System.out.println(firstoccurance(arr, 0, arr.length-1, 8));
        // System.out.println(squareRoot(44));
        System.out.println(findPeakElement(arr));
        

    }
}
