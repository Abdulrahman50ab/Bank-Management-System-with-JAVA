package Abdulrahman.bank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    TextField textField;
    JButton b1,b2;
    Deposit(String pin){
        this.pin= pin;

        // for background image
        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image img2 = img1.getImage().getScaledInstance(1300,650,Image.SCALE_DEFAULT);
        ImageIcon img3 = new ImageIcon(img2);
        JLabel image =new JLabel(img3);
        image.setBounds(0,0,1300,650);
        add(image);


        JLabel l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setFont(new Font("System",Font.BOLD,15));
        l1.setForeground(Color.white);
        l1.setBounds(380,130,400,35);
       image.add(l1);

        textField = new TextField();
        textField.setBackground(new Color(0x17045E));
        textField.setForeground(Color.white);
        textField.setBounds(380,160,310,35);
        textField.setFont(new Font("System",Font.BOLD,20));
        image.add(textField);
//for deposit button
        b1 = new JButton("DEPOSIT");
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
      try {
          String amount = textField.getText();
          Date date = new Date();
          if (e.getSource()==b1) {
              if (amount.equals("")){
                  JOptionPane.showMessageDialog(null,"Please enter the Amount you want to deposit");
              } else if (amount.matches(".*[a-zA-Z].*") || amount.contains(" ")) {
                  JOptionPane.showMessageDialog(null,"please enter amount correct not include letter and space");
              } else{
                  ConnectionSU con4 = new ConnectionSU();
                  con4.statement.executeUpdate("insert into banktime values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                  JOptionPane.showMessageDialog(null,"Rs."+amount+"  Deposit Successfully");
                  setVisible(false);
                  new transaction(pin);
              }

          } else if (e.getSource()==b2) {
              setVisible(false);
              new transaction(pin);

          }
      }catch (Exception E){
          E.printStackTrace();
      }


    }




    public static void main(String[] args) {
        new Deposit("");
    }
}
