
import java.util.ArrayList;

public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> itemsInBox;

    public Box(double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.itemsInBox = new ArrayList<>();
    }

    public void add(Packable itemToPack) {
        if (this.weight() + itemToPack.weight() <= maxCapacity) {

            itemsInBox.add(itemToPack);

        }

    }

    @Override
    public double weight() {
        double sum = 0;

        for (Packable e : itemsInBox) {
            sum += e.weight();

        }

        return (double) sum;
    }

    @Override
    public String toString() {
        return "Box: " + itemsInBox.size() + " items, total weight " + this.weight() + " kg";
    }

}
