package za.ac.mycput.views;

import javax.swing.*;

public class AccountsGUI extends JFrame{
    private JTextField txtUsername;
    private JTextField txtEmail;
    private JPasswordField txtPassword;

    public AccountsGUI() {
        super("Add Account");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(10, 10, 80, 25);
        panel.add(usernameLabel);

        txtUsername = new JTextField(20);
        txtUsername.setBounds(100, 10, 160, 25);
        panel.add(txtUsername);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 40, 80, 25);
        panel.add(passwordLabel);

        txtPassword = new JPasswordField(20);
        txtPassword.setBounds(100, 40, 160, 25);
        panel.add(txtPassword);

//        JButton saveButton = new JButton("Save");
//        saveButton.setBounds(10, 80, 80, 25);
//        saveButton.addActionListener(event -> saveAccount());
//        panel.add(saveButton);
//
//        JButton cancelButton = new JButton("Cancel");
//        cancelButton.setBounds(100, 80, 80, 25);
//        cancelButton.addActionListener(event -> dispose());
//        panel.add(cancelButton);

        setContentPane(panel);
        setSize(280, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}
