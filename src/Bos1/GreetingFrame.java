package Bos1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GreetingFrame extends JFrame {

    private JTextField textField;
    private JLabel label;
    private JButton button;

    public GreetingFrame() {
        // JFrame ayarları
        setTitle("Hoşgeldiniz Uygulaması");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Pencereyi ortalar

        // Bileşenleri oluştur
        textField = new JTextField(20);
        label = new JLabel("Hoşgeldiniz");
        button = new JButton("Greet");

        // Buton için ActionListener ekle
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = textField.getText();
                label.setText("Hoşgeldiniz " + userInput);
            }
        });

        // Panel oluştur ve bileşenleri ekle
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(button);
        panel.add(label);

        // Paneli JFrame'in ContentPane'ine ekle
        add(panel);

        // JFrame'i görünür yap
        setVisible(true);
    }

    public static void main(String[] args) {
        // GUI'nin Event Dispatch Thread (EDT) içinde oluşturulmasını sağla
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GreetingFrame().setVisible(true);
            }
        });

//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                new GreetingFrame();
//            }
//        });
    }

}

