public class QuickSort{
    public static void swap(int []arr,int st,int pivotIndex){
        int temp = arr[st];
        arr[st]=arr[pivotIndex];
        arr[pivotIndex]=temp;

    }
    public static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int lessthan = 0;
    
        for (int j = st + 1; j <= end; j++) {
            if (arr[j] < pivot) {
                lessthan++;
            }
        }
    
        int pivotIndex = st + lessthan;
        swap(arr, st, pivotIndex);
    
        int i = st, j = end;
        while (i < pivotIndex && j > pivotIndex) {
            while (i < pivotIndex && arr[i] < pivot) {
                i++;
            }
            while (j > pivotIndex && arr[j] >= pivot) {
                j--;
            }
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    
    public static void quickSort(int []arr,int st,int end){
        if(st>=end){
            return ;
        }
        int pivot = partition(arr,st,end);
        quickSort(arr,st,pivot-1);
        quickSort(arr,pivot+1,end);
    }
    static void display (int []arr){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int []arr = {7,5,2,9};
        display(arr);
        quickSort(arr,0,arr.length-1);
        display(arr);

    }
}