public class sorted_array {
    public static boolean checkSorted(int i, int arr[]){
        //base
        if(i == arr.length-1){
            return true;
        }
        
        if(arr[i] > arr[i+1]){
            return false;
        }

        //working
        return checkSorted(i+1, arr); //recur with increment
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 4, 5};
        //call
        System.out.println(checkSorted(0, arr));
    }
}
