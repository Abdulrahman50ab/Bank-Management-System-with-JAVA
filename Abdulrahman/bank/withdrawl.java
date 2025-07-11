package Abdulrahman.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class withdrawl extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1,b2;
    withdrawl(String pin){
        this.pin = pin;
        // for background image
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image img2 = img1.getImage().getScaledInstance(1300,650,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image =new JLabel(img3);
        image.setBounds(0,0,1300,650);
        add(image);


        JLabel l1 = new JLabel("Enter the Amount do you want withdraw");
        l1.setFont(new Font("System",Font.BOLD,15));
        l1.setForeground(Color.white);
        l1.setBounds(380,130,400,35);
        image.add(l1);

        JLabel l2 = new JLabel("Please Enter Your Amount");
        l2.setFont(new Font("System",Font.BOLD,15));
        l2.setForeground(Color.white);
        l2.setBounds(380,150,400,35);
        image.add(l2);

        textField = new TextField();
        textField.setBackground(new Color(0x17045E));
        textField.setForeground(Color.white);
        textField.setBounds(380,180,310,35);
        textField.setFont(new Font("System",Font.BOLD,20));
        image.add(textField);
//for deposit button
        b1 = new JButton("WITHDRAW");
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




        setLayout(null);
        setTitle("Deposit");
        setSize(1980,1020);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
        try{
            String amount = textField.getText();
            Date date = new Date();
            if (textField.getText().equals("")){
                JOptionPane.showMessageDialog(null,"PLEASE ENTER THE AMOUNT YOU WANT WITHDRAWAL");
            } else if (amount.matches(".*[a-zA-Z].*") || amount.contains(" ")) {
                JOptionPane.showMessageDialog(null,"please enter amount correct not include letter and space");
            }
            else{
                ConnectionSU c = new ConnectionSU();
                ResultSet resultSet = c.statement.executeQuery("select * from banktime where pin ='"+pin+"'");
                int balance = 0;
                while(resultSet.next()){
                    if(resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }
                if(balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"INSUFFICIENT BALANCE");
                    return;
                }
                c.statement.executeUpdate("insert into banktime values('"+pin+"','"+date+"','Withdrawl','"+amount+"')");
                JOptionPane.showMessageDialog(null,"RS. "+amount+" DIBTED SUCCESFULLY");
                setVisible(false);
                new transaction(pin);
            }


        }catch (Exception E){
            E.printStackTrace();
        }
        }else if(e.getSource()== b2){
            setVisible(false);
            new transaction(pin);

        }
    }

    public static void main(String[] args) {
        new withdrawl("");
    }
}
