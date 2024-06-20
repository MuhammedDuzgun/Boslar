package Bos3;

public class EnUzunStrBulRekursif {

    public static int donguSayac = 0;
    public static String enUzunStr = "";

    public static void main(String[] args) {

        String[] aranacakDizi = {"a","aaaaa","aa","aaa"};
        enUzunStrBul(aranacakDizi);


    }

    public static void enUzunStrBul(String[] argDizi) {
        if(donguSayac < argDizi.length) {
            if (argDizi[donguSayac].length() > enUzunStr.length()) {
                enUzunStr = argDizi[donguSayac];
            }
            donguSayac += 1;
            enUzunStrBul(argDizi);
        } else {
            System.out.println("En uzun string : " + enUzunStr);
        }
    }

}
