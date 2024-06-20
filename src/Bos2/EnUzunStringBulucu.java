package Bos2;

public class EnUzunStringBulucu {

    public static void main(String[] args) {

        String[] aranacakDizi = {"a","aaaa","aa","aaa"};
        String enUzunAranan = enUzunBul(aranacakDizi);
        System.out.println("Dizide bulunan en uzun String : " + enUzunAranan);

    }

    public static String enUzunBul(String[] argStringDizi) {
        String enUzunStr = argStringDizi[0];
        for (String eleman : argStringDizi) {
            if(eleman.length() > enUzunStr.length()) {
                enUzunStr = eleman;
            }
        }
        return enUzunStr;
    }

}
