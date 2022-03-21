
import java.util.Scanner;


public class UserInterface {
     private TodoList todolist;
    private Scanner scanner;

    public UserInterface(TodoList todolist, Scanner scanner) {
        this.todolist = todolist;
        this.scanner = scanner;

    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String word = scanner.nextLine();

            if (word.contains("stop")) {
                break;
            }

            if (word.contains("add")) {
                System.out.println("To add: ");
                String add = scanner.nextLine();
                todolist.add(add);
            } else if (word.contains("remove")) {
                System.out.println("Which one is removed? ");
                int removeNumber = Integer.parseInt(scanner.nextLine());

                todolist.remove(removeNumber);
            } else if (word.contains("list")) {
                todolist.print();
            }

        }//while

    }
    
}
