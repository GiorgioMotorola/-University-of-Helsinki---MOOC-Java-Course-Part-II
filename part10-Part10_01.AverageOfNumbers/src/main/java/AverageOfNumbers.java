
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true) {
            String number = scanner.nextLine();
            if (number.equals("end")) {
                break;
            }
            
            input.add(number);
        } //while
        
        double average = input.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .average()
                .getAsDouble();
        
        System.out.println("average of the numbers: " + average);
        
        

    }
}
