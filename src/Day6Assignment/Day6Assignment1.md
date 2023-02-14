# Day 6 - Assignment 1

    import javax.swing.*;

    public class HelloWorldSwing {
        private static void createAndShowGUI() {
            // Create and set up the window.
            JFrame frame = new JFrame("HelloWorldSwing");
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

Finally, the pack method is called to size the window to fit its contents, and the setVisible method is used to display the window on the screen.  

This example demonstrates the basic structure of a Java Swing application and shows how to create a window, add components to it, and display it on the screen. You can use this as a starting point to build more complex Swing applications.  
