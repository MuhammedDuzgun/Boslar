package Bos_JFrameThreadOrnek;

public class HarfAraThread extends Thread{

    private String aranacakMetin;
    private String aranacakHarf;
    private int info;

    public HarfAraThread(String aranacakMetin, String aranacakHarf) {
        this.aranacakMetin = aranacakMetin;
        this.aranacakHarf = aranacakHarf;
    }

    @Override
    public void run() {
        info = 0;
        for (int i = 0; i < aranacakMetin.length(); i++) {
            if(aranacakMetin.charAt(i) == aranacakHarf.charAt(0)) {
                info += 1;
            }
        }
    }

    public int getInfo() {
        return info;
    }
}
