import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MileToKilometerConverter extends JFrame implements ActionListener {
    private JTextField mileTextField;
    private JLabel resultLabel;

    public MileToKilometerConverter() {
        setTitle("Mile to Kilometer Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel titleLabel = new JLabel("Mile to Kilometer Converter");
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(titleLabel);

        mileTextField = new JTextField();
        panel.add(mileTextField);

        JButton convertButton = new JButton("Convert!");
        convertButton.addActionListener(this);
        panel.add(convertButton);

        resultLabel = new JLabel();
        resultLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(resultLabel);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Convert!")) {
            try {
                double miles = Double.parseDouble(mileTextField.getText());
                double kilometers = miles * 1.609;
                resultLabel.setText(miles + " miles is equal to " + kilometers + " kilometers.");
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input! Please enter a valid number of miles.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MileToKilometerConverter converter = new MileToKilometerConverter();
            converter.setVisible(true);
        });
    }
}
