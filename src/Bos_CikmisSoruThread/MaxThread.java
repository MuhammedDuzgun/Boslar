package Bos_CikmisSoruThread;

public class MaxThread extends  Thread{

    private String name;
    private Thread thread;
    private int[] aranacakDizi;
    private int arananBuyuk;

    public MaxThread(String name, int[] aranacakDizi) {
        this.name = name;
        this.aranacakDizi = aranacakDizi;
    }

    @Override
    public void run() {
        try {
            arananBuyuk = aranacakDizi[0];
            for (int i = 0; i < aranacakDizi.length; i++) {
                if(aranacakDizi[i] > arananBuyuk) {
                    arananBuyuk = aranacakDizi[i];
                }
            }
        } catch (Exception e) {
            System.out.println("Sorun Oluştu : " + e.getMessage());
        }
    }

    public void startMaxThread() {
        if(thread == null) {
            thread = new Thread(MaxThread.this, name);
            thread.start();
        }
    }

    public int getArananBuyuk() {
        return arananBuyuk;
    }
}
