import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class biografia {
    private JPanel panel;
    private JLabel biografia, texto1, texto2, texto3, texto4, texto5, texto6, texto7, texto8, texto9, texto10, texto11, texto12, texto13, texto14;
    private JButton hobbieButton;

    public biografia() {
        hobbieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame hobbieFrame = new JFrame("Hobbie");
                hobbieFrame.setContentPane(new Hobbie().getPanel());
                hobbieFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                hobbieFrame.pack();
                hobbieFrame.setLocationRelativeTo(null);
                hobbieFrame.setVisible(true);
            }
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}