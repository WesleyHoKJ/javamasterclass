package Day8Assignment;

import java.awt.Component;

import javax.swing.JButton;

import org.junit.Test;

public class FormTest {

    private FormExample form;

    @Before
    public void setUp() {
        form = new FormExample();
    }

    @Test
    public void testActionPerformed() {
        Component[] comp = form.getComponents();
        for (int i = 0;i<comp.length;i++) {
            if (comp[i] instanceof JButton) {
                System.out.println("jButton: "+ i);
            }
        }
        System.out.println(comp.length);
    }

    // @Test
    // public void testInvalidEmail() {
    //     form.setName("John Doe");
    //     form.setEmail("johndoe@example");
    //     form.setAddress("123 Main St");
    //     assertFalse(form.submitForm());
    //     assertEquals("Email address is not valid", form.getEmailError());
    // }

    // @Test
    // public void testValidForm() {
    //     form.setName("John Doe");
    //     form.setEmail("johndoe@example.com");
    //     form.setAddress("123 Main St");
    //     assertTrue(form.submitForm());
    // }

    // @Test
    // public void testPhotoButton() {
    //     form.getPhotoButton().doClick();
    //     assertNotNull(form.getSelectedFile());
    //     assertTrue(form.getSelectedFile().getName().endsWith(".jpg") || form.getSelectedFile().getName().endsWith(".png"));
    // }

    // @Test
    // public void testCancelPhoto() {
    //     form.getPhotoButton().doClick();
    //     form.getFileChooser().cancelSelection();
    //     assertNull(form.getSelectedFile());
    //     assertFalse(form.submitForm());
    //     assertEquals("Photo is required", form.getPhotoError());
    // }

    // @Test
    // public void testNonImageFile() {
    //     form.getPhotoButton().doClick();
    //     form.getFileChooser().setSelectedFile(new File("example.txt"));
    //     assertEquals(JFileChooser.CANCEL_OPTION, form.getFileChooser().showOpenDialog(null));
    //     assertNull(form.getSelectedFile());
    //     assertFalse(form.submitForm());
    //     assertEquals("Photo must be an image file (jpg or png)", form.getPhotoError());
    // }

    // @Test
    // public void testLargeImageFile() {
    //     form.getPhotoButton().doClick();
    //     form.getFileChooser().setSelectedFile(new File("large_image.jpg"));
    //     assertEquals(JFileChooser.CANCEL_OPTION, form.getFileChooser().showOpenDialog(null));
    //     assertNull(form.getSelectedFile());
    //     assertFalse(form.submitForm());
    //     assertEquals("Photo size must be less than 1 MB", form.getPhotoError());
    // }
}

