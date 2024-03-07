package PemLan;

public class PlayingClass {
    public static void main(String[] args) {
       int x;
       x = 13;
 
       PantheraTigris tiger1, tiger2, tiger3;
       tiger1 = new PantheraTigris();
       tiger1.id = "t1";
       tiger1.colour = "Coklat";
       tiger1.yearOfBirth = 2019;
 
       tiger2 = new PantheraTigris();
       tiger2.id = "t2";
       tiger2.colour = "Putih";
       tiger2.yearOfBirth = 2021;
 
       tiger3 = new PantheraTigris();
       tiger3.id = "t3";
       tiger3.colour = "Putih";
       tiger3.yearOfBirth = 2021;
 
       System.out.println("Spesifikasi harimau 1\n"
               + "ID: " + tiger1.id + "\nWarna: " + tiger1.colour
               + "\nTahun lahir: " + tiger1.yearOfBirth
               + "\nSuara makan: " + tiger1.eat()
 //              + tiger1.roar()
               + "\nSuara mengaum: ");
       tiger1.roar();
       tiger1.eat();
       
       System.out.println("\nSpesifikasi harimau 2\n"
               + "ID: " + tiger2.id + "\nWarna: " + tiger2.colour
               + "\nTahun lahir: " + tiger2.yearOfBirth
               + "\nSuara makan: " + tiger2.eat()
               + "\nMengaum: ");
       tiger2.roar();
    }
 
 }
