package tax.entities;

public class NaturalPerson extends TaxPayer {
    private double healthcareExpenses;

    public NaturalPerson(String name, double annualIncome, double healthcareExpenses) {
        super(name, annualIncome);
        this.healthcareExpenses = healthcareExpenses;
    }

    public double getHealthcareExpenses() {
        return healthcareExpenses;
    }

    public void setHealthcareExpenses(double healthcareExpenses) {
        this.healthcareExpenses = healthcareExpenses;
    }


    @Override
    public double taxAmount() {
        double taxPercent;
        if (this.annualIncome < 20000) {
            taxPercent = 0.15;
        } else {
            taxPercent = 0.25;
        }
        double taxTotal = this.annualIncome * taxPercent;
        double taxRebate = this.healthcareExpenses * 0.5;
        return taxTotal - taxRebate;
    }
}
