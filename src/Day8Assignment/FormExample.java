package Day8Assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class FormExample extends JFrame implements ActionListener {
    private JTextField nameField, emailField, addressField;
    private JLabel nameLabel, emailLabel, photoLabel, addressLabel;
    private JButton submitButton;
    private JPanel formPanel;

    public FormExample() {
        super("My Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        emailLabel = new JLabel("Email:");
        emailField = new JTextField(20);
        photoLabel = new JLabel("Photo:");
        JButton photoButton = new JButton("Choose");
        photoButton.addActionListener(this);
        addressLabel = new JLabel("Address:");
        addressField = new JTextField(20);
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        formPanel.add(nameLabel);
        formPanel.add(nameField);
        formPanel.add(emailLabel);
        formPanel.add(emailField);
        formPanel.add(photoLabel);
        formPanel.add(photoButton);
        formPanel.add(addressLabel);
        formPanel.add(addressField);
        formPanel.add(new JPanel());
        formPanel.add(submitButton);

        getContentPane().add(formPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String email = emailField.getText();
            String address = addressField.getText();

            // Validation checking
            boolean isValid = true;
            String errorMessage = "";
            if (name.isEmpty()) {
                errorMessage += "Name is required.\n";
                isValid = false;
            }
            if (email.isEmpty()) {
                errorMessage += "Email is required.\n";
                isValid = false;
            } else if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
                errorMessage += "Email is invalid.\n";
                isValid = false;
            }
            if (address.isEmpty()) {
                errorMessage += "Address is required.\n";
                isValid = false;
            }

            if (isValid) {
                // Submit the form
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Address: " + address);
            } else {
                // Show error message
                JOptionPane.showMessageDialog(this, errorMessage, "Validation Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Handle photo button
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                photoLabel.setText(file.getName());
            }
        }
    }

    public static void main(String[] args) {
        new FormExample();
    }
}

