import java.util.ArrayList;
import java.util.Collections;

public class SmartphoneMain {
    public static void main(String[] args) {
        ArrayList<SmartPhone> spList =
                new ArrayList<>();
        spList.add(
                new SmartPhone("Motorola", "2008", 2340));
        spList.add(
                new SmartPhone("Redmi", "2017", 4000));
        spList.add(
                new SmartPhone("Infinix", "2010", 3000));
        spList.add(
                new SmartPhone("Samsung", "2016", 3500));
        spList.add(
                new SmartPhone("Oppo", "2018", 4000));
        spList.add(
                new SmartPhone("Huawei", "2019", 5000));

        // UNSORTED
        System.out.println("UNSORTED SMART PHONES");
        System.out.println("=====================");
        for (SmartPhone sp: spList) {
            System.out.println(sp);
        }
//        System.out.println();
//        System.out.println("SORTED SMART PHONES");
//        System.out.println("============================");
//        // SORTED WITH COMPARABLE
//        Collections.sort(spList);
//        for (SmartPhone sp: spList) {
//            System.out.println(sp);
//        }

        System.out.println("SORTED SMART PHONE OBJECTS USING THE NAME ATTRIBUTE");
        System.out.println("===================================================");
        // SORTED WITH NameComparator
        Collections.sort(spList, new NameComparator());
        for (SmartPhone sp: spList) {
            System.out.println(sp);
        }

        System.out.println("SORTED SMART PHONE OBJECTS USING THE YEAR OF MANUFACTURE ATTRIBUTE");
        System.out.println("==================================================================");
        // SORTED WITH YearOfManufacturerComparator
        Collections.sort(spList, new YearOfManufactureComparator());
        for (SmartPhone sp: spList) {
            System.out.println(sp);
        }

        System.out.println("SORTED SMART PHONE OBJECTS USING THE BATTERY CAPACITY ATTRIBUTE");
        System.out.println("===============================================================");
        // SORTED WITH BatteryCapacityComparator
        Collections.sort(spList, new BatteryCapacityComparator());
        for (SmartPhone sp: spList) {
            System.out.println(sp);
        }

    }
}