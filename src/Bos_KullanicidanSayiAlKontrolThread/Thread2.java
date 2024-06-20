package Bos_KullanicidanSayiAlKontrolThread;

public class Thread2 extends Thread {

    private String threadName;
    private Thread thread;

    public Thread2(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            System.out.println("100'den kucuk");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void startMyThread() {
        if(thread == null) {
            thread = new Thread(Thread2.this, threadName);
            thread.start();
        }
    }

}
