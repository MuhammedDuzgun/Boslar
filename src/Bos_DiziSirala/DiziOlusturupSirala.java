package Bos_DiziSirala;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class DiziOlusturupSirala {

    public static void main(String[] args) {

        //100 elemanlı bir tamsayı dizisi oluşturup bu diziyi rastgele sayılarla doldurunuz ve daha sonra bu
        //diziyi küçükten büyüğe doğru sıralayanız

        Integer[] dizi = new Integer[100];
        Random random = new Random();
        for (int i = 0; i < dizi.length; i++) {
            int sayi = random.nextInt();
            dizi[i] = sayi;
        }

        System.out.println("Dizinin sıralanmadan onceki hali : ");
        System.out.println(Arrays.toString(dizi));

        //kucukten buyuge siralanmis hal
        Arrays.sort(dizi);
        System.out.println("Dizinin kucukten buyuge siralanmis hali : ");
        System.out.println(Arrays.toString(dizi));

        //Buyukten kucuge siralanmis hal
        Arrays.sort(dizi, Collections.reverseOrder());
        System.out.println("Dizinin buyukten kucuge siralanmis hali : " );
        System.out.println(Arrays.toString(dizi));

    }

}
