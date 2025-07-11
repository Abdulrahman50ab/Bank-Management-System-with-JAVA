package Abdulrahman.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class transaction extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    transaction(String pin){
        this.pin= pin;
        // for background image
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image img2 = img1.getImage().getScaledInstance(1300,650,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image =new JLabel(img3);
        image.setBounds(0,0,1300,650);
        add(image);

        JLabel label = new JLabel("Please Select your Transaction");
        label.setFont(new Font("System",Font.BOLD,20));
        label.setForeground(Color.white);
        label.setBounds(380,170,400,35);
        image.add(label);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(344,236,150,28);
        b1.setFont(new Font("System",Font.BOLD,13));
        b1.setBackground(new Color(0xBE643793));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        image.add(b1);

        b2 = new JButton("CASH WITHDRAW");
        b2.setBounds(544,236,150,28);
        b2.setFont(new Font("System",Font.BOLD,13));
        b2.setBackground(new Color(0xBE643793));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        image.add(b2);

        b3 = new JButton("FAST CASH");
        b3.setBounds(344,273,150,28);
        b3.setFont(new Font("System",Font.BOLD,13));
        b3.setBackground(new Color(0xBE643793));
        b3.setForeground(Color.white);
        b3.addActionListener(this);
        image.add(b3);

        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(544,273,150,28);
        b4.setFont(new Font("System",Font.BOLD,13));
        b4.setBackground(new Color(0xBE643793));
        b4.setForeground(Color.white);
        b4.addActionListener(this);
        image.add(b4);

        b5 = new JButton("PIN CHANGE");
        b5.setBounds(344,308,150,28);
        b5.setFont(new Font("System",Font.BOLD,13));
        b5.setBackground(new Color(0xBE643793));
        b5.setForeground(Color.white);
        b5.addActionListener(this);
        image.add(b5);

        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(544,308,150,28);
        b6.setFont(new Font("System",Font.BOLD,13));
        b6.setBackground(new Color(0xBE643793));
        b6.setForeground(Color.white);
        b6.addActionListener(this);
        image.add(b6);

        b7 = new JButton("EXIST");
        b7.setBounds(344,344,150,28);
        b7.setFont(new Font("System",Font.BOLD,13));
        b7.setBackground(new Color(0xBE643793));
        b7.setForeground(Color.white);
        b7.addActionListener(this);
        image.add(b7);



        setSize(1980,1020);
        setLocation(0,0);
        setVisible(true);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new Deposit(pin);
            setVisible(false);
        } else if (e.getSource()==b7) {
            setVisible(false);
            new Login();
        } else if (e.getSource()==b2){
            setVisible(false);
            new withdrawl(pin);
        } else if (e.getSource()==b6) {
            new balanceEnquriy(pin);
            setVisible(false);
        }else if (e.getSource()==b3){
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==b5) {
            new ChangePin(pin);
            setVisible(false);
        } else if (e.getSource()==b4) {
            new Ministatement(pin);
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new transaction("");
    }
}
