package single_responsibility_principle.good;

public class InvoiceRepository {
    public void saveToDatabase(Invoice invoice) {
        System.out.println("Invoice saved with total: " + invoice.calculateTotal());
    }
}
