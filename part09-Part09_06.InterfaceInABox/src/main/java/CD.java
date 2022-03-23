
public class CD implements Packable {
    
    private String artist;
    private String nameOfCD;
    private int year;
    
    public CD(String artist, String nameOfCD, int year) {
        this.artist = artist;
        this.nameOfCD = nameOfCD;
        this.year = year;
        this.weight = 0.1;
    }
    
    public double weight;
    
     @Override
    public double weight() {
        
        return this.weight;
        
       
    
        
    }
    @Override
    public String toString() {
        return  this.artist + ": " + this.nameOfCD + " (" + this.year + ")";
    }
}
