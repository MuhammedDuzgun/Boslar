package Bos_JFrame_Ile_HesapMakinesi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HesapMakinesi extends JFrame implements ActionListener{

        private JTextField display;
        private String currentOperator;
        private double currentValue;

        public HesapMakinesi() {
            // JFrame ayarları
            setTitle("Hesap Makinesi");
            setSize(400, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLayout(new BorderLayout());

            // Display alanı
            display = new JTextField();
            display.setEditable(false);
            display.setFont(new Font("Arial", Font.BOLD, 32));
            add(display, BorderLayout.NORTH);

            // Butonlar paneli
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(5, 4));

            // Butonlar dizisi
            String[] buttons = {
                    "7", "8", "9", "/",
                    "4", "5", "6", "*",
                    "1", "2", "3", "-",
                    "0", ".", "=", "+",
                    "C"
            };

            // Butonları oluştur ve panel'e ekle
            for (String text : buttons) {
                JButton button = new JButton(text);
                button.setFont(new Font("Arial", Font.BOLD, 32));
                button.addActionListener(this);
                panel.add(button);
            }

            add(panel, BorderLayout.CENTER);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            // Rakamlar ve nokta
            if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
                display.setText(display.getText() + command);
            }
            // Temizleme
            else if (command.equals("C")) {
                display.setText("");
                currentValue = 0;
                currentOperator = null;
            }
            // Eşittir
            else if (command.equals("=")) {
                if (currentOperator != null) {
                    double result = calculate(currentValue, Double.parseDouble(display.getText()), currentOperator);
                    display.setText(Double.toString(result));
                    currentValue = result;
                    currentOperator = null;
                }
            }
            // İşlem butonları
            else {
                if (!display.getText().isEmpty()) {
                    if (currentOperator != null) {
                        currentValue = calculate(currentValue, Double.parseDouble(display.getText()), currentOperator);
                        display.setText(Double.toString(currentValue));
                    } else {
                        currentValue = Double.parseDouble(display.getText());
                    }
                    currentOperator = command;
                    display.setText("");
                }
            }
        }

        private double calculate(double a, double b, String operator) {
            switch (operator) {
                case "+": return a + b;
                case "-": return a - b;
                case "*": return a * b;
                case "/": return a / b;
                default: return 0;
            }
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                HesapMakinesi calculator = new HesapMakinesi();
                calculator.setVisible(true);
            });
        }
}
