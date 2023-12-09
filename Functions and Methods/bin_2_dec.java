public class bin_2_dec {
// 101 = 4 + 0 + 1
    public static void bin2dec(int binary) {
        int pow = 0;
        int dec = 0;
        

        while (binary > 0) {
        int last_digit = binary % 10; // last digit
        dec = dec + (last_digit * (int)Math.pow(2, pow));
        
        pow++;
        binary = binary/10;

        }
        return dec;
    }
    public static void main(String args[]) {
        System.out.println(bin2dec(11111111));
    }
}
