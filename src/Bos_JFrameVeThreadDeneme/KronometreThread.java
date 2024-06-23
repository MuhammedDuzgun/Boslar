package Bos_JFrameVeThreadDeneme;

public class KronometreThread extends Thread{

    private int sure;

    public KronometreThread(int sure) {
        this.sure = sure;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(sure * 1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

}
