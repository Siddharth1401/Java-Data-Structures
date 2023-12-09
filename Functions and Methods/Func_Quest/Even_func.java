public class Even_func {

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } 
        else {
            return false;
        }
    }
    public static void main(String args[]) {
        if (isEven(4)) {
            System.out.println("number is even");
        }
        else {
            System.out.println("Its odd");
        }
    }
}
