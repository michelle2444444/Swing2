import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class credenciales {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;

    public credenciales() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField1.getText();
                String password = new String(passwordField1.getPassword());
                if (authenticate(username, password)) {
                    JFrame bioFrame = new JFrame("Biografía");
                    bioFrame.setContentPane(new biografia().getPanel());
                    bioFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    bioFrame.pack();
                    bioFrame.setLocationRelativeTo(null);
                    bioFrame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(panel1, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private boolean authenticate(String username, String password) {
        return "michellesua".equals(username) && "contrasenaM".equals(password);
    }

    public JPanel getPanel() {
        return panel1;
    }
}
