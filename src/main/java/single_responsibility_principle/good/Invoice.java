package single_responsibility_principle.good;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double calculateTotal() {
        return amount * 1.05;  // Adding tax
    }
}

