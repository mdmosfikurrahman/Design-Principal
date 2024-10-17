package single_responsibility_principle.good;

public class SRPGoodExample {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000.0);
        InvoicePrinter printer = new InvoicePrinter();
        InvoiceRepository repository = new InvoiceRepository();

        printer.printInvoice(invoice);
        repository.saveToDatabase(invoice);
    }
}
