package Bos4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Dosyaya10aKadarSayiEkle {

    public static void main(String[] args) {

        try {
            File file = new File("Ali.txt");
            FileWriter fileWriter = new FileWriter(file, true);

            for (int i = 1; i <= 10; i++) {
                fileWriter.write(i + "\n");
            }

            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}
