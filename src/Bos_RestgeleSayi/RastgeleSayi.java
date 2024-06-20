package Bos_RestgeleSayi;

import java.util.Random;

public class RastgeleSayi {

    public static void main(String[] args) {

        int rastgele = (int) (Math.random() * 50);
        System.out.println("rastgele : " + rastgele);

        Random random = new Random();
        int rastgele2 = random.nextInt();

        System.out.println("rastgele - 2 : " + rastgele2);

    }

}
