package single_responsibility_principle.good;

public class InvoicePrinter {
    public void printInvoice(Invoice invoice) {
        System.out.println("Invoice total: " + invoice.calculateTotal());
    }
}
