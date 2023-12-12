// IMP: divide and compare the key to the mid and move your way between the sorted array
// start, mid, end
// Time Complexity: no. of searches
// n, n/2, n/4, n/8...
// linear search TC : n
// n / 2^k = 1; k = log(n); O(logn)

public class Binary_Search {
    public static int binarySearch(int numbers[], int key) {
        int start = 0;
        int end = numbers.length - 1;

        while (start <= end) { // last element will have same start, mid, end
            int mid = (start + end)/2;
            if (numbers[mid] == key) {
                return mid; //found
            }
            if (numbers[mid] < key) { // right half
                start = mid + 1;
            }
            else { // left half
                end = mid -1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 3, 4, 6, 8, 9};
        System.out.println("Index for key is : "+ binarySearch(numbers, 9));
    }
}
