//Constructor: To initialize an object
//special function which is automatically invoked at the time of object creation 
//same name as class, ex: Pen()
//no return type
//Called only once during object creation
//memory allocation only happens when it is called

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(); //intial value assigning of s1 by constructor
        // System.out.println(s1.name);
        // Student s2 = new Student("Sid");
        // Student s3 = new Student(123);
        s1.name = "sid";
        s1.roll = 031;
        s1.password = "abcd";

        Student s2 = new Student(s1); // propeties get copied
        s2.password = "xyz"; //new password set

        
    }
}

// class student
class Student {
    //properties
    String name;
    int roll;
    String password;
    int marks[];

    // Copy constructor: To copy properties from s1 to s2
    Student(Student s1) {// object in a constructor as parameter
    marks = new int[3];
    this.name = s1.name; 
    this.roll = s1.roll;
    }

    //constructor - to initialize student
    // function
    Student(){
        marks = new int[3];
        // this.name = name;
        System.out.println("constrc is called"); // Non parameteriezed
        this.marks = s1.marks;
    }
    
    Student(String name){
        marks = new int[3];
        this.name = name; // Parameterized
    }

    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}

// 3 types of constructor
// Non parameteriezed
// Parameterized
// Copy Constructor - copy obj1 properties to obj2

//Constructor overloading - one can be called out of many constrs 