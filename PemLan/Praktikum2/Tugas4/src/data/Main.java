package data;

    import java.time.LocalDate;
    
    public class Main {
    
        public static void main(String[] args) {
            Manusia lakilakiMenikah = new Manusia("nobu", true, "22345687244", true);
            System.out.println(lakilakiMenikah);
            System.out.println();
    
            Manusia perempuanMenikah = new Manusia("kumo", false, "3456683168", true);
            System.out.println(perempuanMenikah);
            System.out.println();
    
            Manusia belummenikah = new Manusia("kahfi", false, "3773266789", false);
            System.out.println(belummenikah);
            System.out.println();
    
            MahasiswaFILKOM andyFilkom = new MahasiswaFILKOM("244444422433444", 2.9, "andy", true, "33334535463", false);
            System.out.println(andyFilkom);
            System.out.println();
    
            MahasiswaFILKOM windiFilkom = new MahasiswaFILKOM("235150401111040", 3.43, "windi", false, "3248876", false);
            System.out.println(windiFilkom);
            System.out.println();
    
            MahasiswaFILKOM buzzFilkom = new MahasiswaFILKOM("234344778689", 3.64, "buzz", true, "3256764", false);
            System.out.println(buzzFilkom);
            System.out.println();
    
            Pekerja duaTahun = new Pekerja(5000, LocalDate.of(2022, 1, 1), 2, "umar", "1234567890123456", true, true);
            System.out.println(duaTahun);
            System.out.println();
    
            Pekerja sembilanTahun = new Pekerja(5000, LocalDate.of(2015, 1, 1), 0, "anova", "1866856", false, true);
            System.out.println(sembilanTahun);
            System.out.println();
    
            Pekerja duapuluhTahun = new Pekerja(5000, LocalDate.of(2004, 1, 1), 10, "ali", "1239809346", true, true);
            System.out.println(duapuluhTahun);
            System.out.println();
    
            Manager mateo = new Manager("HRD", 7500, LocalDate.of(2009, 1, 1), 3, "mateo", true, "111", true);
            System.out.println(mateo);
            System.out.println();
        }
    }

    // public static void main(String[] args) {
    //             // Testcase Manusia
    //             Manusia manusiaA = new Manusia("A", true, "111", true);
    //             System.out.println(manusiaA);
    //             System.out.println();
        
    //             // Testcase MahasiswaFILKOM
    //             MahasiswaFILKOM mahasiswaFilkomB = new MahasiswaFILKOM("165150300111100", 4.0, "B", false, "111", false);
    //             System.out.println(mahasiswaFilkomB);
    //             System.out.println();
        
    //             // Testcase Pekerja
    //             Pekerja pekerjaC = new Pekerja(1000, LocalDate.of(2016, 3, 2), 4, "C", "111", true, true);
    //             System.out.println(pekerjaC);
    //             System.out.println();
        
    //             // Testcase Manager
    //             Manager managerD = new Manager("HRD", 1000, LocalDate.of(2017, 1, 2), 3, "D", true, "111", true);
    //             System.out.println(managerD);
    //         }
