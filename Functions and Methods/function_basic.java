// functions are reusable part of a code
// you can call or press the button
// main gets executed first
// memory for function gets stored in the form of stack

import java.util.*;

public class function_basic { 

    public static int calculateSum(int num1, int num2) { // formal parameters/input
       
        int sum = num1 + num2;
        return sum; //output
    }

    public static void main(String args[]) { // main function input: void is an empty return type - output
        //body
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(calculateSum(num1, num2)); // actual parameters
    }
}