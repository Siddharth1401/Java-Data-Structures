import javax.xml.transform.Result;

public class binomial_fuct {

    public static int factorial(int a) {
        int fact = 1;
        for ( int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binomial(int n, int r) {
        int n_fac = factorial(n);
        int r_fac = factorial(r);
        int n_min_r_fac = factorial(n-r);
        int result = n_fac/(r_fac*n_min_r_fac);
        return result;
    }
    public static void main(String args[]) {
        int n = 5;
        int r = 2;
        System.out.println(binomial(n, r));
    }
}
