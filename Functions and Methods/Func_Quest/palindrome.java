public class palindrome {

    
    public static void main(String args[]) {
        if(palind(40404)) {
            System.out.println("palindrome");
        }
        else {
            System.out.println("not palindrome");
        }
    }

    public static boolean palind(int number) {
        int palindrome = number;
        int reverse = 0;

        while(palindrome > 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10  + remainder;
            palindrome = palindrome/10;
        }
        if (number == reverse) {
                return true;
            }
        return false;
    }

    
}
