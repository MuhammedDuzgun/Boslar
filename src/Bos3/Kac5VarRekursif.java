package Bos3;

public class Kac5VarRekursif {

    public static int donguSayac = 0;
    public static int arananSayac = 0;

    public static void main(String[] args) {

        int[] aranacakDizi = {5,5,5,1,1,4,5,5,5,5};
        int sonuc = kacBesVar(aranacakDizi);

        System.out.println(sonuc);


    }

    public static int kacBesVar(int[] argDizi) {
        if(donguSayac < argDizi.length) {
            if(argDizi[donguSayac] == 5) {
                arananSayac += 1;
            }
            donguSayac += 1;
            kacBesVar(argDizi);
        }
        return arananSayac;
    }

}
