
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> inputWords = new ArrayList<>();

        while(true) {
            String input = scanner.nextLine();
            
            if (input.isEmpty()) {
                inputWords.stream()
                .forEach(num -> System.out.println(num));
                break;
            }
            inputWords.add(input);
            
            
        } //while
    }
}
