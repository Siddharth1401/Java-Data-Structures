// class starts with uppercase
// variable starts with small

// 2 types of memories in Java: Stack and Heap*
public class OOP{
    //Objects are entities of real world
    //Classes are groups of these entities : attributes(properties) + functions(behavior)
    public static void main(String[] args) {
        // first main is executed
        // It is public and static
        Pen p1 = new Pen(); //created a pen object called p1
        p1.setColor("Blue"); // .is used to call function or properties of an object
        System.out.println(p1.color); 
        
        BankAccount myAcc = new BankAccount();
        myAcc.username = "rambosid";
        myAcc.setPassword("abcde");
    }
}

// IMP: Access Specifier: Private(In class), Default(In Package also), Protected(Outside package by subclass also), Public(outside package also)
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class Pen{
    String color;
    int tip;

    //getters
    String getColor(){
        return this.color; // this. is properties of that object
    }

    int getTip(){
        return this.tip;
    }

    //setters
    void setColor(String newColor ){//external variable
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercent(int phy, int chem, int math){
        percentage = (phy + chem + math)/3;

    }
}

// 2 types of function with object: getters and setters

// IMP OOPS 4 pillars:
// Encapsulation - defined as the wrapping up(class) of data(attributes) and methods(functions) under a single unit. It also implements data hiding(sensitive data or use of access specifiers).
// Inheritance - 
// Abstraction
// Polymorphism

