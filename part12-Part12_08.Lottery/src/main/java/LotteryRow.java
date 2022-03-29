
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryRow() {

        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        
        this.numbers = new ArrayList<>();
         while (this.numbers.size() < 7) {
            int randomNum = (int) this.random.nextInt(40) + 1;
            if (!this.numbers.contains(randomNum)) {

                this.numbers.add(randomNum);

            }

        }
    }

    public boolean containsNumber(int number) {
        boolean isValid = false;
        for (int e : numbers) {
            if (e == number) {
                isValid = true;
            }
        }
        return isValid;
    }
}
