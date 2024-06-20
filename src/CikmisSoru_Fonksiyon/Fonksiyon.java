package CikmisSoru_Fonksiyon;

public class Fonksiyon {

    int n;

    public Fonksiyon() {
        this.n = 5;
    }

    public Fonksiyon(int n) {
        this.n = n;
    }

    // Toplamı hesaplayan metot
    public int topla() {
        int toplam = 0;
        for (int i = 0; i <= n; i++) {
            toplam += Math.pow(2, i);
        }
        return toplam;
    }

    // Seriyi gösteren metot
    public String goster() {
        StringBuilder seri = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                seri.append(" + ");
            }
            seri.append("2^").append(i);
        }
        return seri.toString();
    }

}
