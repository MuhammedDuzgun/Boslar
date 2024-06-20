package Bos_CikmisSoru;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotOrtalamasi {
    public static void main(String[] args) {
        // Dosya adı
        String fileName = "notlar.txt";

        // Her ders için notları saklamak için bir Map kullanıyoruz
        Map<String, List<Integer>> dersNotlari = new HashMap<>();

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(fileName));
            String line;
            String currentDers = null;

            while ((line = bufferedReader.readLine()) != null) {
                // Eğer satır harf içeriyorsa, bu bir ders kodudur
                if (Character.isLetter(line.charAt(0))) {
                    currentDers = line;
                    dersNotlari.put(currentDers, new ArrayList<>());
                } else {
                    // Aksi takdirde, bu bir nottur
                    int not = Integer.parseInt(line);
                    dersNotlari.get(currentDers).add(not);
                }
            }

            //buffered reader kapat
            if(bufferedReader != null) {
                bufferedReader.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Her dersin not ortalamasını hesapla ve yazdır
        for (Map.Entry<String, List<Integer>> entry : dersNotlari.entrySet()) {
            String ders = entry.getKey();
            List<Integer> notlar = entry.getValue();
            int toplam = 0;
            for (int not : notlar) {
                toplam += not;
            }
            double ortalama = (double) toplam / notlar.size();
            System.out.println(ders + " ortalaması: " + ortalama);
        }
    }

}
