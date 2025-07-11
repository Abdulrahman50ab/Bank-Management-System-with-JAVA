package Abdulrahman.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balanceEnquriy extends JFrame implements ActionListener {
    JLabel l1,l2;
    String pin;
    JButton b2;
    balanceEnquriy(String pin){
        this.pin=pin;
        // for background image
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image img2 = img1.getImage().getScaledInstance(1300,650,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image =new JLabel(img3);
        image.setBounds(0,0,1300,650);
        add(image);

        l1 = new JLabel("YOUR CURRENT BALANCE IS RS");
        l1.setFont(new Font("System",Font.BOLD,15));
        l1.setForeground(Color.white);
        l1.setBounds(380,130,400,35);
        image.add(l1);

         l2 = new JLabel();
        l2.setFont(new Font("System",Font.BOLD,15));
        l2.setForeground(Color.white);
        l2.setBounds(380,150,400,35);
        image.add(l2);


        b2 = new JButton("BACK");
        b2.setBounds(550,320,150,30);
        b2.setBackground(new Color(0x17045E));
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        image.add(b2);

        int balance = 0;
        try {
            ConnectionSU c = new ConnectionSU();
            ResultSet resultSet = c.statement.executeQuery("select * from banktime where pin ='"+pin+"' ");
            while (resultSet.next()){  if(resultSet.getString("type").equals("Deposit")){
                balance += Integer.parseInt(resultSet.getString("amount"));
            }else{
                balance -= Integer.parseInt(resultSet.getString("amount"));
            }
            }

        }catch (Exception E){
            E.printStackTrace();
        }
        l2.setText(""+balance);

        setLayout(null);
        setTitle("Deposit");
        setSize(1980,1020);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
setVisible(false);
new transaction(pin);
    }

    public static void main(String[] args) {
        new balanceEnquriy("");
    }
}
