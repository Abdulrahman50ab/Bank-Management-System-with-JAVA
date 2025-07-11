package Abdulrahman.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
   JLabel label1,label2,label3;
   JTextField textField1;
   JPasswordField passwordField2;
   JButton signin,signup,clear;

    Login(){
        super("ABDULRAHMAN-ATM");
        //FOR TOP IMAGE ON FRAME BANK IMAGE
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/logo3.png"));
        Image img2 = img1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image =new JLabel(img3);
        image.setBounds(250,20,100,100);
        add(image);
//FOR FOOTER IMAGE ON FRAME
        ImageIcon img11 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image img22 = img11.getImage().getScaledInstance(150,150,Image.SCALE_DEFAULT);
        ImageIcon img33 = new ImageIcon(img22);
        JLabel image1 =new JLabel(img33);
        image1.setBounds(1030,490,150,150);
        add(image1);
        // FOR CARD AND PIN LABELS
        label1 = new JLabel("WELCOME TO AB-ATM");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGarde",Font.BOLD,28));
        label1.setBounds(400,50,650,40);
        add(label1);
// for card no  label
        label2 =new JLabel("CARD NO :");
        label2.setForeground(Color.white);
        label2.setFont(new Font("Ralway",Font.BOLD,20));
        label2.setBounds(100,200,300,30);
        add(label2);
        //for card textfield
        textField1 =new JTextField();
        textField1.setFont(new Font("Ralway",Font.ITALIC,20));
        textField1.setBounds(250,200,300,30);
        add(textField1);
        // for pin label
        label3 =new JLabel("PIN :");
        label3.setForeground(Color.white);
        label3.setFont(new Font("Ralway",Font.BOLD,20));
        label3.setBounds(100,260,300,30);
        add(label3);
        // for pin password field
        passwordField2 = new JPasswordField();
        passwordField2.setFont(new Font("Ralway",Font.ITALIC,20));
        passwordField2.setBounds(250,260,300,30);
        add(passwordField2);
// for signin button
        signin =new JButton("SIGN IN");
        signin.setFont(new Font("Ralway",Font.BOLD,15));
        signin.setForeground(Color.white);
        signin.setBackground(Color.black);
        signin.addActionListener(this);
        signin.setBounds(250,320,100,30);
        add(signin);
// for clear button
        clear =new JButton("CLEAR");
        clear.setFont(new Font("Ralway",Font.BOLD,15));
        clear.setForeground(Color.white);
        clear.setBackground(Color.black);
        clear.addActionListener(this);
        clear.setBounds(450,320,100,30);
        add(clear);
        //for signup button
        signup= new JButton("SIGN UP");
        signup.setFont(new Font("Ralway",Font.BOLD,15));
        signup.setForeground(Color.white);
        signup.setBackground(Color.black);
        signup.addActionListener(this);
        signup.setBounds(250,380,300,30);
        add(signup);


// FOR BACKGROUND IMAGE
        ImageIcon img111 = new ImageIcon(ClassLoader.getSystemResource("icon/bg2.jpg"));
        Image img222 = img111.getImage().getScaledInstance(1920,1080,Image.SCALE_DEFAULT);
        ImageIcon img333 = new ImageIcon(img222);
        JLabel image11 =new JLabel(img333);
        image11.setBounds(0,0,1920,1080);
        add(image11);


// for frame visibility
        setLayout(null);
        setSize(1980,1020);
        setVisible(true);
        setLocation(250,100);
        setLocationRelativeTo(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
        if(e.getSource()== signin){
            ConnectionSU c = new ConnectionSU();
            String cardno = textField1.getText();
            String pin = passwordField2.getText();
            String q = "select * from Login where cardnumber = '"+cardno+"' and pin = '"+pin+"'";
            ResultSet resultSet = c.statement.executeQuery(q);
            if(resultSet.next()){
                setVisible(false);
                new transaction(pin);
            }else{
                JOptionPane.showMessageDialog(null,"Incorrect Card number or Pin");
            }
    }
        else if(e.getSource() == signup){
            new Signup();
            setVisible(false);
        }
        else if (e.getSource()== clear) {
            textField1.setText("");
            passwordField2.setText("");
        }}catch (Exception E){
            E.printStackTrace();
        }
    }
    public static void main(String[] args) {
     new Login();
    }
}
