import javax.swing.*;
import java.awt.*;

public class About extends JFrame {

    About() {
        setSize(700, 500);
        setLocation(400, 150);
        getContentPane().setBackground(Color.WHITE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/DESPU1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 0, 300, 200);
        add(image);

        JLabel heading = new JLabel("<html>DES Pune<br/>University</html>");
        heading.setBounds(70, 20, 300, 130);
        heading.setFont(new Font("Tahoma", Font.BOLD, 40));
        add(heading);

        JLabel name = new JLabel("Address :Mukunddas Lohia Academic Complex, Agharkar Road, Shivajinagr,Pune");
        name.setBounds(70, 220, 600, 40);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(name);

        JLabel tel = new JLabel("Tel :020 47200000");
        tel.setBounds(70, 280, 550, 40);
        tel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(tel);

        JLabel contact = new JLabel("Contact: admissions@despu.edu.in");
        contact.setBounds(70, 340, 550, 40);
        contact.setFont(new Font("Tahoma", Font.PLAIN, 20));
        add(contact);

        setLayout(null);

        setVisible(true);
    }

    public static void main(String[] args) {

        new About();
    }
}