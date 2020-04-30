package tax.entities;

public class LegalEntity extends TaxPayer{
    int numberEmployees;

    public LegalEntity(String name, double annualIncome, int numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    @Override
    public double taxAmount() {
        double taxPercent;
        if (this.numberEmployees < 10) {
            taxPercent = 0.16;
        } else {
            taxPercent = 0.14;
        }
        double taxToPay = this.annualIncome * taxPercent;
        return taxToPay;
    }
}
