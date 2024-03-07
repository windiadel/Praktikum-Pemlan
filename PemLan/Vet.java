package PemLan;

import java.util.Scanner;

public class Vet {
    public static void main(String[] args){
        Scanner input;
        PantheraTigris tiger;
        input = new Scanner(System.in);
        tiger = new PantheraTigris();
        System.out.println("=======================\n"
                + "Vet v1.0\n" + "by Windi\n"
                + "==================");
        System.out.println("\nApakah ID harimau Anda?");
        tiger1.id = input.nextLine();
        System.out.println("\nSiapakah nama harimau Anda?");
        tiger1.name = input.nextLine();
        System.out.println("Selamat datang " + tiger.name + "di Vet v1.0");
        //input.close();
    }
}
