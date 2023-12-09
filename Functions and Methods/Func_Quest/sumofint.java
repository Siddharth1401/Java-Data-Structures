public class sumofint {
    
    public static int sum_int(int a) {
        int sum = 0;

        while (a > 0) {
        int last_digit = a % 10;
        sum = sum + last_digit;

        a = a/10;
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(sum_int(5121));
    }
}
