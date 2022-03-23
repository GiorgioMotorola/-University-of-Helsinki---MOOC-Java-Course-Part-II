
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private int maxweight;
    private ArrayList<Item> items;
    

    public BoxWithMaxWeight(int capacity) {
        this.maxweight = capacity;
        items = new ArrayList<>();
    }

     @Override
    public void add(Item item) {
        if (this.weightOfItems() + item.getWeight() > this.maxweight) {
            return;
        }
 
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
     private int weightOfItems() {
        int weight = 0;
        for (Item item : this.items) {
            weight = weight + item.getWeight();
        }
 
        return weight;
    }
}
