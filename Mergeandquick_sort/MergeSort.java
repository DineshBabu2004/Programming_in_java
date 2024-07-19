public class MergeSort {
    public static void mergeArray(int []arr,int l,int mid,int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int i = 0,j=0;
         
        int []left = new int [n1];
        int []right = new int[n2];
        for (int k = 0; k < n1; k++) {
             left[k]  = arr[l+k];
        }
        for (int k =0; k < n2; k++) {
             right[k]  = arr[mid+1+k];
             
        }
        int m = l;
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
              arr[m++]=left[i++];
            }
            else{
                arr[m++]=right[j++];
            }
        }
        while(i<n1){
            arr[m++]=left[i++];
        }
        while(j<n2){
            arr[m++]=right[j++];
        }
    }
    public static void mergeSort(int[] arr, int l,int r){
        if(l>=r){
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        mergeArray(arr,l,mid,r);
    }
    static void display(int arr[]){
        for (int i : arr) {
           System.out.print(i+" "); 
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {4,1,5,2,6};
        display(arr);
        int r = arr.length-1;
        int l = 0;
        mergeSort(arr,l,r);
        display(arr);
    }
}
