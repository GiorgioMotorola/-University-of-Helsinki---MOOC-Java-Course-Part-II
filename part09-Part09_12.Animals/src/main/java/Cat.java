
public class Cat extends Animal implements NoiseCapable {

    private String name;

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    public void purr() {

        System.out.println(super.getName() + " purrs");

    }
   

    
    public void makeNoise() {
        purr();

    }
}
