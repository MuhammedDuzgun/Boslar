package Bos_CiftleriTopla;

import java.util.Scanner;

public class CiftleriTopla {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Bir sayı giriniz : ");
            int sayi = scanner.nextInt();
            if(sayi % 2 == 0) {
                toplam += sayi;
            }
        }

        System.out.println("Girdiginiz sayilardan cift olanlarin toplami : " + toplam);

    }

}
