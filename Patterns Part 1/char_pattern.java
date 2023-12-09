// Print character patter :
//                         A
//                         BC
//                         DEF
//                         GHIJ

public class char_pattern {
    public static void main(String args[]) {
        char ch = 'A';

        //i = row no. - outer loop
        for ( int i = 1; i<=4; i++) {

            // column no. - inner loop
            for (int j = 1; j <= i; j++){
                    System.out.print(ch);
                    ch++;
                } 
                System.out.println();
            }
    }
}