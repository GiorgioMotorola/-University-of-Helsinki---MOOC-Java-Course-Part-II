package validating;

public class Calculator {

    public int factorial(int num) {

        int answer = 1;
        for (int i = 1; i <= num; i++) {
            answer *= i;
        }
        if (num < 0) {
            throw new IllegalArgumentException("error");
        }
        return answer;
    }

    public int binomialCoefficent(int setSize, int subsetSize) {

        if ((setSize >= 0 && subsetSize >= 0) && subsetSize <= setSize) {

            int numerator = factorial(setSize);
            int denominator = factorial(subsetSize) * factorial(setSize - subsetSize);

            return numerator / denominator;
        } else {
            throw new IllegalArgumentException("error factortial");
        }
    }
}
