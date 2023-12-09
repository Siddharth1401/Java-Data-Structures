// user defined methods - product, factorial

// in-built methods - math - power, sqrt, max, sc.nextint()

//function overloading: multiple functions with name with differnt parameters
// for eg: product of 2 numbers with different type, int, float, double
//change the number of parameters

public class func_overload {
    // public static int sum(int a, int b) { // overloading using parameters
    //     return a+b;
    // }
    // public static float sum(float a, float b, float c) {
    //     return a+b+c;
    // }
    public static boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
            return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        // System.out.println(sum(5, 6));
        // System.out.println(sum(5.5f , 6, 6));

        System.out.println(isPrime(2));
    }
}
