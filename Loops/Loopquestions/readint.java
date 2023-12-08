import java.util.Scanner;

public class readint {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int fac = sc.nextInt();
        int sum = 1;

        for (int i = 1; i <= fac; i++) {
            sum *= i; // sum = sum * i
        } 
        System.out.println(sum);
    }
}
