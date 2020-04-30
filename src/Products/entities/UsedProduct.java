package Products.entities;

public class UsedProduct extends Product {
    String manufactureDate;

    public UsedProduct(String name, double price, String manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return name + " (used): $ " + price + " (Manufacture date: " + manufactureDate + ")";
    }
}
