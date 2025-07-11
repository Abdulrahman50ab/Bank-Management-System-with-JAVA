package Abdulrahman.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Ministatement extends JFrame implements ActionListener {
    String pin;
    JButton button;
    Ministatement(String pin){
        this.pin=pin;

        JLabel l1 = new JLabel();
        l1.setBounds(20,10,400,200);
        add(l1);

        JLabel l2 = new JLabel("AB-ATM");
        l2.setFont(new Font("System",Font.BOLD,30));
        l2.setBounds(400,20,200,70);
        add(l2);

        JLabel l3 = new JLabel();
        l3.setBounds(20,20,300,20);
        add(l3);

        JLabel l4 = new JLabel();
        l4.setBounds(20,560,500,20);
        l4.setFont(new Font("",Font.BOLD,20));
        add(l4);

        try {
            ConnectionSU c = new ConnectionSU();
            ResultSet resultSet = c.statement.executeQuery("select * from Login where pin = '"+pin+"'");
            while(resultSet.next()){
                l3.setText("Card NO "+resultSet.getString("cardnumber").substring(0,4)+"XXXXXXXX"+resultSet.getString("cardnumber").substring(12));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            int balance = 0;
            ConnectionSU c =new ConnectionSU();
            ResultSet resultSet = c.statement.executeQuery("select * from banktime where pin ='"+pin+"'");
            while(resultSet.next()){
                l1.setText(l1.getText() +"<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><html>");

                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            l4.setText("Your total balance : "+balance);
        }catch (Exception E){
            E.printStackTrace();
        }

        button = new JButton("exit");
        button.setBounds(400,600,100,20);
        button.setForeground(Color.white);
        button.setBackground(Color.BLACK);
        add(button);
        button.addActionListener(this);



        setSize(1980,1020);
        setLocation(0,0);

        getContentPane().setBackground(new Color(0xE50097F5, true));
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new transaction(pin);

    }

    public static void main(String[] args) {
       new Ministatement("");
    }
}
