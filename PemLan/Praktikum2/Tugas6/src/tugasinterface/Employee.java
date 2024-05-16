package tugasinterface;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private double salaryPerMonth;
    private List<Invoice> invoices = new ArrayList<>();

    public Employee(int registrationNumber, String name, double salaryPerMonth) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
    }

    public void addInvoice(Invoice invoice) {
        invoices.add(invoice);
    }

    public double getTotalInvoiceAmount() {
        return invoices.stream().mapToDouble(Invoice::getPayableAmount).sum();
    }

    @Override
    public double getPayableAmount() {
        return salaryPerMonth - getTotalInvoiceAmount();
    }

    public void printEmployeeInfo() {
        System.out.println("==================[EMPLOYEE STATS]==================");
        System.out.printf("Nama : %s%n", name);
        System.out.printf("Registration Number : %d%n", registrationNumber);
        System.out.printf("Gaji Awal : Rp %,d.00%n", (int) salaryPerMonth);
        System.out.println("Detail Belanja : ");
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
        System.out.println("==================================================");
        System.out.printf("Total Belanja                        Rp %,d.00%n", (int) getTotalInvoiceAmount());
        System.out.printf("Gaji Akhir            : Rp %,d.00%n", (int) getPayableAmount());
    }
}