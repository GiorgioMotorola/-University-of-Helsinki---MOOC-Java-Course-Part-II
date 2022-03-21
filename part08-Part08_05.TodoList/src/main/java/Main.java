
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
        TodoList dictionary = new TodoList();

        UserInterface textUI = new UserInterface(dictionary, scanner);
        textUI.start();

    }
}
