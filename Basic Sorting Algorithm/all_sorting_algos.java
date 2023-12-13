// Swapping the adjacent elements and the largest ones come to the end of array.
// n - 1 turns
// TC: O(n^2) 

import java.util.Arrays;
import java.util.Collections;

public class Bubble_sort {

    public static void bubbleSort(int numbers[]) {
        for (int turns = 0; turns < numbers.length - 1; turns++) {
            for (int i = 0; i < numbers.length - 1 - turns; i++) {
                if (numbers[i] > numbers[i+1]) {
                    // swap
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }
        }
    }
 
    public static void SelectionSort(int numbers[]) {
        // add this to index 0 to n-1
        for (int j = 0; j < numbers.length - 1; j++) { // n - 1 because last one need not be checked 

            // find smallest one once with index
            int minPos = j;
            for (int i = j + 1; i < numbers.length; i++) {
                if (numbers[minPos] > numbers[i]) {
                    minPos = j; // smaller found
                }
            }
            // swap using temp
            int temp = numbers[minPos]; // smallest found
            numbers[minPos] = numbers[j];
            numbers[j] = temp;
        }
    }

    public static void insertionSort(int numbers[]) {
        // pick an element from unsorted part and place it in right position in the sorted part
        // n-1 elements in right order
        for (int i = 1; i < numbers.length; i++){
            int curr = i; 
            int prev = i-1;
            //finding out the correct position
            while(prev >= 0 && numbers[prev] > numbers[curr]){ // push while prev elements are bigger
                numbers[prev+1] = numbers[prev];
                prev--;

            }
            // insertion
            numbers[prev+1] = numbers[curr]; 
        }
    }

    public static void countingSort(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++){
            largest = Math.max(largest, numbers[i]);
        }

        int count[] = new int[largest+1];
        for (int i = 0; i < numbers.length; i++) {
            count[numbers[i]]++;
        }

        //sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]> 0){
                numbers[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printNum(int numbers[]) {
        for (int k = 0; k < numbers.length; k++) {
            System.out.print(numbers[k] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = {5, 4, 1, 3, 2, 7, 88};
        // SelectionSort(numbers);
        // inbuilt sort
        // Collection Reverse needs object type variable
        // Arrays.sort(numbers);
        countingSort(numbers);
        printNum(numbers);
    }
}