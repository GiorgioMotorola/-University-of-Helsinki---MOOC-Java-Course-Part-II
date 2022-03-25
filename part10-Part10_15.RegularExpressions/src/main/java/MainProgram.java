
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Checker checks = new Checker();

        System.out.println("Enter a string: ");
        String input = scan.nextLine();
        if (checks.allVowels(input)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
