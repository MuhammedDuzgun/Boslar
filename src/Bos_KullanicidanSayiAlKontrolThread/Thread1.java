package Bos_KullanicidanSayiAlKontrolThread;

public class Thread1 extends Thread {

    private String threadName;
    private Thread thread;

    public Thread1(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            System.out.println("100'den Buyuk");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
     }

     public void startMyThread() {
        if(thread == null) {
            thread = new Thread(Thread1.this, threadName);
            thread.start();
        }
     }

}
