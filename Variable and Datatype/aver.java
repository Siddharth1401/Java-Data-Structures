// taking inputs a variables
import java.util.Scanner;

public class aver {
    public static void main(String arg[]) {

    Scanner sc = new Scanner(System.in);

    float pen = sc.nextFloat();
    float pencil = sc.nextFloat();
    float eraser = sc.nextFloat();

    float sum = (pen + pencil + eraser);
    System.out.println("Average is:" + sum/3);
    }
}
