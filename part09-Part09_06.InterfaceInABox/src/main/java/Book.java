
public class Book implements Packable {
    
    private String author;
    private String nameOFBook;
    private double weight;
    
    public Book(String author, String nameOfBook, double weight) {
        this.author = author;
        this.nameOFBook = nameOfBook;
        this.weight = weight;
        
    }
    @Override
    public double weight() {
        return this.weight;
    }
    @Override
    public String toString() {
        return  author + ": " + nameOFBook;
    }
}
