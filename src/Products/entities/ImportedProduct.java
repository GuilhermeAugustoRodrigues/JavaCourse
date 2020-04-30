package Products.entities;

public class ImportedProduct extends Product{
    double customsFee;

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String toString() {
        return name + ": $ " + price + " (Custom fee: $" + customsFee + ")";
    }
}
