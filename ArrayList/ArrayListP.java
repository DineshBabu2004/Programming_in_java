package ArrayList;
import java.util.*;

public class ArrayListP{
    public static boolean isMonotonic(int[] arr) {
        int increasing = 1;
        int decreasing = 1;
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1]){
                increasing++;decreasing++;
            }
            else if(arr[i]<arr[i+1])
            increasing++;
            else if(arr[i]>arr[i+1])
            decreasing++;
        }
        if((increasing==n)||decreasing==n)
        return true;
        return false;
    }
    static int waterLevel(ArrayList<Integer>height){
        int left =0;
        int right = height.size()-1;
        int max = Integer.MIN_VALUE;

        while(left<right){
            int minheight = Math.min(height.get(left),height.get(right));
            int length =right - left;
            int currVal = minheight*length;
            max = Math.max(max, currVal);
            if(height.get(left)<height.get(right)){
                left++;
            }
            else{
                right--;
            }
        }
        return max;

    }
    static void multiDimensionArrayList(){
            ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                list1.add(i*1);
                list2.add(i*2);

            }
            mainList.add(list1);
            mainList.add(list2);
            for (int i = 0; i <mainList.size(); i++) {
                ArrayList<Integer> currList =  mainList.get(i);
                for (int j = 0; j < currList.size(); j++) {
                    System.out.print(currList.get(j)+" ");
                }
                System.out.println();
            }
             System.out.println(list1);
            System.out.println(list2);
           System.out.println(mainList);   
            
    }
    public static boolean twoSuminSortedRotaedArray(ArrayList<Integer>arr, int target){
        int pivot = 0;
        //detecting pivot point
        for (int i = 0; i < arr.size()-2; i++) {
            if(!(arr.get(i)<arr.get(i+1)))
            pivot = i;
        }
        int right = pivot,left=pivot+1;
        int n = arr.size()-1;
        while(left!=right){
            if((arr.get(right)+arr.get(left))==target)
            return true;
           else if((arr.get(right)+arr.get(left))<target){
            left = (left+1)%n;
           }
           else{
            right= (right+n-1)%n;
           }
        }
        return false;

    }
public static void main(String[] args) {
    // multiDimensionArrayList();
//     Scanner sc = new Scanner(System.in);
//     ArrayList<Integer>height = new ArrayList<>();
//     for (int i = 0; i < 6; i++) {
//         int a = sc.nextInt();
//         height.add(a);
        
//     }
//     int target = 17;
  
//     // height.add(1);
//     // height.add(8);
//     // height.add(6);
//     // height.add(2);
//     // height.add(5);
//     // height.add(4);
//     // height.add(8);
//     // height.add(3);
//     // height.add(7);
//     // System.out.println(waterLevel(height));
//    System.out.println( twoSuminSortedRotaedArray(height, target));
//     sc.close();
    int arr[]= {6,5,4,4};
    System.out.println(isMonotonic(arr));

}
}