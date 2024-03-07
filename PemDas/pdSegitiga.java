public class pdSegitiga {
    public static void main(String[] args) {
        System.out.println("============SEGITIGA SIKU KANAN BAWAH================");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("============SEGITIGA SIKU KIRI ATAS================");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            // for (int k = 0; k <= i; k++) {
            //     System.out.print("*");
            // }
            System.out.println();
        }
        System.out.println();
        System.out.println("============SEGITIGA SIKU KANAN ATAS================");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("============SEGITIGA SAMA KAKI================");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            for (int n = 0; n < i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("============BELAH KETUPAT================");
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i + 1; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            for (int n = 0; n < i; n++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k > i + 1; k--) {
                System.out.print("*");
            }
            for (int n = 4; n > i; n--) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
