import java.util.Scanner;

public class switchcal {
    public static void main(String args[]) {
        while(true){
        Scanner sc = new Scanner(System.in);
		System.out.println("Int a:");
        int a = sc.nextInt();
		System.out.println("Int b:");
        int b = sc.nextInt();
		System.out.println("Enter operator:");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println("Ans: " + (a + b));
                break;
            case '-' : System.out.println(a - b);
                break;
            case '*' : System.out.println(a * b);
                break;
            case '/' : System.out.println(a / b);
                break;
            default : System.out.println("Calc not good");
        }
        }
    }
}
