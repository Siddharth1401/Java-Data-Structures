/*JDK(Java Development kit) -> source ->(JRE-Java Runtime Environment) byte code ->(JVM-Java Virtual Machine) native code(in binary)  
 source code -> complier turns into byte code ->  JVM converts it into native code in different OS - portable language 
*/
import java.util.*;
import java.util.Scanner;

public class firstClass{ 
    public static void main(String args[]) { /*boilerplate code - template for all java */
        // byte b = 127; //-128 to 127: 256 bits numbers
        // System.out.println(b);
        // char ch = 'a'; //characters - 2 bytes
        // System.out.println(ch);     
        // boolean var = true; //1 byte
        // double price = 10.5; //bigger than float - double 4/8 bytes
        // int number = 100; //bigger number - long 4/8 bytes
        // short num = 240; //2 byte

        Scanner sc =  new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);

        // Scanner rad = new Scanner(System.in);
        // float r = rad.nextFloat();
        // float Area = 3.14f * r * r; //need to convert double to float, by assumption decimal value is double
        // System.out.println("Area: "+ Area);

        //type conversion - widening conversion - implicit conversion
        // type compatible
        // destination > source type

        //typecasting
        float z = 25.50f;
        int y = (int)z;
        System.out.println(y);

        //type promotion - with expressions eg: a-b
    }
} 

