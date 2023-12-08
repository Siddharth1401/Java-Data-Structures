public class reverse_num {
    public static void main(String args[]) {
        // last digit = n%10
        // last digit remove = n/10

        //for loop;
        for (int n = 102; n > 0; n = n/10) {
            System.out.print(n % 10);
        }
        System.out.println(); 
        int n = 102;

        //while loop;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n/10;
        }
    }
}
