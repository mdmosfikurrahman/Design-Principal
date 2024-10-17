package single_responsibility_principle.bad;

public class SRPBadExample {
    public static void main(String[] args) {
        Invoice invoice = new Invoice(1000.0);
        invoice.printInvoice();
        invoice.saveToDatabase();
    }
}
