public class hollow_rect {
    public static void hollowRect(int totRows, int totCols) {
        // outer loop - rows - 1-4
        for (int i = 1; i <= totRows; i++ ) {
            // inner loop - column - cond: row = 1 ,4; col = 1,5
            for (int j = 1; j <= totCols; j++) {
                // cell - (i,j)
                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void rotatHalfPyramid(int totalLength) {
        //outer loop - rows; row no. = stars; spaces = totalLength - i;
        for (int i = 1; i <= totalLength; i++) {
            //spaces
            for (int j = 1; j <=totalLength - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j= 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int num) {
        // outer loop - rows
        for (int i = 1; i <= num; i++) {
            //print number
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    public static void floydTriangle(int n) {
        int counter = 1;
        //row loop
        for (int i = 1; i <= n; i++) {
            //num of numbers
            for (int j = 1; j <= i; j++) {
                    System.out.print(counter + " ");
                    counter++;
                }
                System.out.println();
        }
    }
// Anytime there is not a consistent patter: write it in matrix form in a notebook and then see the relation
    public static void Triangle_0_1(int n) {
        //outer row loop
        for (int i = 1; i <= n; i++) {
            //num of numbers
            for (int j = 1; j <= i; j++) {
                //pattern: sum of i and j is even here
                if ((i+j) % 2 == 0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
        
    }
    
    public static void butterfly(int n) {
        //outer half row
        for (int i = 1; i <= n; i++) {
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces: 2*(n-i) 
            //to increase: i++; to decrease: n-i; so no need for another variable
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");

            }

            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        //2nd half row: invert from n to 1
        for (int i = n; i >= 0; i--) {
            //code is same
            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces: 2*(n-i) 
            //to increase: i++; to decrease: n-i; so no need for another variable
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");

            }

            //star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void solidRhombus(int n) {
        //outer loop
        for (int i = 1; i <=n; i++) {
            // space
             for (int j =1; j <= n-i; j++) {
                System.out.print(" ");
             }

             //star
             for (int k = 1; k <= n; k++){
                System.out.print("*");
            }
             System.out.println();
        }
    }

    public static void hollowRhombus(int n) {
        //outer loop
        for (int i =1; i <= n; i++) {
            //no. of spaces loop = n-i
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //star
            //column loop
            for (int j = 1; j<= n; j++) {
                // hollow: first and last row + slanting sides
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void diamond(int n) {
        //upper half
        //outer loop: rows - 1 to n 
        for (int i = 1; i <= n; i++){

            //space: n-i; 4-1 = 3
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars: odd - 1, 3, 5 = 2*i - 1; 2*i + 1
            for (int j = 1; j <= 2*i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        //outer loop: rows - n to 1
        for (int i = n; i >= 1; i--) {
            //space: n-i; 4-1 = 3
            for (int j = 1; j<=n-i; j++){
                System.out.print(" ");
            }

            //stars: odd - 1, 3, 5 = 2*i +1
            for (int j = 1; j <= 2*i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberPattern(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            //space: n-i
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //star: i time print i
            for (int j =1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromePattern(int n) {
        //outer loop
        for (int i =1; i <= n; i++) {
            //space: n-1
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            //print from 5 - 1: i to 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // to print from 2 - 5
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {
        // hollowRect(10, 6);  
        // rotatHalfPyramid(100);   
        // invertedHalfPyramid(5);
        // floydTriangle(15);   
        // Triangle_0_1(5);

        // for (int i =1; i<= 25; i++) {
        //     butterfly(i);
        // }
        // solidRhombus(15);
        // hollowRhombus(5);
        // diamond(10);
        // numberPattern(5);
        // palindromePattern(10);
    }
}   