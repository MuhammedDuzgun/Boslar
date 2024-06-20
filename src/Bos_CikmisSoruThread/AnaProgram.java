package Bos_CikmisSoruThread;

import java.util.Random;

public class AnaProgram {

    public static void main(String[] args) {

        //Rastgele sayılarla doldurulmuş 100.000 elemanlı bir tamsayı dizisinin en büyük elemanı İş
        //Parçacıkları (Threads) yardımıyla bulunmak istenmektedir:
        //AnaProgram adlı bir sınıfta diziyi oluşturup rastgele sayılarla doldurunuz.
        //MaxThread adında Thread sınıfından türetilmiş bir sınıf yazınız.
        //AnaProgram’da diziyi 4 eşit parçaya bölüp herbir parçayı bir MaxThread nesnesine
        //gönderip, herbir parçanın en büyük değerini hesaplatınız. Daha sonra bu değerleri
        //AnaProgramda toplayıp en büyüğünü ekrana yazdırınız.

        int[] anaDizi = new int[100];

        int maxlarToplam = 0;
        int maxlarinMaxi = 0;

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int randomSayi = random.nextInt(1000);
            anaDizi[i] = randomSayi;
        }

        int partSize = anaDizi.length / 4;

        int[] diziParca1 = new int[25];
        int[] diziParca2 = new int[25];
        int[] diziParca3 = new int[25];
        int[] diziParca4 = new int[25];

        System.arraycopy(anaDizi, 0, diziParca1, 0, partSize);
        System.arraycopy(anaDizi, partSize, diziParca2, 0, partSize);
        System.arraycopy(anaDizi, partSize * 2, diziParca3, 0, partSize);
        System.arraycopy(anaDizi, partSize * 3, diziParca4, 0, partSize);

        MaxThread thread1 = new MaxThread("Thread1", diziParca1);
        MaxThread thread2 = new MaxThread("Thread2", diziParca2);
        MaxThread thread3 = new MaxThread("Thread3", diziParca3);
        MaxThread thread4 = new MaxThread("Thread4", diziParca4);

        thread1.startMaxThread();
        thread2.startMaxThread();
        thread3.startMaxThread();
        thread4.startMaxThread();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        int maxDiziParca1 = thread1.getArananBuyuk();
        int maxDiziParca2 = thread2.getArananBuyuk();
        int maxDiziParca3 = thread3.getArananBuyuk();
        int maxDiziParca4 = thread4.getArananBuyuk();

        maxlarToplam = maxDiziParca1 + maxDiziParca2 + maxDiziParca3 + maxDiziParca4;

        int[] geciciDizi = {maxDiziParca1, maxDiziParca2, maxDiziParca3,maxDiziParca4};
        maxlarinMaxi = geciciDizi[0];

        for (int i = 0; i < geciciDizi.length; i++) {
            if(geciciDizi[i] > maxlarinMaxi) {
                maxlarinMaxi = geciciDizi[i];
            }
        }
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("Maxlarin Maxi : " + maxlarinMaxi);
        System.out.println("Maxlarin Toplami : " + maxlarToplam);


    }



}
