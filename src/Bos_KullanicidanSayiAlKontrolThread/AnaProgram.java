package Bos_KullanicidanSayiAlKontrolThread;

import java.util.Scanner;

public class AnaProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayi giriniz");

        int kullaniciSayi = scanner.nextInt();

        Thread1 thread1;
        Thread2 thread2;

        if(kullaniciSayi > 100) {
            thread1 = new Thread1("thread1");
            thread1.startMyThread();
        } else {
            thread2 = new Thread2("Thread2");
            thread2.startMyThread();
        }

    }

}
