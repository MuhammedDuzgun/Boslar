package CikmisSoru_Fonksiyon;

public class Test {

    public static void main(String[] args) {

        // Varsayılan kurucu ile nesne oluşturma
        Fonksiyon seri1 = new Fonksiyon();
        System.out.println("Varsayılan n değeri için:");
        System.out.println("Seri: " + seri1.goster());
        System.out.println("Toplam: " + seri1.topla());

        // Parametreli kurucu ile nesne oluşturma
        Fonksiyon seri2 = new Fonksiyon(10);
        System.out.println("\nParametreli n değeri için:");
        System.out.println("Seri: " + seri2.goster());
        System.out.println("Toplam: " + seri2.topla());

    }

}
