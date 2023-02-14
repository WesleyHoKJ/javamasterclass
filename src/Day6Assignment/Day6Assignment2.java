package Day6Assignment;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Day6Assignment2 extends JFrame {
    private JTextArea textArea;
    private JFileChooser fileChooser;
    private File file;

    public Day6Assignment2() {
        setTitle("Notepad App");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textArea = new JTextArea();
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        add(panel, BorderLayout.SOUTH);

        JButton openButton = new JButton("Open");
        openButton.setBounds(50,100,80,30);    
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(Day6Assignment2.this);
                if (result == JFileChooser.APPROVE_OPTION) {
                    file = fileChooser.getSelectedFile();
                    try {
                        BufferedReader reader = new BufferedReader(new FileReader(file));
                        textArea.read(reader, null);
                        reader.close();
                        setTitle(file.getName() + " - Notepad App");
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(Day6Assignment2.this, "Error reading file", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
        panel.add(openButton);

        JButton saveButton = new JButton("Save");
        saveButton.setBounds(100,100,80,30); 
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (file == null) {
                    fileChooser = new JFileChooser();
                    int result = fileChooser.showSaveDialog(Day6Assignment2.this);
                    if (result == JFileChooser.APPROVE_OPTION) {
                        file = fileChooser.getSelectedFile();
                        saveFile(file);
                    }
                } else {
                    saveFile(file);
                }
            }
        });
        panel.add(saveButton);

        JButton saveAsButton = new JButton("Save As");
        saveAsButton.setBounds(150,100,80,30); 
        saveAsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int returnVal = fileChooser.showSaveDialog(panel);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        FileWriter writer = new FileWriter(file);
                        writer.write(textArea.getText());
                        writer.close();
                        // currentFile = file;
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(panel, "Error saving file.", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

            }

        });
        add(panel);
        setVisible(true);
    }

    public void saveFile(File file) {

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
new Day6Assignment2();
            }
        });
    }
}
