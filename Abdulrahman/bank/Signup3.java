package Abdulrahman.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    String four;
    JCheckBox c1,c2,c3,c4,c5,c6;
    JButton submit ,cancel;
    Signup3(String four){

        setTitle("APPLICATION FORM");
        // logo image
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image img2 = img1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image =new JLabel(img3);
        image.setBounds(80,10,80,80);
        add(image);
        this.four= four;
        //application form
        JLabel label1 = new JLabel("APPLICATION FORM NO :"+four);
        label1.setBounds(230,30,600,30);
        label1.setFont(new Font("Railway",Font.BOLD,30));
        add(label1);
        //for page no and personal detail
        JLabel l1 =new JLabel("Page no 3");
        l1.setFont(new Font("Railway",Font.BOLD,15));
        l1.setBounds(230,60,600,30);
        add(l1);
        // Additional detail of account
        JLabel l2 =new JLabel("Account Details");
        l2.setFont(new Font("Railway",Font.BOLD,15));
        l2.setBounds(350,60,600,30);
        add(l2);
        // for account type
        JLabel l3 =new JLabel("ACCOUNT TYPE :");
        l3.setFont(new Font("Railway",Font.BOLD,15));
        l3.setBounds(230,100,150,25);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setBackground(new Color(32, 232, 157, 221));
        r1.setBounds(400,120,150,25);
        r1.setFont(new Font("Railway",Font.BOLD,15));
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBackground(new Color(32, 232, 157, 221));
        r2.setBounds(600,120,270,25);
        r2.setFont(new Font("Railway",Font.BOLD,15));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBackground(new Color(32, 232, 157, 221));
        r3.setBounds(400,160,150,25);
        r3.setFont(new Font("Railway",Font.BOLD,15));
        add(r3);

        r4 = new JRadioButton("Recurring Deposit  Account");
        r4.setBackground(new Color(32, 232, 157, 221));
        r4.setBounds(600,160,270,25);
        r4.setFont(new Font("Railway",Font.BOLD,15));
        add(r4);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);
        // for card no
        JLabel l4 =new JLabel("Card No :");
        l4.setFont(new Font("Railway",Font.BOLD,15));
        l4.setBounds(230,200,100,25);
        add(l4);
        // for 16 digit card number
        JLabel l5 =new JLabel("(Your 16-digit card number )");
        l5.setFont(new Font("Railway",Font.BOLD,10));
        l5.setBounds(230,220,150,20);
        add(l5);

        JLabel l6 =new JLabel("XXXX-XXXX-XXXX-1234");
        l6.setFont(new Font("Railway",Font.BOLD,15));
        l6.setBounds(400,200,250,25);
        add(l6);

        JLabel l7 =new JLabel("(It would appear on atm card/ cheque Book Statement)");
        l7.setFont(new Font("Railway",Font.BOLD,10));
        l7.setBounds(400,220,350,20);
        add(l7);
// for pin
        JLabel l8 =new JLabel("PIN");
        l8.setFont(new Font("Railway",Font.BOLD,15));
        l8.setBounds(230,260,100,25);
        add(l8);
        JLabel l10=new JLabel("(Your four Digit password)");
        l10.setFont(new Font("Railway",Font.BOLD,10));
        l10.setBounds(230,280,150,20);
        add(l10);

        JLabel l9 =new JLabel("XXXX");
        l9.setFont(new Font("Railway",Font.BOLD,15));
        l9.setBounds(400,260,100,25);
        add(l9);
//for services
        JLabel l11 =new JLabel("SERVICES REQUIRED :");
        l11.setFont(new Font("Railway",Font.BOLD,15));
        l11.setBounds(230,300,200,25);
        add(l11);

        c1 = new JCheckBox(" ATM CARD");
        c1.setBackground(new Color(32, 232, 157, 221));
        c1.setBounds(405,320,150,25);
        c1.setFont(new Font("Railway",Font.BOLD,15));
        add(c1);
        c2 = new JCheckBox(" INTERNET BANKING");
        c2.setBackground(new Color(32, 232, 157, 221));
        c2.setBounds(605,320,190,25);
        c2.setFont(new Font("Railway",Font.BOLD,15));
        add(c2);
        c3 = new JCheckBox("MOBILE BANKING");
        c3.setBackground(new Color(32, 232, 157, 221));
        c3.setBounds(405,360,190,25);
        c3.setFont(new Font("Railway",Font.BOLD,15));
        add(c3);
        c4 = new JCheckBox("EMAIL ALERTS");
        c4.setBackground(new Color(32, 232, 157, 221));
        c4.setBounds(605,360,150,25);
        c4.setFont(new Font("Railway",Font.BOLD,15));
        add(c4);
        c5 = new JCheckBox("CHEQUE BOOK");
        c5.setBackground(new Color(32, 232, 157, 221));
        c5.setBounds(405,400,150,25);
        c5.setFont(new Font("Railway",Font.BOLD,15));
        add(c5);
        c6 = new JCheckBox("E-STATEMENT");
        c6.setBackground(new Color(32, 232, 157, 221));
        c6.setBounds(605,400,150,25);
        c6.setFont(new Font("Railway",Font.BOLD,15));
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declares that the above entered details correct to the best of my knowledge.",true);
        c7.setBackground(new Color(32, 232, 157, 221));
        c7.setBounds(230,440,660,25);
        c7.setFont(new Font("Railway",Font.BOLD,15));
        add(c7);

// for submit button
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setBounds(300,500,100,25);
        submit.setFont(new Font("Railway",Font.BOLD,15));
        submit.addActionListener(this);
        add(submit);

        // for cancel
        cancel = new JButton("CANCEL");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setBounds(500,500,100,25);
        cancel.setFont(new Font("Railway",Font.BOLD,15));
        cancel.addActionListener(this);
        add(cancel);



        getContentPane().setBackground(new Color(32, 232, 157, 221));
        setLayout(null);
        setSize(1980,1020);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String acctype = "";
        if(r1.isSelected()){
            acctype = "Saving Account";
        } else if (r2.isSelected()) {
            acctype ="Fixed Deposit Account";
        } else if (r3.isSelected()) {
            acctype ="Current Account";
        } else if (r4.isSelected()) {
            acctype ="Recurring Deposit  Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) +1234567890000000L;
        String cardno = ""+Math.abs(first7);
        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = ""+Math.abs(first3);

        String ser = "";
        if (c1.isSelected()){
            ser += "ATM CARD";
        } else if (c2.isSelected()) {
            ser += "internet banking";
        } else if (c3.isSelected()) {
            ser += "Mobile banking";
        } else if (c4.isSelected()) {
            ser += "Email Alert";
        } else if (c5.isSelected()) {
            ser += "Cheque Book";
        } else if (c6.isSelected()) {
            ser +="E-statement";
        }

        try {
            if (e.getSource()==submit){
                if (acctype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the Fields");
                }else if (!c1.isSelected()){
                    JOptionPane.showMessageDialog(null,"Fill  filed must");
                }
                else{
                    ConnectionSU con3 = new ConnectionSU();
                    String q1 ="insert into Signupthree values('"+four+"','"+acctype+"','"+cardno+"','"+pin+"','"+ser+"')";
                    String q2 ="insert into Login values('"+four+"','"+cardno+"','"+pin+"')";
                    con3.statement.executeUpdate(q1);
                    con3.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card number :" + cardno+ "\n Pin :"+pin);
                    setVisible(false);
                    new Login();
                }

            }
            else if (e.getSource()==cancel) {
                setVisible(false);
                new Login();
            }


        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
