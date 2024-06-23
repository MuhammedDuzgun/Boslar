package Bos_AsciiSoru;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AsciiToplam {

    public static void main(String[] args) {

        /*
        * kelimeler.txt dosyasında her satırda kelimeler bulunmaktadır. Bu dosyada bulunan tum kelimelerdeki tum
        * karakterlerin ascii karsiliklarinin toplamini bulan programı yazalım
        * */

        try {
            File file = new File("kelimeler.txt");
            Scanner scanner = new Scanner(file);
            int asciiToplam = 0;

            while (scanner.hasNext()) {
                String currentKelime = scanner.nextLine();
                for (int i = 0; i < currentKelime.length(); i++) {
                    char currentChar = currentKelime.charAt(i);
                    int asciiDegerChar = (int) currentChar;
                    asciiToplam += asciiDegerChar;
                }

            }
            scanner.close();
            System.out.println("dosyada bulunan tum karakterlerin ascii deger toplami : " + asciiToplam);
        } catch (IOException e) {

        }



    }

}
