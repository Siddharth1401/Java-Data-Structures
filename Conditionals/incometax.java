import java.util.Scanner;

public class incometax {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int income = scn.nextInt();
        
        if (income < 500000) {
            System.out.println("0 tax");
        }
        else if (500000 <= income && income < 1000000) {
            System.out.println(income*0.2 + "Tax");
        }
        else if (income <= 1000000) {
            System.out.println(income*0.3);
        }
    }
}
