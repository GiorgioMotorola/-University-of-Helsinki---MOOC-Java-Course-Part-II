

public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public int compareTo(Student students) {
        return this.name.compareToIgnoreCase(students.getName());
    }

    @Override
    public String toString() {
        return name;
    }

}
