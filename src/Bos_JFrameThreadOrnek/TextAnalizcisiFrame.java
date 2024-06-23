package Bos_JFrameThreadOrnek;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAnalizcisiFrame extends JFrame{

    //Global bilesenler
    private JLabel lblTextVeriHint;
    private JTextField textVeri;
    private JLabel lblAranacakHarfHint;
    private JTextField aranacakHarf;
    private JButton buttonAra;
    private JLabel harfInfo;

    public TextAnalizcisiFrame() {
        //JFrame Ayaralari
        setTitle("Text Analizcisine Hosgeldiniz");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //bilesenleri new'le
        lblTextVeriHint = new JLabel("Aranacak Metini giriniz :");
        textVeri = new JTextField(10);
        lblAranacakHarfHint = new JLabel("Aranacak harfi giriniz");
        aranacakHarf = new JTextField(10);
        buttonAra = new JButton("ara");
        harfInfo = new JLabel();

        //button actionListener
        buttonAra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HarfAraThread harfAraThread = new HarfAraThread(textVeri.getText(), aranacakHarf.getText());
                harfAraThread.start();
                try {
                    harfAraThread.join();
                } catch (InterruptedException exception) {
                    System.out.println("Sorun Olustu : " + exception.getMessage());
                }
                int info = harfAraThread.getInfo();
                harfInfo.setText("Girilen metinde aranan harf sayısı : " + String.valueOf(info));
            }
        });

        //JPanel olustur ve bilesenleri ekle
        JPanel panel = new JPanel();
        panel.add(lblTextVeriHint);
        panel.add(textVeri);
        panel.add(lblAranacakHarfHint);
        panel.add(aranacakHarf);
        panel.add(buttonAra);
        panel.add(harfInfo);

        //Paneli jframe'e ekle
        add(panel);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextAnalizcisiFrame().setVisible(true);
            }
        });
    }

}
