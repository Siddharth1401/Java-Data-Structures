//find all possible pairs: n(n-1)/2: 1+2+3+4.. - AP fomula


public class Pairs_Array {

    public static void findPairs(int numbers[]) {
        int tpp = 0;
        for (int i = 0; i < numbers.length; i++) { // iterating first pair no.
            for (int j = i+1; j < numbers.length; j++) { //iterating second pair no. with nested loop
                System.out.println("(" + numbers[i] + ", " + numbers[j] + ")");
                tpp++;
            }
        }
        System.out.println("total pairs: " + tpp);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 4, 5};
        findPairs(numbers);

    }
}
