public class mergeSort{ //divide big problems into small and solve
    // merge sort - TC - O(nlogn) SC - O(n) depth first
    // Step 1: divide - mid (si+ei)/2 or si + (ei-si)/2
    // Step 2: mergeSort(all left then all right)
    // Step 3: Merge them - compare left and right

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSorting(int arr[], int si, int ei){
        //base - si >= ei
        if(si >= ei){
            return;
        }

        //kaam - divide and mergSort(L & R) and merge
        int mid = si + (ei - si) / 2;
        mergeSorting(arr, si, mid); //left recursion
        mergeSorting(arr, mid + 1, ei); //right recursion
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int mid, int ei){
        //iterators
        int temp[] = new int[ei-si+1]; 
        int i = si; //iternator for left part
        int j = mid + 1; // right iterator
        int k = 0; //iter for temp arr

        // compare and copy to temp
        while(i <= mid && j <= ei){
            //to add left ele to temp
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++; 
            } else{ //add right
                temp[k] = arr[j];
                j++;
            }
        }   
        k++;

        //left leftover
        while(i <= mid){
            temp[k++] = arr[i++];
        }

        //right part left
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to orig arr
        for(k = 0, i = si; k < temp.length; k++, i++){
            arr[i] = temp[k]; //0 to finish copied
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        mergeSorting(arr, 0, arr.length-1);
        printArr(arr);
    }
}