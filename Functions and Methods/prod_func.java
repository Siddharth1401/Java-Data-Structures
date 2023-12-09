public class prod_func {

    public static int multiply(int a, int b) {
        int product = a*b;
        return product;
    }
    public static void main(String args[]) {
        int a = 3;
        int b = 5;
        int prod = multiply(a, b); // copy of a and b is being passed because it is call by value
        System.out.println(prod);
        prod = multiply(69, 69);
        System.out.println(prod);

    }
}
