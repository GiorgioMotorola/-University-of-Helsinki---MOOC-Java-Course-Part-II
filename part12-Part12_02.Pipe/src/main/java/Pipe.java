
import java.util.ArrayList;
import java.util.List;


public abstract class Pipe<T> implements List<T> {
    
    ArrayList<T> pipeList;
    
    public Pipe() {
        this.pipeList = new ArrayList<>();
    }
    
    public void putIntoPipe(T value) {
        if(!pipeList.isEmpty()) {
            pipeList.clear();
        }
        this.pipeList.add(value);
    }
    
    public T takeFromPipe() {
        T value = this.pipeList.get(0);
        this.pipeList.clear();
        return value;
    }
    
    public boolean isInPipe() {
        if (pipeList.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    
    
    
}
