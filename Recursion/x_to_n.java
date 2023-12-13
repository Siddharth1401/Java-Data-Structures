public class x_to_n { //TC: O(n)
    public static int basePower(int x, int n){
        //base case 2^0
        if (n == 0){
            return 1;
        }
        //--- repeats until answer
        return x * basePower(x, n-1);
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        //call
        System.out.println(basePower(x, n));
    }
}
