// when a function keeps calling itself for making smaller problems

// or Recursion is the method of solving complex computational problem where the solution depends on solutions to smaller instances of the same problem.
// eg. factorial
// base case: at which recursion ends where we know ans
// working: n x f(n-1)
// call it: f(n-1)

// print n to 1
public class rec_basic{
    public static void printDec(int n){ //printing multiple ans
        // base case
        if(n == 10){
            System.out.println(n);
            return;
        }
        System.out.print(n + " "); // print as it is
        printDec(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        printDec(n);
    }
}
// Call stack: decreasing order
// Stack overflow: have a base case to avoid it or program crashes

