package Abdulrahman.bank;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
   // for generate random value every time
    Random random =new Random();
    long four4 = (random.nextLong() % 9000L) + 1000L;
    String four = " "+ Math.abs(four4);
    // for user input textfields
    JTextField textname,textfname,textstate,textemail,textaddress,textcity,textpin;
    JDateChooser dateChooser;
    JRadioButton radiomale,radiofemale,m1,m2;
    JButton next;
    Signup(){
        setTitle("APPLICATION FORM ");
        //FOR TOP IMAGE ON FRAME BANK IMAGE
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image img2 = img1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image =new JLabel(img3);
        image.setBounds(80,10,80,80);
        add(image);
//for label of application
        JLabel label1 = new JLabel("APPLICATION FORM NO :"+four);
        label1.setBounds(230,30,600,30);
        label1.setFont(new Font("Ralway",Font.BOLD,30));
        add(label1);
//for page no and personal detail
        JLabel label2 = new JLabel("PAGE NO:1 PERSONAL DETAIL");
        label2.setFont(new Font("Ralway",Font.BOLD,15));
        label2.setBounds(230,70,600,30);
        add(label2);
// for username
        JLabel labelname =new JLabel("NAME:");
        labelname.setBounds(230,100,100,25);
        labelname.setFont(new Font("Ralway",Font.BOLD,15));
        add(labelname);

        textname =new JTextField();
        textname.setBounds(400,100,250,25);
        textname.setFont(new Font("ralway",Font.BOLD,15));
        add(textname);
//for father name
        JLabel labelfname =new JLabel("FATHER NAME:");
        labelfname.setBounds(230,140,250,25);
        labelfname.setFont(new Font("Ralway",Font.BOLD,15));
        add(labelfname);

        textfname =new JTextField();
        textfname.setBounds(400,140,250,25);
        textfname.setFont(new Font("ralway",Font.BOLD,15));
        add(textfname);
// for user date of birth
        JLabel dob =new JLabel("DATE OF BIRTH:");
        dob.setBounds(230,180,250,25);
        dob.setFont(new Font("Ralway",Font.BOLD,15));
        add(dob);

        dateChooser =new JDateChooser();
        dateChooser.setBounds(400,180,250,25);
        dateChooser.setFont(new Font("",Font.BOLD,15));
        add(dateChooser);
// for gender
        JLabel gender =new JLabel("GENDER:");
        gender.setBounds(230,220,250,25);
        gender.setFont(new Font("Ralway",Font.BOLD,15));
        add(gender);

        radiomale =new JRadioButton("MALE");
        radiofemale = new JRadioButton("FEMALE");
        radiomale.setBounds(400,220,100,25);
        radiomale.setFont(new Font("",Font.BOLD,15));
        radiomale.setBackground(new Color(32, 232, 157, 221));
        radiofemale.setBackground(new Color(32, 232, 157, 221));
        radiofemale.setBounds(550,220,100,25);
        radiofemale.setFont(new Font("",Font.BOLD,15));
        add(radiofemale);
        add(radiomale);
        ButtonGroup bg =new ButtonGroup();
        bg.add(radiomale);
        bg.add(radiofemale);
        //for email address
        JLabel labelemail =new JLabel("EMAIL:");
        labelemail.setBounds(230,260,250,25);
        labelemail.setFont(new Font("Ralway",Font.BOLD,15));
        add(labelemail);

        textemail =new JTextField();
        textemail.setBounds(400,260,250,25);
        textemail.setFont(new Font("",Font.BOLD,15));
        add(textemail);
        // for married status
        JLabel labelms=new JLabel("MARITAL STATUS:");
        labelms.setBounds(230,300,250,25);
        labelms.setFont(new Font("Ralway",Font.BOLD,15));
        add(labelms);

        m1 =new JRadioButton("MARRIED");
        m2 = new JRadioButton("UNMARRIED");
        m1.setBounds(400,300,100,25);
        m1.setFont(new Font("",Font.BOLD,15));
        m1.setBackground(new Color(32, 232, 157, 221));
        m2.setBackground(new Color(32, 232, 157, 221));
        m2.setBounds(550,300,150,25);
        m2.setFont(new Font("",Font.BOLD,15));
        add(m2);
        add(m1);
        ButtonGroup bg1 =new ButtonGroup();
        bg1.add(m1);
        bg1.add(m2);
        //for address of home

        JLabel labeladd =new JLabel("ADDRESS:");
        labeladd.setBounds(230,340,250,25);
        labeladd.setFont(new Font("Ralway",Font.BOLD,15));
        add(labeladd);

        textaddress =new JTextField();
        textaddress.setBounds(400,340,250,25);
        textaddress.setFont(new Font("",Font.BOLD,15));
        add(textaddress);
// for city

        JLabel labelcity =new JLabel("CITY:");
        labelcity.setBounds(230,380,250,25);
        labelcity.setFont(new Font("Ralway",Font.BOLD,15));
        add(labelcity);

        textcity =new JTextField();
        textcity.setBounds(400,380,250,25);
        textcity.setFont(new Font("",Font.BOLD,15));
        add(textcity);
//for pincode

        JLabel labelpin =new JLabel("PIN CODE:");
        labelpin.setBounds(230,420,250,25);
        labelpin.setFont(new Font("Ralway",Font.BOLD,15));
        add(labelpin);

        textpin =new JTextField();
        textpin.setBounds(400,420,250,25);
        textpin.setFont(new Font("",Font.BOLD,15));
        add(textpin);
        // for state

        JLabel labelstate =new JLabel("STATE:");
        labelstate.setBounds(230,460,250,25);
        labelstate.setFont(new Font("Ralway",Font.BOLD,15));
        add(labelstate);

        textstate =new JTextField();
        textstate .setBounds(400,460,250,25);
        textstate .setFont(new Font("",Font.BOLD,15));
        add(textstate );
       // for next page
        next =new JButton("NEXT");
        next.setFont(new Font("",Font.BOLD,15));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setBounds(550,530,100,25);
        next.addActionListener(this);
        add(next);



        // for background color
        getContentPane().setBackground(new Color(32, 232, 157, 221));
        setSize(1980,1020);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = four;
        String name = textname.getText();
        String fathername =textfname.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (radiomale.isSelected()){
            gender = "Male";
        } else if (radiofemale.isSelected()) {
            gender ="female";
        }
        String email =textemail.getText();
        String marital = null;
        if(m1.isSelected()){
            marital ="married";
        } else if (m2.isSelected()) {
            gender ="unmarried";
        }
        String address = textaddress.getText();
        String city = textcity.getText();
        String pincode =textpin.getText();
        String state = textstate.getText();
        try {
            if(name.matches(".*\\d.*") || name.contains(" ") || name.equals("")){
                JOptionPane.showMessageDialog(null,"Please fill correct name not include space and digit");
            }else if(fathername.matches(".*\\d.*") || fathername.contains(" ") || fathername.equals("")){
                JOptionPane.showMessageDialog(null,"Please fill correct Fahter name not include space and digit");
            } else if (dob.equals("")) {
                JOptionPane.showMessageDialog(null,"Fill date of birth must");
            } else if(!email.matches("^[\\w.-]+@gmail\\.com$") || email.isEmpty() || email.contains(" ")){
                JOptionPane.showMessageDialog(null,"Please enter correct email not contain space");
            }else if (address.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill address must");
            }else if (city.isEmpty()) {
                JOptionPane.showMessageDialog(null,"Fill city must");
            }else if(pincode.matches(".*[a-zA-Z].*") || pincode.contains(" ") || pincode.isEmpty()){
                JOptionPane.showMessageDialog(null,"Pin code cannot contain letter");
            }
            else {
                ConnectionSU con1 = new ConnectionSU();
                String q = "insert into signup values('"+formno+"','"+name+"','"+fathername+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(four);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}
