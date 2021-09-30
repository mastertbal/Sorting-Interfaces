import java.util.Comparator;

public class NameComparator implements Comparator<SmartPhone> {
    @Override
    public int compare(SmartPhone sp1, SmartPhone sp2) {
        return sp1.getName().compareTo(sp2.getName());
    }
}
