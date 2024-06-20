package Bos_ThreadDenemesi;

public class Test {

    public static void main(String[] args) {

        KronometreThread thread1 = new KronometreThread("A");
        KronometreThread thread2 = new KronometreThread("B");
        KronometreThread thread3 = new KronometreThread("C");

        thread1.startMyThread();
        thread2.startMyThread();
        thread3.startMyThread();

    }

}
