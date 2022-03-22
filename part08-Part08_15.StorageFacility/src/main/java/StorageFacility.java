
import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.facility.putIfAbsent(unit, new ArrayList<>());
        this.facility.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        ArrayList<String> emptyList = new ArrayList<>();
        return this.facility.getOrDefault(storageUnit, emptyList);
    }

    public void remove(String storageUnit, String item) {
        this.facility.get(storageUnit).remove(item);

        if (this.facility.get(storageUnit).isEmpty()) {
            this.facility.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unit = new ArrayList<>();
        
        for (String e : facility.keySet()) {
            if(!facility.get(e).isEmpty()){
                
                unit.add(e);
            }
        }
        return unit;
     }
}
