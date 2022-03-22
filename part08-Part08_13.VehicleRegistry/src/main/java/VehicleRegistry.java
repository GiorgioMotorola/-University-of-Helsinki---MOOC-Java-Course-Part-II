
import java.util.ArrayList;
import java.util.HashMap;


public class VehicleRegistry {

    private HashMap<LicensePlate, String> liPlatehashMap;

    public VehicleRegistry() {

        this.liPlatehashMap = new HashMap<>();

    }

    public boolean add(LicensePlate liPlate, String owner) {

        for (LicensePlate e : liPlatehashMap.keySet()) {
            if (e.equals(liPlate)) {
                return false;

            }

        }
        liPlatehashMap.put(liPlate, owner);

        return true;

    }

    public String get(LicensePlate licensePlate) {

        return liPlatehashMap.getOrDefault(licensePlate, null);

    }

    public boolean remove(LicensePlate licensePlate) {

        if (!liPlatehashMap.containsKey(licensePlate)) {

            return false;
        }

        liPlatehashMap.remove(licensePlate);

        return true;

    }

    public void printLicensePlates() {

        for (LicensePlate e : liPlatehashMap.keySet()) {
            System.out.println(e);
        }
    }

    public void printOwners() {

        ArrayList<String> ownerList = new ArrayList<>();

        for (String e : liPlatehashMap.values()) {

            if (!ownerList.contains(e)) {

                ownerList.add(e);
            }

        }
        for (String e : ownerList) {
            System.out.println(e);
        }

    }

}
