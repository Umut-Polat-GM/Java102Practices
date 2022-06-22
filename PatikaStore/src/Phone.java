public class Phone extends Product {

    private int batteryPower;
    private String color;

    public Phone(int batteryPower, double price, double discountRate, int quantity, String title, Brand brand, int memory, double screenSize, int ram, String color) {
        super(price, discountRate, quantity, title, brand, memory, screenSize, ram);
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}