
import java.util.Scanner;

public class Duplicate {
    public static boolean duplicate(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    return true;
                }
            }
        }
        return false;
    }
    public static int findElement_K_rotated(int arr[],int search){
        //using two pointer Concept 
        int st = 0;
        int end = arr.length-1;
        int mid = (st+end)/2;
        while(st<=end){
            if(arr[mid] == search){
                return mid;
            }
            if(arr[st]==search){
                return st;
            }
            if(arr[end]==search){
                return end;
            }
            st++;end--;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the element of"+i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Emter element to be search");
        int search = sc.nextInt();
        // System.out.println(duplicate(arr));
        // System.out.println(findElement_K_rotated(arr, search));
        Solution s = new Solution();
        s.search(arr, search);
        sc.close();
    }
}

class Solution {
    public int search(int[] nums, int target) {
        int min = minSearch(nums);
        if(nums[min]<target && target <=nums[nums.length-1]){
            return binarySearch(nums,min,nums.length-1,target);
        }
        else{
            return binarySearch(nums,0,min,target);
        }
    }
    public static int binarySearch(int nums[],int st,int end,int target){
        while(st<=end){
            int mid = st + (end-st)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if (nums[mid]>target){
                st = mid-1;
            }
            else{
                end = mid+1;
            }
        }
        return -1;
    }
    public static int minSearch(int nums[]){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(mid>0 && nums[mid-1] >nums[mid]){
                return mid;
            }
            else if(nums[left]<= nums[mid] && nums[mid]>nums[right]){
            left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }
}
