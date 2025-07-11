package Abdulrahman.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener {
    JButton b1,b2;
    JPasswordField p1,p2;
    String pin;
    ChangePin(String pin){
        this.pin= pin;

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image img2 = img1.getImage().getScaledInstance(1300,650,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image =new JLabel(img3);
        image.setBounds(0,0,1300,650);
        add(image);

        JLabel l1 = new JLabel("CHANGE  YOUR PIN");
        l1.setFont(new Font("System",Font.BOLD,15));
        l1.setForeground(Color.white);
        l1.setBounds(330,130,400,35);
        image.add(l1);

        JLabel l2 = new JLabel("NEW PIN:");
        l2.setFont(new Font("System",Font.BOLD,15));
        l2.setForeground(Color.white);
        l2.setBounds(330,170,100,35);
        image.add(l2);

        p1= new JPasswordField();
        p1.setBackground(new Color(0x17045E));
        p1.setForeground(Color.white);
        p1.setBounds(480,170,200,30);
        p1.setFont(new Font("System",Font.BOLD,20));
        image.add(p1);

        JLabel l3 = new JLabel("RE-ENTER PIN");
        l3.setFont(new Font("System",Font.BOLD,15));
        l3.setForeground(Color.white);
        l3.setBounds(330,210,150,35);
        image.add(l3);

        p2= new JPasswordField();
        p2.setBackground(new Color(0x17045E));
        p2.setForeground(Color.white);
        p2.setBounds(480,210,200,30);
        p2.setFont(new Font("System",Font.BOLD,20));
        image.add(p2);


        b1 = new JButton("CHANGE");
        b1.setBounds(550,280,150,30);
        b1.setBackground(new Color(0x17045E));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        image.add(b1);
//for back button
        b2 = new JButton("BACK");
        b2.setBounds(550,320,150,30);
        b2.setBackground(new Color(0x17045E));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        image.add(b2);






        setSize(1980,1020);
        setLocation(0,0);
        setVisible(true);
        setLayout(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String pin1 = p1.getText();
            String pin2 = p2.getText();
            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered pin does not match");
                return;
            }

            if(e.getSource()==b1){
                if(pin1.equals("") || pin1.contains(" ") ||!pin1.matches("\\d{4}")){
                    JOptionPane.showMessageDialog(null,"Enter new pin and not include space and only 4 digit");
                    return;
                }else if (pin2.equals("") || pin2.contains(" ") ||!pin2.matches("\\d{4}")) {
                    JOptionPane.showMessageDialog(null,"Enter new pin and not include space and only 4 digit ");
                    return;
                }
                ConnectionSU c = new ConnectionSU();
                String q1 = "update banktime set pin ='"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update Login set pin ='"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update Signupthree set pin ='"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"pin change successfully");
                setVisible(false);
                new transaction(pin);
            } else if (e.getSource()==b2) {
                new transaction(pin);
                setVisible(false);

            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new ChangePin("");
    }
}
