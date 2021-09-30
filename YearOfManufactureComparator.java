import java.util.Comparator;

public class YearOfManufactureComparator implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone sp1, SmartPhone sp2) {
        return sp1.getYearOfManufacture().compareTo(sp2.getYearOfManufacture());
    }
}
