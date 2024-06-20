package Bos_ThreadDenemesi;

public class KronometreThread extends Thread{

    private String threadName;
    private Thread thread;

    public KronometreThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            for(int i = 1; i<=10; i++) {
                System.out.println(threadName + " : " +  i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void startMyThread() {
        if(thread == null) {
            thread = new Thread(KronometreThread.this, threadName);
            thread.start();
        }
    }

}
