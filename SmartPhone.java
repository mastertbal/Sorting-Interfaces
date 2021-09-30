public class SmartPhone implements Comparable<SmartPhone> {
    private String name;
    private String yearOfManufacture;
    private int batteryCapacity;  // in mAh

    // Constructor
    public SmartPhone(String name, String yearOfManufacture, int batteryCapacity) {
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
        this.batteryCapacity = batteryCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(String yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "name='" + name + '\'' +
                ", yearOfManufacture='" + yearOfManufacture + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }

    @Override
    public int compareTo(SmartPhone o) {
        return this.getName().compareTo(o.getName());
    }
}
