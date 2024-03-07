/*public static void main(String[] args) {
int n = 5;
System.out.println(n + "! = " + faktorial(n));
}

public static int faktorial(int n) {
if (n == 0 || n == 1) {
    return 1;
} else {
    return n * faktorial(n - 1);
}
}*/

/*public static void main(String[] args) {
    System.out.println(faktorial(0));
    System.out.println(faktorial(5));
}
public static int faktorial(int n) {
    if (n < 0) {
        return -1;
    }
    int hasil = 1;
    for (int i = 1; i <= n; i++) {
        hasil *= i;
    }
    return hasil;
}
}*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class recursive {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String fromCurrency  = input.nextLine();
        double amount = input.nextDouble();
        input.nextLine();
        String toCurrency = input.nextLine();
        double hasil = convertCurrency(fromCurrency, amount, toCurrency);
        System.out.println(Math.round(hasil * 10.0)/ 10.0 + " " + toCurrency);
    }
  
  public static double convertCurrency(String fromCurrency, double amount, String toCurrency) {
        double rateFromUSD = getExchangeRate(fromCurrency);
        double rateToUSD = getExchangeRate(toCurrency);
        return (amount / rateFromUSD) * rateToUSD;
    }
  
  
      public static double getExchangeRate(String currency) {
        switch (currency) {
            case "USD":
                return 1.0;
            case "JPY":
                return 110.0; // 1 USD = 110 JPY
            case "KR":
                return 1200.0; // 1 USD = 1200 KR
            case "AUD":
                return 1.4; // 1 USD = 1.4 AUD
            case "CAD":
                return 1.25; // 1 USD = 1.25 CAD
            case "EUR":
                return 0.88; // 1 USD = 0.88 EUR
            case "GBP":
                return 0.75; // 1 USD = 0.75 GBP
            default:
                return 0;
           }
   }
}

/*import java.util.Scanner;

public class recursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = 0;
        Integer[] array = new Integer[size];
        while (true) {
            String perintah = input.next();
            if (perintah.equals("INSERT")) {
                int value = input.nextInt();
                size = insert(array, size, value);
            } else if (perintah.equals("DELETE")) {
                int index = input.nextInt();
                size = delete(array, size, index);
            } else if (perintah.equals("UPDATE")) {
                int index = input.nextInt();
                int newValue = input.nextInt();
                size = update(array, size, index, newValue);
            } else if (perintah.equals("DISPLAY")) {
                display(array, size);
            } else if (perintah.equals("END")) {
                // display(array, size);
                break;
            }
        }

    }

    public static int insert(Integer[] array, int size, int value) {
        if (size < array.length) {
            array[size] = value;
            return size + 1;
        }
        return size;
    }

    public static int delete(Integer[] array, int size, int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            return size - 1;
        }
        return size;
    }

    public static int update(Integer[] array, int size, int index, int newValue) {
        if (index >= 0 && index < size) {
            array[index] = newValue;
        }
        return size;
    }

    public static void display(Integer[] array, int size) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                System.out.print(array[i]);
            } else {
                System.out.print("null");
            }
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}*/
