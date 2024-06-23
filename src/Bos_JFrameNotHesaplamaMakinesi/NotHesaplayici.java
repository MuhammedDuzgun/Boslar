package Bos_JFrameNotHesaplamaMakinesi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotHesaplayici extends JFrame {

    //Global biesenler
    private JLabel vizeHint;
    private JTextField textFieldVize;
    private JTextField textFieldFinal;
    private JLabel finalHint;
    private JButton buttonHesapla;
    private JLabel labelSonuc;

    public NotHesaplayici() {
        //JFrame Ayarlari
        setTitle("Ortalama Hesaplayici");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Bilesenleri olustur
        vizeHint = new JLabel("Vize notunuzu giriniz : ");
        textFieldVize = new JTextField(10);
        finalHint = new JLabel("Final notunuzu giriniz : ");
        textFieldFinal = new JTextField(10);
        buttonHesapla = new JButton("Hesapla");
        labelSonuc = new JLabel();

        //Buttom - actionlistener ekle
        buttonHesapla.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int vizeNot = Integer.parseInt(textFieldVize.getText());
                int finalNot = Integer.parseInt(textFieldFinal.getText());
                double ortalama = vizeNot * 0.4 + finalNot * 0.6;

                labelSonuc.setText("Ders ortalamanız : " + ortalama);
            }
        });

        //Panel olustur bilesenleri ekle
        JPanel panel = new JPanel();
        panel.add(vizeHint);
        panel.add(textFieldVize);
        panel.add(finalHint);
        panel.add(textFieldFinal);
        panel.add(buttonHesapla);
        panel.add(labelSonuc);

        //JFrame'e paneli ekle
        add(panel);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NotHesaplayici().setVisible(true);
            }
        });
    }

}
