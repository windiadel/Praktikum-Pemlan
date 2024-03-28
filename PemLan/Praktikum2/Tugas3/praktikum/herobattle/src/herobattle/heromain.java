package herobattle;

import java.util.Scanner;

public class heromain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Permainan adu hero");
        System.out.println("Player 1: Silakan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("====================================");
        System.out.print("Nama hero     : ");
        String name1 = scanner.nextLine();
        System.out.print("Health point  : ");
        double health1 = scanner.nextDouble();
        System.out.print("Attack        : ");
        double attack1 = scanner.nextDouble();
        System.out.print("Defense       : ");
        double defense1 = scanner.nextDouble();

        System.out.println("");
        System.out.println("Permainan adu hero");
        System.out.println("Player 2: Silakan masukkan hero Anda!");
        System.out.println("Untuk bagian angka, mohon masukkan angka antara 0 hingga 500!");
        System.out.println("====================================");
        scanner.nextLine();
        System.out.print("Nama hero     : ");
        String name2 = scanner.nextLine();
        System.out.print("Health point  : ");
        double health2 = scanner.nextDouble();
        System.out.print("Attack        : ");
        double attack2 = scanner.nextDouble();
        System.out.print("Defense       : ");
        double defense2 = scanner.nextDouble();

        hero hero1 = new hero(name1, health1, attack1, defense1);
        hero hero2 = new hero(name2, health2, attack2, defense2);

        System.out.println("============================");
        System.out.println("Ronde 1");
        hero1.attack(hero2);

        System.out.println("============================");
        System.out.println("Ronde 2");
        hero2.attack(hero1);

        System.out.println("============================");
        System.out.println("Ronde 3");
        hero1.attack(hero2);

        System.out.println("============================");
        System.out.println("Pertarungan telah usai");
        if (hero1.getHealthPoint() <= 0) {
            System.out.println(hero1.getName() + " telah kalah");
        } else if (hero2.getHealthPoint() <= 0) {
            System.out.println(hero2.getName() + " telah kalah");
        } else {
            System.out.println("Keduanya masih memiliki health point");
        }

        scanner.close();
    }
}
