public class dec_2_bin { 

    public static void dec2bin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        
        while (n > 0) {
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            
            pow++;
            n = n/2;
        }  

        System.out.println("binary form of " + myNum + " = " + binNum);
    }

    public static void main(String args[]) {
        dec2bin(3);
    }
}

// method scope: is a variable can be used after defining in a function. It can inly be used as a parameter outside.

//Block scope: variable init inside brackets cannot be used outside.
