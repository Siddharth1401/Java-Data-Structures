import java.util.Scanner;

public class posit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String state = (a > 0)? "positive":"Negative";
        System.out.println(state);
    }
}
