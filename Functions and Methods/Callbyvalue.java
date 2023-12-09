//Call by value: Value gets changed only in the function where value is passed, not outside.
//Java always works by call by value. If a value is passed in another function, then it is call by value or a copy. 
//The orignal memory is call by reference.

import java.util.*;

public class Callbyvalue { // main function input: void is an empty return type - output
    public static void printHelloWorld() {
        System.out.println("hello world");
    }

    public static int calculateSum(int num1, int num2) { // formal parameters
       
        int sum = num1 + num2;
        return sum;    
    }

    public static void swap(int a, int b) {
        //swap
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String args[]) {
        //swap - exchange values
        int a = 5;
        int b = 10;
        swap(a, b);

        
    }
}