import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {
    Thread t;
    JLabel imageLabel;

    Splash() {
        // Load image but don't scale it yet
        ImageIcon original = new ImageIcon(ClassLoader.getSystemResource("icons/des1.jpeg"));
        Image rawImage = original.getImage();

        // Create JLabel but don't set size yet
        imageLabel = new JLabel(new ImageIcon(rawImage));
        add(imageLabel);

        setUndecorated(true); // No title bar
        setVisible(true);

       
        // Now go fullscreen and scale image to fit screen
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;

        Image scaled = rawImage.getScaledInstance(screenWidth, screenHeight, Image.SCALE_SMOOTH);
        imageLabel.setIcon(new ImageIcon(scaled));
        imageLabel.setSize(screenWidth, screenHeight);

        setSize(screenWidth, screenHeight);
        setLocation(0, 0);

        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
            Thread.sleep(4000); // Hold splash
            setVisible(false);
            new Login(); // Move to next frame
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}
