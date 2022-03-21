
import java.util.ArrayList;


public class TodoList {

    private ArrayList<String> ToDoList = new ArrayList<>();

    public TodoList() {
        this.ToDoList = new ArrayList<>();
    }

    public void add(String task) {
        this.ToDoList.add(task);
    }

    public void print() {
        int index = 1;
        for (String e : ToDoList) {
            System.out.println(index + ": " + e);
            index++;
        }
    }

    public void remove(int number) {
        this.ToDoList.remove(number - 1);
    }
}
