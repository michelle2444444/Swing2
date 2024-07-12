import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hobbie {
    private JPanel panel2;
    private JButton volverButton;

    public Hobbie() {
        panel2 = new JPanel();
        volverButton = new JButton("Volver");

        try {
            ImageIcon hobbyIcon = new ImageIcon("C:\\Users\\hp\\Downloads\\GitHub\\Swing2\\1-1.png");
            JLabel hobbyImage = new JLabel(hobbyIcon);
            panel2.add(hobbyImage);
        } catch (Exception e) {
            System.err.println("Error al cargar la imagen: " + e.getMessage());
        }

        panel2.add(volverButton);

        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame bioFrame = new JFrame("Biografía");
                bioFrame.setContentPane(new biografia().getPanel());
                bioFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                bioFrame.pack();
                bioFrame.setLocationRelativeTo(null);
                bioFrame.setVisible(true);
            }
        });
    }

    public JPanel getPanel() {
        return panel2;
    }
}