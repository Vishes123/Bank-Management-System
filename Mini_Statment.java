package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Mini_Statment extends JFrame {
    String pin;
    Mini_Statment(String pin){
        this.pin=pin;
        JLabel l1 = new JLabel();
        l1.setBounds(20,140,400,200);
        add(l1);

        JLabel l2 = new JLabel("Vishesh Bank PLT");
        l2.setFont(new Font("Tahoma",Font.BOLD,15));
        l2.setBounds(130,20,200,20);
        add(l2);

        JLabel l3 = new JLabel();
        l3.setBounds(20,80,300,20);
        add(l3);


        JLabel l4 = new JLabel();
        l4.setBounds(20,400,300,20);
        add(l4);

        try {
            Con c= new Con();
            ResultSet resultSet = c.statement.executeQuery("select *from login where oin = '"+pin+"'");
            while (resultSet.next()){
                l3.setText("Card No: "+resultSet.getString("card_number").substring(0,4)+"xxxxxxxx"+resultSet.getString("card_number").substring(12));
            }

        }catch (Exception E){
            E.printStackTrace();
        }
        try {
            int balance = 0;
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                l1.setText(l1.getText()+"<html>"+resultSet.getString("data")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");

                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));

                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));

                }
            }
            l4.setText("Your Total Balance is Rs "+balance);

        }catch (Exception E){
            E.printStackTrace();
        }
        JButton b1 = new JButton("Exit");
        b1.setBounds(20,500,100,25);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b1){
                    setVisible(false);
                }

            }

        });


        setSize(400,600);
        setLocation(400,20);
        setUndecorated(true);
        getContentPane().setBackground(new Color(255,204,204));
        setLayout(null);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Mini_Statment("");

    }
}
