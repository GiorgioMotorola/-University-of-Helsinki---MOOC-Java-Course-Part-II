
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        if (history.isEmpty()) {
            return 0.0;
        }
        return Collections.max(history);
    }

    public double minValue() {
        if (history.isEmpty()) {
            return 0.0;
        }
        return 1.0 * Collections.min(history);
    }

    public double average() {

        int sum = 0;
        if (history.isEmpty()) {
            return 0.0;
        }
        for (double e : history) {
            sum += e;
        }
        return 1.0 * sum / history.size();
    }

    public String toString() {
        return history.toString();
    }
}
