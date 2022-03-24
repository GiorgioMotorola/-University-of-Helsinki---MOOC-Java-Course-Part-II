
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         ArrayList<Integer> inputNum = new ArrayList<>();
         
         while(true) {
            int input = scanner.nextInt();
            
            if (input < 0) {
                inputNum.stream()
                        .filter(num -> num <= 5)
                        .forEach(num -> System.out.println(num + ""));
                break;
            }
            inputNum.add(input);
            
            
        } //while
    }
}
