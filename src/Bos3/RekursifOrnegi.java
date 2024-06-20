package Bos3;

public class RekursifOrnegi {

    public static int donguSayac = 0;

    public static void main(String[] args) {
        isimYazdir("Muhammed");
    }

    public static void isimYazdir(String isim) {
        if(donguSayac <= 9) {
            System.out.println(isim);
            donguSayac += 1;
            isimYazdir(isim);
        }

    }

}
