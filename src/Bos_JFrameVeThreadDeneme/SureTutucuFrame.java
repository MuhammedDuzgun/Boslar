package Bos_JFrameVeThreadDeneme;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SureTutucuFrame extends JFrame {

    //Global bilesenler
    private JLabel lblSureHint;
    private JTextField textFieldSure;
    private JButton buttonBaslat;
    private JLabel labelSureBittiInfo;

    public SureTutucuFrame() {
        //JFrame ayarlari
        setTitle("Sure tutucu");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //bilesenleri olustur
        lblSureHint = new JLabel();
        lblSureHint.setText("Sure giriniz : ");
        textFieldSure = new JTextField(10);
        buttonBaslat = new JButton("Baslat");
        labelSureBittiInfo = new JLabel("Beklemede");

        //Button actionListener
        buttonBaslat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int inputSure = Integer.parseInt(textFieldSure.getText());
                KronometreThread kronometreThread = new KronometreThread(inputSure);
                kronometreThread.start();
                try {
                    kronometreThread.join();
                } catch (InterruptedException exception) {
                    System.out.println("Sorun olustu : " + exception.getMessage());
                }
                labelSureBittiInfo.setText("Sure Tamamlandi");
            }
        });

        //JPanel olustur ve bilesenleri ekle
        JPanel panel = new JPanel();
        panel.add(lblSureHint);
        panel.add(textFieldSure);
        panel.add(buttonBaslat);
        panel.add(labelSureBittiInfo);

        //paneli jFrame'e ekle
        add(panel);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SureTutucuFrame().setVisible(true);
            }
        });
    }

}
