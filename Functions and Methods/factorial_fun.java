public class factorial_fun {

    public static int factorial(int a) { //the value of number of which factorial is to be calculated
        int fact = 1; // to caculate factorial value
        for (int i = 1; i <= a; i++) { // i is to iterate the loop
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        int a = 6;
        int result = factorial(a);
        System.out.println(result);
    }
}
