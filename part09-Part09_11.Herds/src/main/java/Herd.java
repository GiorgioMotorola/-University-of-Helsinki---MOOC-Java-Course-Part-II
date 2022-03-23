
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herdList;

    public Herd() {
        this.herdList = new ArrayList<>();
    }

    public void move(int dx, int dy) {
        for (Movable moveObj : herdList) {

            moveObj.move(dx, dy);
        }
    }

    public void addToHerd(Movable movable) {
        herdList.add(movable);
    }

    public String toString() {
        String newString = "";

        for (Movable mov : herdList) {

            newString += mov.toString().trim() + "\n";
        }

        return newString;
    }
}
