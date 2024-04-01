package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Balance_Enquery extends JFrame {
    String pin;
    JLabel label2;
    Balance_Enquery(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,700, Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(-70,-10,1550,700);
        add(image);

        JLabel l1 = new JLabel("MAXIMUM AMOUNT IS Rs. 10,000");
        l1.setBounds(430,180,700,35);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Tahoma",Font.BOLD,16));
        image.add(l1);

         label2 = new JLabel();
        label2.setBounds(430,220,400,35);
        label2.setForeground(Color.white);
        label2.setFont(new Font("Tahoma",Font.BOLD,16));
        image.add(label2);

        JButton b1 = new JButton("BACK");
        b1.setBounds(700,300,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        image.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new main_classes(pin);

            }
        });
        int balance =0;
        try {
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));

                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }

            }

        }catch (Exception E){
            E.printStackTrace();

        }
        label2.setText(""+balance);



        setSize(1550,1080);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Balance_Enquery("");

    }
}
