
import java.util.HashMap;

public class Abbreviations {

    private HashMap<String, String> abbrev;

    public Abbreviations() {

        this.abbrev = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {

        abbrev.put(cleanString(abbreviation), explanation);

    }

    public boolean hasAbbreviation(String abbreviation) {

        return this.abbrev.containsKey(abbreviation);

    }

    public String findExplanationFor(String abbreviation) {

        return this.abbrev.get(cleanString(abbreviation));

    }

    public void printKeys() {

        for (String e : this.abbrev.keySet()) {
            System.out.println(e);
        }

    }

    public String cleanString(String strToClean) {

        if (strToClean == null) {
            return "";
        }

        return strToClean.toLowerCase().trim();

    }

}
