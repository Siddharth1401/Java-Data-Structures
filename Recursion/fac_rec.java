public class fac_rec {
    public static int recFac(int n){ // printing an integer as ans
        //base case and condition
        if(n == 0){
            return 1;
        }

     // assume its correct
        int fn = n * recFac(n-1); // use for general formula, goes back to 0 factorial
        return fn; //no n++ because formula has it
        
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(recFac(n));
    }
}

