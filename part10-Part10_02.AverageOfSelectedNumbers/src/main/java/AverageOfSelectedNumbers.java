
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String number = scanner.nextLine();
            if (number.equals("end")) {
                System.out.println("Print the average of the negative number or the positive number? (n/p)");
                String uInput = scanner.nextLine();

                if (uInput.isEmpty()) {
                    continue;
                }

                if (uInput.toLowerCase().equals("n")) {
                    double averageOfNeg = input.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(i -> i < 0)
                            .average()
                            .getAsDouble();


                    System.out.println("Average of the positive numbers: " + averageOfNeg);
                } else if (uInput.toLowerCase().equals("p")) {
                    double averageOfPos = input.stream()
                            .mapToInt(s -> Integer.valueOf(s))
                            .filter(i -> i >= 0)
                            .average()
                            .getAsDouble();

                    System.out.println("Average of the negative numbers: " + averageOfPos);

                }
                break;
            }

            input.add(number);
        } //while

    }
}
