public class prime_range {

    public static boolean isPrime(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
            return false;
            }
        }
        return true;
    }

    public static void primeRange(int a) {
        for (int i = 2; i <= a; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String args[]) {
        primeRange(20);
    }
}
