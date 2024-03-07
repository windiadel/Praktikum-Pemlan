import java.util.Scanner;

public class kalkulatorsederhana {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double bilangan1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Masukkan bilangan kedua: ");
        double bilangan2 = input.nextDouble();

        double hasil = 0;

        if (operator == '+') {
            hasil = bilangan1 + bilangan2;
        } else if (operator == '-') {
            hasil = bilangan1 - bilangan2;
        } else if (operator == '*') {
            hasil = bilangan1 * bilangan2;
        } else if (operator == '/') {
            if (bilangan2 != 0) {
                hasil = bilangan1 / bilangan2;
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                System.exit(1);
            }
        } else {
            System.out.println("Operator tidak valid.");
            System.exit(1);
        }

        System.out.println("Hasil: " + hasil);
    }
}