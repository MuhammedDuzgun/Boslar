package Bos_NegatifGeleneKadarTopla;

import java.util.Scanner;

public class NegatifGeleneKadarTopla {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        boolean durum = true;

        while (durum) {
            System.out.println("Bir sayi giriniz : ");
            int sayi = scanner.nextInt();
            if(sayi < 0) {
                durum = false;
            } else {
                if(sayi %2 == 0) {
                    toplam += sayi;
                }
            }
        }

        System.out.println("Girdiginiz Sayilardan cift olanlarin toplami : " + toplam);

    }

}
