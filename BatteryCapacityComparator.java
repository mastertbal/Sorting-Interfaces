import java.util.Comparator;

public class BatteryCapacityComparator implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone sp1, SmartPhone sp2) {
        return sp1.getBatteryCapacity() - sp2.getBatteryCapacity();
    }
}
