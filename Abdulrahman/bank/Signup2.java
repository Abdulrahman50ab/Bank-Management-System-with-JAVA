package Abdulrahman.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    String four;
    JRadioButton r1,r2,r3,r4;
    JTextField textcnic;
    JComboBox religion, category,income,education,occupation;
    JButton next;
    Signup2(String four){
        setTitle("APPLICATION FORM");

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image img2 = img1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image =new JLabel(img3);
        image.setBounds(80,10,80,80);
        add(image);
        // form no of random
        this.four = four;

        //application form
        JLabel label1 = new JLabel("APPLICATION FORM NO :"+four);
        label1.setBounds(230,30,600,30);
        label1.setFont(new Font("Railway",Font.BOLD,30));
        add(label1);

        //for page no and personal detail
        JLabel l1 =new JLabel("Page no 2");
        l1.setFont(new Font("Railway",Font.BOLD,15));
        l1.setBounds(230,60,600,30);
        add(l1);
        // Additional detail of user
        JLabel l2 =new JLabel("Additional Details");
        l2.setFont(new Font("Railway",Font.BOLD,15));
        l2.setBounds(350,60,600,30);
        add(l2);
        // for religion status
        JLabel l3 =new JLabel("RELIGION :");
        l3.setFont(new Font("Railway",Font.BOLD,15));
        l3.setBounds(230,100,100,25);
        add(l3);

        String rel[] = {"Islam","Hindu","Sikh","Christian","Other"};
        religion = new JComboBox(rel);
        religion.setBounds(400,100,250,25);
        religion.setFont(new Font("Railway",Font.BOLD,15));
        religion.setBackground(Color.white);
        add(religion);
// Category
        JLabel l4 =new JLabel("CATEGORY :");
        l4.setFont(new Font("Railway",Font.BOLD,15));
        l4.setBounds(230,150,100,25);
        add(l4);

        String cate[] = {"General","OBC","SC","ST","Other"};
        category= new JComboBox(cate);
        category.setBounds(400,150,250,25);
        category.setFont(new Font("Railway",Font.BOLD,15));
        category.setBackground(Color.white);
        add(category);
        // INCOME OF USER
        JLabel l5 =new JLabel("INCOME:");
        l5.setFont(new Font("Railway",Font.BOLD,15));
        l5.setBounds(230,200,100,25);
        add(l5);

        String inco[] = {"null","<50,000 ","1,00,000","5,00,000","10,00,000","Above 10,00,000"};
         income= new JComboBox(inco);
        income.setBounds(400,200,250,25);
        income.setFont(new Font("Railway",Font.BOLD,15));
        income.setBackground(Color.white);
        add(income);
        // for education status
        JLabel l6 =new JLabel("EDUCATIONAL :");
        l6.setFont(new Font("Railway",Font.BOLD,15));
        l6.setBounds(230,250,150,25);
        add(l6);

        String edu[] = {"Non Graduate","Graduate ","Post Graduate","Doctorate","Other"};
       education= new JComboBox(edu);
        education.setBounds(400,250,250,25);
        education.setFont(new Font("ralway",Font.BOLD,15));
        education.setBackground(Color.white);
        add(education);

        //for occupation
        JLabel l7 =new JLabel("OCCUPATION :");
        l7.setFont(new Font("Railway",Font.BOLD,15));
        l7.setBounds(230,300,150,25);
        add(l7);

        String occ[] = {"Salaried","Self-Employed","Business","Student","Retired","Other"};
        occupation= new JComboBox(occ);
        occupation.setBounds(400,300,250,25);
        occupation.setFont(new Font("Railway",Font.BOLD,15));
        occupation.setBackground(Color.white);
        add(occupation);
        // Cnic no
        JLabel l8 =new JLabel("CNIC NO:");
        l8.setFont(new Font("Railway",Font.BOLD,15));
        l8.setBounds(230,350,150,25);
        add(l8);

        textcnic = new JTextField();
        textcnic.setBounds(400,350,250,25);
        textcnic.setFont(new Font("Railway",Font.BOLD,15));
        add(textcnic);

        //Citizen
        JLabel l9 =new JLabel("SENIOR CITIZEN :");
        l9.setFont(new Font("Railway",Font.BOLD,15));
        l9.setBounds(230,400,150,25);
        add(l9);

        r1 = new JRadioButton("YES");
        r1.setBackground(new Color(32, 232, 157, 221));
        r1.setBounds(400,400,100,25);
        r1.setFont(new Font("Railway",Font.BOLD,15));
        add(r1);
        r2 = new JRadioButton("NO");
        r2.setBackground(new Color(32, 232, 157, 221));
        r2.setBounds(600,400,100,25);
        r2.setFont(new Font("Railway",Font.BOLD,15));
        add(r2);
        ButtonGroup bg =new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        //existence account
        JLabel l10 =new JLabel("EXISTENCE ACCOUNT:");
        l10.setFont(new Font("Railway",Font.BOLD,15));
        l10.setBounds(230,450,150,25);
        add(l10);

        r3 = new JRadioButton("YES");
        r3.setBackground(new Color(32, 232, 157, 221));
        r3.setBounds(400,450,100,25);
        r3.setFont(new Font("Railway",Font.BOLD,15));
        add(r3);
        r4 = new JRadioButton("NO");
        r4.setBackground(new Color(32, 232, 157, 221));
        r4.setBounds(600,450,100,25);
        r4.setFont(new Font("Railway",Font.BOLD,15));
        add(r4);
        ButtonGroup bg1 =new ButtonGroup();
        bg1.add(r3);
        bg1.add(r4);
// for next button
        next =new JButton("NEXT");
        next.setFont(new Font("Railway",Font.BOLD,15));
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.addActionListener(this);
        next.setBounds(550,530,100,25);
        add(next);



        setLayout(null);
        setSize(1980,1020);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(32, 232, 157, 221));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) religion.getSelectedItem();
        String cate = (String) category.getSelectedItem();
        String inco = (String) income.getSelectedItem();
        String edu = (String) education.getSelectedItem();
        String occ  = (String) occupation.getSelectedItem();
        String cnic = textcnic.getText();

        String citizen = null;
        if (r1.isSelected()){
            citizen = "yes";
        }
        else if (r2.isSelected()){
            citizen = "No";
        }

        String existacc= null;
        if (r3.isSelected()){
            existacc = "yes";
        }
        else if (r4.isSelected()){
            existacc= "No";
        }
        try {
            if (cnic.isEmpty() || !cnic.matches("\\d{13}") || cnic.contains(" ")){
                JOptionPane.showMessageDialog(null,"Incorrect CNIC. It must be exactly 13 digits long.");
            }
            else {
               ConnectionSU con2 = new ConnectionSU();
               String q ="insert into Signuptwo values('"+four+"','"+rel+"','"+cate+"','"+inco+"','"+edu+"','"+occ+"','"+cnic+"','"+citizen+"','"+existacc+"')";
               con2.statement.executeUpdate(q);
               new Signup3(four);
               setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }




    }

    public static void main(String[] args) {
        new Signup2("");

    }
}
