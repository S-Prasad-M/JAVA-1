import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SnowmanMover extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton leftButton;
    private JButton rightButton;
    private JButton upButton;
    private JButton downButton;
    private JLabel snowmanLabel;

    private int snowmanX;
    private int snowmanY;

    public SnowmanMover() {
        setTitle("Snowman Mover");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);

        snowmanX = 150;
        snowmanY = 150;

        snowmanLabel = new JLabel(new ImageIcon("snowman.png"));
        snowmanLabel.setBounds(snowmanX, snowmanY, 100, 100);
        panel.add(snowmanLabel);

        leftButton = new JButton("Left");
        leftButton.setBounds(50, 300, 80, 30);
        leftButton.addActionListener(this);
        panel.add(leftButton);

        rightButton = new JButton("Right");
        rightButton.setBounds(140, 300, 80, 30);
        rightButton.addActionListener(this);
        panel.add(rightButton);

        upButton = new JButton("Up");
        upButton.setBounds(230, 300, 80, 30);
        upButton.addActionListener(this);
        panel.add(upButton);

        downButton = new JButton("Down");
        downButton.setBounds(320, 300, 80, 30);
        downButton.addActionListener(this);
        panel.add(downButton);

        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == leftButton) {
            snowmanX -= 10;
        } else if (e.getSource() == rightButton) {
            snowmanX += 10;
        } else if (e.getSource() == upButton) {
            snowmanY -= 10;
        } else if (e.getSource() == downButton) {
            snowmanY += 10;
        }

        snowmanLabel.setBounds(snowmanX, snowmanY, 100, 100);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SnowmanMover mover = new SnowmanMover();
            mover.setVisible(true);
        });
    }
}
