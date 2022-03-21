
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String end = scanner.nextLine();
            if (end.equals("end")) {
                break;
            }
            int number = Integer.valueOf(end);
            System.out.println(number * number * number);

        } //while
    }
}
