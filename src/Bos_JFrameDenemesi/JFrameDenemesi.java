package Bos_JFrameDenemesi;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDenemesi extends JFrame {

    //JFrame bilesenleri
    JTextField textFieldName;
    JLabel label;
    JButton button;

    public JFrameDenemesi() {
        //JFrame Ayarlari
        setTitle("Deneme Uygulamasina Hosgeldiniz");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Bilesenleri olustur
        textFieldName = new JTextField(20);
        label = new JLabel();
        button = new JButton("Tikla");

        //button icin actionListener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = textFieldName.getText();
                label.setText("Hosgeldiniz  : " + userInput);
            }
        });

        //Panel olustur bilesenleri ekle
        JPanel panel = new JPanel();
        panel.add(textFieldName);
        panel.add(label);
        panel.add(button);

        //Paneli JFrame'e ekle
        add(panel);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFrameDenemesi().setVisible(true);
            }
        });
    }

}
