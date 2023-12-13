//print all possible strings of size n without consequtive 1s - paytm
public class N_binaryString {
    public static void printBinStrings(int n, int lastPlace, String str){
        

        //kaam
        // if(lastPlace == 0){
        //     //place 0 on chair n
        //     printBinStrings(n-1, 0, str.append("0"));
        //     printBinStrings(n-1, 1, str.append("1"));
        // } else{
        //     printBinStrings(n-1, 0, str.append("0"));
        // }

        //base case
        if(n == 0){
            System.out.println(str); //print ans when reaches end
            return;
        }

        //kaam
        printBinStrings(n-1, 0, str+"0"); //calc string
        if(lastPlace == 0){ //only 1 for 0 as seat
            printBinStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinStrings(3, 0, "");
    }
}
