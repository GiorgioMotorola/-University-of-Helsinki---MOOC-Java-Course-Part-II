
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> employeeList;

    public Employees() {
        this.employeeList = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        employeeList.add(personToAdd);

    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> iterator = peopleToAdd.iterator();

        iterator.forEachRemaining(person -> employeeList.add(person));
    }
    
    public void fire(Education education) {
        Iterator<Person> iterator = employeeList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().getEducation() == education) {
                iterator.remove();
            }
        }
    }

    public void print() {
        Iterator<Person> iterator = employeeList.iterator();

        iterator.forEachRemaining(employee -> System.out.println(employee));
    }

    public void print(Education education) {
        Iterator<Person> iterator = employeeList.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();

            if (nextPerson.getEducation() == education) {
                System.out.println(nextPerson);

            }
        }
    }
}
