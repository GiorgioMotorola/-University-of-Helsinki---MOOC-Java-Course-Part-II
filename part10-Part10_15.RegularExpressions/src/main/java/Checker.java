
public class Checker {

    public boolean isDayOfWeek(String string) {
        if (string.toLowerCase().matches("mon|tue|wed|thu|fri|sat|sun")) {
            return true;
        }
        return false;
    }

    public boolean allVowels(String string) {
        if (string.toLowerCase().matches("^[aeiou]*")) {
            return true;
        }
        return false;

    }

    public boolean timeOfDay(String string) {
        if (string.matches("(?:[01]\\d|2[0123]):(?:[012345]\\d):(?:[012345]\\d)")) {
            return true;
        }
        return false;

    }
}

