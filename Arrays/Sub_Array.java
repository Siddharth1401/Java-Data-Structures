//Continuous subpart of an array
// Brute Force(most basic soln): Max of sum of the subarray
// 3 nested loops give very high TC: O(n^3) 

//Max subarray sum using: Prefix Sum Approach
// Sum of subarray upto i.

public class Sub_Array {

    public static void subArray(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefixSum[] = new int[numbers.length];

        prefixSum[0] = numbers[0];
        // Calculate prefix array
        for ( int i = 1; i < prefixSum.length; i++){
            prefixSum[i] = prefixSum[i-1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++) { // iterating start element - for different starting subarrays
            for (int j = i; j < numbers.length; j++) { //iterating last element - to for different ending subarrays
                
                currSum = i == 0? prefixSum[j] : prefixSum[j] - prefixSum[i-1];


                // for (int k = i; k <= j; k++) { //printing subarray from first to last element
                //     // System.out.print(numbers[k] + " ");
                //     currSum += numbers[k];
                }
                // System.out.println(currSum);

                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
            System.out.println("The max sum is : " + maxSum);
        }


    // sigle for loop and simple
    public static void kandanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];

            if(cs < 0) {
                cs = 0;
            }

            maxSum = Math.max(cs, maxSum);
        }

        System.out.println("our max subarray sum is : " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        // subArray(numbers);
        kandanes(numbers);
    }
}

    
