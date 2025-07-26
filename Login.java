import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.lang.NullPointerException;
public class Login extends JFrame implements ActionListener
{
    JButton b,b1;
    JTextField jt,jp;
    Login()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l=new JLabel("UserName");
        l.setBounds(40,20,100,20);
        add(l);

         jt=new JTextField();
        jt.setBounds(150,20,150,20);
        add(jt);

        JLabel lp=new JLabel("Password");
        lp.setBounds(40,70,100,20);
        add(lp);

         jp=new JPasswordField();
        jp.setBounds(150,70,150,20);
        add(jp);

        b=new JButton("Login");
        b.setBounds(40,140,120,30);
        b.setForeground(Color.WHITE);
        b.setBackground(Color.BLACK);
        b.addActionListener(this);
        b.setFont(new Font("Tahoma",Font.BOLD,16));
        add(b);

        b1=new JButton("Cancel");
        b1.setBounds(180,140,120,30);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setFont(new Font("Tahoma",Font.BOLD,16));
        add(b1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/second.jpg"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 20, 150, 150);
        add(image);

        setSize(600,300);
        setLocation(500,250);
        setVisible(true);
    }
    public static void main(String [] args)
    {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == b) {
            String username = jt.getText();
            String password = jp.getText();

            String query = "select * from login where username ='" + username + "'and password ='" + password + "'";

            try {
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next())
                {
                    setVisible(false);
                    new Project();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password ");
                    setVisible(false);
                }
            } catch (Exception ae) {
                ae.printStackTrace();
            }
        }else if (e.getSource() == b1)
        {
            setVisible(false);
        }
    }
}
