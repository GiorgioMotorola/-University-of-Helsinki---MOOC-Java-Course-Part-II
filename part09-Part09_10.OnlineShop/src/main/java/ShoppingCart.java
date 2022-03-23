
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> itemMap;

    public ShoppingCart() {
        this.itemMap = new HashMap<>();
    }

    public void add(String product, int price) {

        if (itemMap.keySet().contains(product)) {

            increaseQuantity(product);

        } else {

            itemMap.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int total = 0;

        for (Item e : itemMap.values()) {
            total += e.price();
        }
        return total;
    }

    public void increaseQuantity(String product) {
        this.itemMap.get(product).increaseQuantity();
    }

    public void print() {
        for (String e : itemMap.keySet()) {

            System.out.println(itemMap.get(e).toString());

        }
    }
}
