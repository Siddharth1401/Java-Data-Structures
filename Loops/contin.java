import java.util.Scanner;

public class contin {
     public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        while (true){
            System.out.print("Enter your number: ");
            int i = sc.nextInt();

            if(i % 10 == 0){
                continue;
            }
            System.out.println("number is: " + i);
        } 
     }
}
