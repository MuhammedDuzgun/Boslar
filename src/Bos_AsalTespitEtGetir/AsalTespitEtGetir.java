package Bos_AsalTespitEtGetir;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class AsalTespitEtGetir {

    public static void main(String[] args) {
        try {
            File file = new File("Ali.txt");
            File fileAsal = new File("asal.txt");
            FileWriter fileWriter = new FileWriter(fileAsal, true);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()){
                int sayi = scanner.nextInt();
                boolean asalTest = asalMi(sayi);
                if(asalTest) {
                   fileWriter.write(String.valueOf(sayi) + "\n");
                }
            }

            fileWriter.close();
            scanner.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static boolean asalMi(int sayi) {
        if(sayi <= 1) {
            return false;
        } else {
            for (int i = 2; i < sayi; i++) {
                if(sayi % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


}
