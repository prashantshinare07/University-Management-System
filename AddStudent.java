import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class AddStudent extends JFrame implements ActionListener{

    JTextField tf_name, tf_f_name, tf_address, tf_phone, tf_email, tfx, tf_xii, tf_aadhar;
    JLabel label_roll_no;
    JDateChooser dc_dob;
    JComboBox cb_course, cb_branch;
    JButton submit, cancel;

    Random ran = new Random();
    long first4 = Math.abs((ran.nextLong() % 9000L) + 1000L);

    AddStudent() {

        setSize(900, 700);
        setLocation(350, 50);

        setLayout(null);

        JLabel heading = new JLabel("New Student Details");
        heading.setBounds(310, 30, 500, 50);
        heading.setFont(new Font("serif", Font.BOLD, 30));
        add(heading);

        JLabel lbl_name = new JLabel("Name");
        lbl_name.setBounds(50, 150, 100, 30);
        lbl_name.setFont(new Font("serif", Font.BOLD, 20));
        add(lbl_name);

        tf_name = new JTextField();
        tf_name.setBounds(200, 150, 150, 30);
        add(tf_name);

        JLabel lbl_f_name = new JLabel("Father's Name");
        lbl_f_name.setBounds(400, 150, 200, 30);
        lbl_f_name.setFont(new Font("serif", Font.BOLD, 20));
        add(lbl_f_name);

        tf_f_name = new JTextField();
        tf_f_name.setBounds(600, 150, 150, 30);
        add(tf_f_name);

        JLabel lbl_roll_no = new JLabel("Roll Number");
        lbl_roll_no.setBounds(50, 200, 200, 30);
        lbl_roll_no.setFont(new Font("serif", Font.BOLD, 20));
        add(lbl_roll_no);

        label_roll_no = new JLabel("1533"+first4);
        label_roll_no.setBounds(200, 200, 200, 30);
        label_roll_no.setFont(new Font("serif", Font.BOLD, 20));
        add(label_roll_no);

        JLabel lbl_dob = new JLabel("Date of Birth");
        lbl_dob.setBounds(400, 200, 200, 30);
        lbl_dob.setFont(new Font("serif", Font.BOLD, 20));
        add(lbl_dob);

        dc_dob = new JDateChooser();
        dc_dob.setBounds(600, 200, 150, 30);
        add(dc_dob);

        JLabel lbl_address = new JLabel("Address");
        lbl_address.setBounds(50, 250, 200, 30);
        lbl_address.setFont(new Font("serif", Font.BOLD, 20));
        add(lbl_address);

        tf_address = new JTextField();
        tf_address.setBounds(200, 250, 150, 30);
        add(tf_address);

        JLabel lbl_phone = new JLabel("Phone");
        lbl_phone.setBounds(400, 250, 200, 30);
        lbl_phone.setFont(new Font("serif", Font.BOLD, 20));
        add(lbl_phone);

        tf_phone = new JTextField();
        tf_phone.setBounds(600, 250, 150, 30);
        add(tf_phone);

        JLabel lbl_email = new JLabel("Email Id");
        lbl_email.setBounds(50, 300, 200, 30);
        lbl_email.setFont(new Font("serif", Font.BOLD, 20));
        add(lbl_email);

        tf_email = new JTextField();
        tf_email.setBounds(200, 300, 150, 30);
        add(tf_email);

        JLabel lbl_x = new JLabel("Class X (%)");
        lbl_x.setBounds(400, 300, 200, 30);
        lbl_x.setFont(new Font("serif", Font.BOLD, 20));
        add(lbl_x);

        tfx = new JTextField();
        tfx.setBounds(600, 300, 150, 30);
        add(tfx);

        JLabel lbl_xii = new JLabel("Class XII (%)");
        lbl_xii.setBounds(50, 350, 200, 30);
        lbl_xii.setFont(new Font("serif", Font.BOLD, 20));
        add(lbl_xii);

        tf_xii = new JTextField();
        tf_xii.setBounds(200, 350, 150, 30);
        add(tf_xii);

        JLabel lbl_aadhar = new JLabel("Aadhar Number");
        lbl_aadhar.setBounds(400, 350, 200, 30);
        lbl_aadhar.setFont(new Font("serif", Font.BOLD, 20));
        add(lbl_aadhar);

        tf_aadhar = new JTextField();
        tf_aadhar.setBounds(600, 350, 150, 30);
        add(tf_aadhar);

        JLabel lbl_course = new JLabel("Course");
        lbl_course.setBounds(50, 400, 200, 30);
        lbl_course.setFont(new Font("serif", Font.BOLD, 20));
        add(lbl_course);

        String course[] = {"--Select--","B.Tech", "BBA", "BCA", "Bsc", "Msc", "MBA", "MCA", "MCom", "MA", "BA"};
        cb_course = new JComboBox(course);
        cb_course.setBounds(200, 400, 150, 30);
        cb_course.setBackground(Color.WHITE);
        add(cb_course);

        JLabel lbl_branch = new JLabel("Branch");
        lbl_branch.setBounds(400, 400, 200, 30);
        lbl_branch.setFont(new Font("serif", Font.BOLD, 20));
        add(lbl_branch);

        String branch[] = {"--Select--","Computer Science", "Electronics", "Mechanical", "Civil", "IT"};
        cb_branch = new JComboBox(branch);
        cb_branch.setBounds(600, 400, 150, 30);
        cb_branch.setBackground(Color.WHITE);
        add(cb_branch);

        submit = new JButton("Submit");
        submit.setBounds(250, 550, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBounds(450, 550, 120, 30);
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        cancel.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(cancel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String name = tf_name.getText();
            String fname = tf_f_name.getText();
            String rollno = label_roll_no.getText();
            String dob = ((JTextField) dc_dob.getDateEditor().getUiComponent()).getText();
            String address = tf_address.getText();
            String phone = tf_phone.getText();
            String email = tf_email.getText();
            String x = tfx.getText();
            String xii = tf_xii.getText();
            String aadhar = tf_aadhar.getText();
            String course = (String) cb_course.getSelectedItem();
            String branch = (String) cb_branch.getSelectedItem();

            try {
                String query = "insert into student values('"+name+"', '"+fname+"', '"+rollno+"', '"+dob+"', '"+address+"', '"+phone+"', '"+email+"', '"+x+"', '"+xii+"', '"+aadhar+"', '"+course+"', '"+branch+"')";

                Conn con = new Conn();
                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Student Details Inserted Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new AddStudent();
    }
}