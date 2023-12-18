import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMInterface extends JFrame {
    private JTextField userField;
    private JPasswordField pinField;
    private JTextField amountField;
    private JLabel balanceLabel;
    private double balance = 1000.00; // Initial balance

    public ATMInterface() {
        setTitle("ATM Interface");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        add(panel);
        placeComponents(panel);

        setVisible(true);
    }

    private void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userField = new JTextField(20);
        userField.setBounds(100, 20, 165, 25);
        panel.add(userField);

        JLabel pinLabel = new JLabel("PIN");
        pinLabel.setBounds(10, 50, 80, 25);
        panel.add(pinLabel);

        pinField = new JPasswordField(20);
        pinField.setBounds(100, 50, 165, 25);
        panel.add(pinField);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);

        JLabel amountLabel = new JLabel("Amount");
        amountLabel.setBounds(10, 110, 80, 25);
        panel.add(amountLabel);

        amountField = new JTextField(20);
        amountField.setBounds(100, 110, 165, 25);
        panel.add(amountField);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(10, 140, 100, 25);
        panel.add(withdrawButton);

        balanceLabel = new JLabel("Balance: " + balance);
        balanceLabel.setBounds(10, 170, 200, 25);
        panel.add(balanceLabel);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String user = userField.getText();
                String pin = new String(pinField.getPassword());
                // Add your authentication logic here
                System.out.println("User: " + user + ", PIN: " + pin);
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double amount = Double.parseDouble(amountField.getText());
                if (amount <= balance) {
                    balance -= amount;
                    balanceLabel.setText("Balance: " + balance);
                    System.out.println("Withdrawn: " + amount);
                } else {
                    System.out.println("Insufficient balance.");
                }
            }
        });
    }

    public static void main(String[] args) {
        new ATMInterface();
    }
}