public abstract class Product {

    protected long id;
    protected double price;
    protected double discountRate;
    protected int quantity;
    protected String title;
    protected Brand brand;
    protected int memory;
    protected double screenSize;
    protected int ram;

    public Product(double price, double discountRate, int quantity, String title, Brand brand, int memory, double screenSize, int ram) {
        this.id = (brand.getTitle() + title).hashCode(); // unique id   
        if (id < 0) {
            id *= -1;
        }
        this.price = price;
        this.discountRate = discountRate;
        this.quantity = quantity;
        this.title = title;
        this.brand = brand;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

}