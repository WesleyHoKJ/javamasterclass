package Day6Assignment;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Day6Assignment1 {
    private static void createAndShowGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("Hello World Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add a label to the content pane.
        JLabel label = new JLabel("Hello World!");
        frame.getContentPane().add(label);

        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}

   