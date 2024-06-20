package Bos_IlkHarfNe;

public class IlkHarfNe {

    public static void main(String[] args) {

        String isim = "muhammed";
        String isim2 = "ahmet";
        String isim3 = "celal";

        int result1 =  isim.compareTo(isim2);
        int result2 =  isim.compareTo(isim3);
        int result3 =  isim3.compareTo(isim2);
        int result4 = isim2.compareTo(isim3);

        if(result1 > 0) {
            System.out.println(isim2 + ", " + isim + " ' " +  " den önce gelmektedir.");
        }

        if(result4 < 0) {
            System.out.println("isim2 isim3 ten önce gelmektedir");
        }

        System.out.println("--------------------------------------------------");

        if(isim.startsWith("m")) {
            System.out.println("dogru");
        } else {
            System.out.println("yanlis");
        }

        if(isim.charAt(0)== 'M') {
            System.out.println("dogru - 2");
        }

        System.out.println("--------------------------------------------------");

        System.out.println(isim.substring(0,3));

        String yeniIsım = isim.concat(" Düzgün");
        System.out.println(yeniIsım);

        boolean uhVarmi = isim.contains("uh");


        if(uhVarmi) {
            System.out.println("uh varmis");
        }

        System.out.println("----------------------------------------------------------");

        char firstLetterOfIsim = isim.charAt(0);
        int asciiDeger = (int) firstLetterOfIsim;

        System.out.println("M harfinin ascii karsiligi: " + asciiDeger);

    }

}
