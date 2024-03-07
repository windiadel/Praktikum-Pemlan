import java.util.Scanner;

public class java {
    

public static void main(String[] args) {}
   Scanner scn = new Scanner (System.in);{

   int x; // declaration
   System.out.println("masukkan nilai x:");
   x = scn.nextInt (); // assigment
   
   int y = x / 2; // declaration + initialisation

   if (x== (y * 2)+1) {
    System.out.println("Ganjil");
   }
    else { // jika salah/lainnya
        System.out.println("Genap");
    }
}

}