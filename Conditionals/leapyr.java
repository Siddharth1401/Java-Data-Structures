import java.util.Scanner;

public class leapyr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        String type = (year % 4 == 0 && year % 100 != 0 || (year % 400 == 0) )? "Leap": "Cheap";
        System.out.println(type);
    }
} 