// array is a list of elements of the same type
// placed a contiguous memory location
// 0-based indexing
// pass by value: it does not affect main or calling function 
// by reference: changes are shown in function 

import java.util.*;

public class array_basic {
    public static void main(String[] args) {
        // new allocates memory
        int marks[] = new int[69]; //array static size

        Scanner sc = new Scanner(System.in);

        System.out.println("Length of array : " + marks.length);

        // marks[0] = sc.nextInt(); //phy
        // marks[1] = sc.nextInt(); //chem
        // marks[2] = sc.nextInt(); //math

        // System.out.println("phy : " + marks[0]);
        // System.out.println("chem : " + marks[1]);
        // System.out.println("math : " + marks[2]);
        
        // marks[2] = 100;

        // System.out.println("math updated : " + marks[2]);
    }
}
