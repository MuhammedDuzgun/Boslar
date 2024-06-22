package Bos_ThreadOrnekCozum;

import java.util.Scanner;

public class AnaProgram {

    public static void main(String[] args) {

        Thread1 thread1;
        Thread2 thread2;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("tam sayi giriniz : ");
            int sayi = scanner.nextInt();
            if(sayi > 100) {
                thread1 = new Thread1();
                thread1.start();
                try {
                    thread1.join();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                thread2 = new Thread2();
                thread2.start();
                try {
                    thread2.join();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }

}
