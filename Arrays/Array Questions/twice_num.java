
public class twice_num {

    public static boolean twiceNum(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) { // scan array from i
            // see if any repeats
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true; // return when one final value
                    // print when lots of answers
                }
            }
        }

        return false;

    }
    public static void main(String[] args) {
        int numbers[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(twiceNum(numbers));
    }    
}
