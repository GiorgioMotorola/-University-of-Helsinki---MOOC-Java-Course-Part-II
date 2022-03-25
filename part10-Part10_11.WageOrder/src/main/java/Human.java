
public class Human implements Comparable<Human> {

    private int wage;
    private String name;

    public Human(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }

    
    public int compareTo(Human humans) {
        if (this.wage == humans.getWage()) {
            return 0;
        } 
         return humans.getWage() - this.getWage();
    }

    @Override
    public String toString() {
        return name + " " + wage;
    }
}
