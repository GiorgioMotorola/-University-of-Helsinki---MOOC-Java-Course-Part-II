
import java.util.ArrayList;
import java.util.List;

public abstract class Hideout<T> implements List<T> {

    ArrayList<T> hideList;

    public Hideout() {
        this.hideList = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if(!hideList.isEmpty()) {
            hideList.clear();
        }
        this.hideList.add(toHide);
    }

    public T takeFromHideout() {
        T value = this.hideList.get(0);
        this.hideList.clear();
        return value;
    }

    public boolean isInHideout() {
        if (hideList.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}
