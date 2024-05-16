package tugasinterface;
import java.util.Scanner;

public class Main {
    private static Employee loggedInEmployee = null;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("=============[Koperasi Karyawan]============");
            System.out.println("Pilihan Program : ");
            System.out.println("1. Login");
            System.out.println("2. Belanja");
            System.out.println("3. Lihat Detail Belanja");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan Anda : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    if (loggedInEmployee != null) {
                        shop();
                    } else {
                        System.out.println("Silakan login terlebih dahulu.");
                    }
                    break;
                case 3:
                    if (loggedInEmployee != null) {
                        loggedInEmployee.printEmployeeInfo();
                    } else {
                        System.out.println("Silakan login terlebih dahulu.");
                    }
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void login() {
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();
        System.out.print("Masukkan nomor registrasi pegawai: ");
        int registrationNumber = scanner.nextInt();
        System.out.print("Masukkan jumlah gaji per bulan: ");
        double salaryPerMonth = scanner.nextDouble();
        scanner.nextLine();
        loggedInEmployee = new Employee(registrationNumber, name, salaryPerMonth);
        System.out.println("USERINFO: Successfully logged in!");
    }

    private static void shop() {
        String[] products = {
            "Sepatu", "Royal Canin", "Buku Tulis", "Kaos Kaki", "Bantal",
            "Botol Minum", "Selimut", "Tas"
        };
        int[] prices = {300000, 25000, 4000, 30000, 81000, 79000, 60000, 170000};

        while (true) {
            System.out.println("Daftar Produk :");
            for (int i = 0; i < products.length; i++) {
                System.out.printf("%d. %s -- Rp %,d.00%n", i + 1, products[i], prices[i]);
            }
            System.out.println("9. Selesai Belanja");
            System.out.print("Masukkan pilihan produk: ");
            int choice = scanner.nextInt();
            if (choice == 9) {
                break;
            }
            if (choice < 1 || choice > 8) {
                System.out.println("Pilihan tidak valid.");
                continue;
            }
            System.out.print("Masukkan jumlah: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            loggedInEmployee.addInvoice(new Invoice(products[choice - 1], quantity, prices[choice - 1]));
        }
    }
}