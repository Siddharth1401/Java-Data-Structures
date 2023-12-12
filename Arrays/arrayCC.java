
public class arrayCC {
    // updating arrays
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[1] + 1;
        }

    }

    public static void main(String[] args) {
        int marks[] = {97, 98, 99};
        update(marks);

        //print marks
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[] + " ");
        }
        System.err.println();
    }
}
