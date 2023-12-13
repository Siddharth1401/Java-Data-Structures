public class quickSort {
    // avg TC - O(nlogn) SC - O(1)
    // pivot and partition
    // Step 1: choose a pivot - random element
    // Step 2: order before and after them
    // Step 3: quickSort elements
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        } System.out.println();
    }

    public static void quickSorting(int arr[], int si, int ei){
        //base
        if(si >= ei){
            return;
        }

        //last element
        int pidx = partition(arr, si, ei);
        quickSorting(arr, si, pidx-1); //left part
        quickSorting(arr, pidx+1, ei); // right
    }

    public static int partition(int arr[], int si, int ei){
        int pivot = arr[ei];
        int i = si - 1; //var1 to make place for eles smaller the pivot
    

        for(int j = si; j<ei; j++){
            if(arr[j] <= pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
           } 
        }
        i++;
                //swap
                int temp = pivot;
                arr[ei] = arr[i];
                arr[i] = temp;
                return i;
    }

    public static void main(String args[]){
        int arr[] = {6, 3, 9, 8, 2, 5};
        quickSorting(arr, 0, arr.length-1);
        printArr(arr);
    }
}
