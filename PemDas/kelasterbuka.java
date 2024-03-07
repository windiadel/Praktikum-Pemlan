public class kelasterbuka {
   public static void main(String[] args){

    int a = 20; //assigment
    System.out.println("nilai a = " + a);

    a = 100;
    System.out.println("nilai a yang baru adalah = " + a);

    int b; //deklarasi, tidak memuat nilai, hanya menyatakan bahwa b adalah tipe data int
    b = 3; // digunakan untuk memasukkan nilai ke b yang sudah di declare
    System.out.println("nilai b = " + b);

    int variabel1 = 10;
    int variabel2 = 5;

    int hasil;

    //penjumlahan
    hasil = variabel1+variabel2;
    System.out.println(hasil);

    //pengurangan 
    hasil = variabel1-variabel2;
    System.out.println(hasil);

    //perkalian
    hasil = variabel1*variabel2;
    System.out.println(hasil);

    //pembagian
    hasil = variabel1 / variabel2;
    System.out.println(hasil);

    //integer tidak bisa berupa koma, jika ingin koma ditampilkan bisa menggunakan float
    float c = 6;
    float d = 5;
    float hasilFloat = a/b;
    System.out.println(hasilFloat);

    //modulus (sisa pembagian)
    hasil = variabel1%variabel2;
    System.out.println(hasil); //mod di sout ditulis "%%"

    //unary = operasi yang dilakukan pada satu  variabel
    //unary + dan -
    int angka = 1;
    System.out.println(+angka);
    System.out.println(-angka);

    //unary increment dan decrement 
    int angka2 = 10;
    angka2 ++;
    System.out.println(angka2);

    int angka3 = 10;
    angka3 --;
    System.out.println(angka3);

    int e = 5;
    System.out.println(++e);
    int f = 5;
    System.out.println(f++); //tetap 5 karena dia dicetak dulu baru di +
    System.out.println(f); //f jadi 6 soalnya mengandung hasil yang sebelumnya 

    int g = 5;
    System.out.println(g); //f jadi 6 soalnya mengandung hasil yang sebelumnya 
    System.out.println(g++); //tetap 5 karena dia dicetak dulu baru di +
    
    //assigment operator 
    int h = 1;
    h += 10; // a = a + 10
    System.out.println("nilai h = " + h);
    // -= untuk pengurangan
    // *= untuk perkalian 
    // /= untuk pembagian
    // %= untuk modulus

    //operator komparasi (operator yang akan menghasilkan nilai boolean)

    int i, j;
    boolean hasilKomparasi;

    //operator persamaan atau equal
    System.out.println("PERSAMAAN");
    i = 10;
    j = 10;
    hasilKomparasi = (i == j);
    System.out.println(hasilKomparasi);
    System.out.printf("%d == %d --> %s /n" ,i ,j, hasilKomparasi);

    // != pertidaksamaan
    // < > lebih dan kurang dari
    // <= kurang dari sama dengan
    // >= lebih dari sama dengan
   
    // video 15 catet, 16 skip

    
   }
}
