public class largest_in_array {

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinite
        int smallest = Integer.MAX_VALUE; // infinite

        for (int i =0; i < numbers.length; i++) {
            if ( numbers[i] > largest) {
                largest = numbers[i];
            }

            if ( numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is : " + smallest);
        return largest;
    } 

    public static void main(String[] args) {
        int numbers [] = {97, 98, 99, 7};

        System.out.println("Largest number is :" + getLargest(numbers));
    }
}
