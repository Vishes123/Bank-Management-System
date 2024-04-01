package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Fast_cash extends JFrame {
    String pin;
    Fast_cash(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,700, Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(-70,-10,1550,700);
        add(image);


        JLabel l1 = new JLabel("Select Withdraw Amount");
        l1.setBounds(460,160,700,35);
        l1.setForeground(Color.white);
        l1.setFont(new Font("System",Font.BOLD,28));
        image.add(l1);

        JButton b1 = new JButton("Rs. 100");
        b1.setForeground(Color.white);
        b1.setBackground(new Color(65,125,128));
        b1.setBounds(405,227,150,34);
        b1.setFont(new Font("Tahoma",Font.BOLD,12));
        image.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b1){
                   String amount = b1.getText().substring(4);
                   Con c = new Con();
                   Date date = new Date();
                   try{
                       ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                       int balance =0;
                       while (resultSet.next()){
                           if (resultSet.getString("type").equals("Deposit")){
                               balance += Integer.parseInt(resultSet.getString("amount"));

                           }else {
                               balance -= Integer.parseInt(resultSet.getString("amount"));

                           }
                       }String num ="17";
                       if (e.getSource()!=b1&&balance<Integer.parseInt(amount)){
                           JOptionPane.showMessageDialog(null,"Insaficent Balance");
                           return;
                       }
                       c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                       JOptionPane.showMessageDialog(null,"Rs. "+amount+"Debited Successfully");

                   }catch (Exception E){
                       E.printStackTrace();
                   }
                   setVisible(false);
                   new main_classes(pin);
                }

            }
        });

        JButton b2 = new JButton("Rs. 500");
        b2.setForeground(Color.white);
        b2.setBackground(new Color(65,125,128));
        b2.setBounds(700,227,155,34);
        b2.setFont(new Font("Tahoma",Font.BOLD,12));
        image.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource()==b2){
                    String amount = b2.getText().substring(4);
                    Con c = new Con();
                    Date date = new Date();
                    try{
                        ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                        int balance =0;
                        while (resultSet.next()){
                            if (resultSet.getString("type").equals("Deposit")){
                                balance += Integer.parseInt(resultSet.getString("amount"));

                            }else {
                                balance -= Integer.parseInt(resultSet.getString("amount"));

                            }
                        }String num ="17";
                        if (e.getSource()!=b2&&balance<Integer.parseInt(amount)){
                            JOptionPane.showMessageDialog(null,"Insaficent Balance");
                            return;
                        }
                        c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                        JOptionPane.showMessageDialog(null,"Rs. "+amount+"Debited Successfully");

                    }catch (Exception E){
                        E.printStackTrace();
                    }
                    setVisible(false);
                    new main_classes(pin);
                }


            }
        });

        JButton b3 = new JButton("Rs. 1000");
        b3.setForeground(Color.white);
        b3.setBackground(new Color(65,125,128));
        b3.setBounds(405,270,155,34);
        b3.setFont(new Font("Tahoma",Font.BOLD,12));
        image.add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b3){
                    String amount = b3.getText().substring(4);
                    Con c = new Con();
                    Date date = new Date();
                    try{
                        ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                        int balance =0;
                        while (resultSet.next()){
                            if (resultSet.getString("type").equals("Deposit")){
                                balance += Integer.parseInt(resultSet.getString("amount"));

                            }else {
                                balance -= Integer.parseInt(resultSet.getString("amount"));

                            }
                        }String num ="17";
                        if (e.getSource()!=b3&&balance<Integer.parseInt(amount)){
                            JOptionPane.showMessageDialog(null,"Insaficent Balance");
                            return;
                        }
                        c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                        JOptionPane.showMessageDialog(null,"Rs. "+amount+"Debited Successfully");

                    }catch (Exception E){
                        E.printStackTrace();
                    }
                    setVisible(false);
                    new main_classes(pin);
                }


            }
        });

        JButton b4 = new JButton("Rs. 5000");
        b4.setForeground(Color.white);
        b4.setBackground(new Color(65,125,128));
        b4.setBounds(700,270,155,34);
        b4.setFont(new Font("Tahoma",Font.BOLD,12));
        image.add(b4);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b4){
                    String amount = b4.getText().substring(4);
                    Con c = new Con();
                    Date date = new Date();
                    try{
                        ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                        int balance =0;
                        while (resultSet.next()){
                            if (resultSet.getString("type").equals("Deposit")){
                                balance += Integer.parseInt(resultSet.getString("amount"));

                            }else {
                                balance -= Integer.parseInt(resultSet.getString("amount"));

                            }
                        }String num ="17";
                        if (e.getSource()!=b4&&balance<Integer.parseInt(amount)){
                            JOptionPane.showMessageDialog(null,"Insaficent Balance");
                            return;
                        }
                        c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                        JOptionPane.showMessageDialog(null,"Rs. "+amount+"Debited Successfully");

                    }catch (Exception E){
                        E.printStackTrace();
                    }
                    setVisible(false);
                    new main_classes(pin);
                }


            }
        });

        JButton b5 = new JButton("Rs. 2000");
        b5.setForeground(Color.white);
        b5.setBackground(new Color(65,125,128));
        b5.setBounds(405,310,155,34);
        b5.setFont(new Font("Tahoma",Font.BOLD,12));
        image.add(b5);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b5){
                    String amount = b5.getText().substring(4);
                    Con c = new Con();
                    Date date = new Date();
                    try{
                        ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                        int balance =0;
                        while (resultSet.next()){
                            if (resultSet.getString("type").equals("Deposit")){
                                balance += Integer.parseInt(resultSet.getString("amount"));

                            }else {
                                balance -= Integer.parseInt(resultSet.getString("amount"));

                            }
                        }String num ="17";
                        if (e.getSource()!=b5&&balance<Integer.parseInt(amount)){
                            JOptionPane.showMessageDialog(null,"Insaficent Balance");
                            return;
                        }
                        c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                        JOptionPane.showMessageDialog(null,"Rs. "+amount+"Debited Successfully");

                    }catch (Exception E){
                        E.printStackTrace();
                    }
                    setVisible(false);
                    new main_classes(pin);
                }


            }
        });

        JButton b6 = new JButton("Rs. 10,000");
        b6.setForeground(Color.white);
        b6.setBackground(new Color(65,125,128));
        b6.setBounds(700,310,155,34);
        b6.setFont(new Font("Tahoma",Font.BOLD,12));
        image.add(b6);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b6){
                    String amount = b6.getText().substring(4);
                    Con c = new Con();
                    Date date = new Date();
                    try{
                        ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
                        int balance =0;
                        while (resultSet.next()){
                            if (resultSet.getString("type").equals("Deposit")){
                                balance += Integer.parseInt(resultSet.getString("amount"));

                            }else {
                                balance -= Integer.parseInt(resultSet.getString("amount"));

                            }
                        }
                        String num ="17";
                        if (e.getSource()!=b6&&balance<Integer.parseInt(amount)){
                            JOptionPane.showMessageDialog(null,"Insaficent Balance");
                            return;
                        }
                        c.statement.executeUpdate("insert into bank values ('"+pin+"','"+date+"','withdrawl','"+amount+"')");
                        JOptionPane.showMessageDialog(null,"Rs. "+amount+"Debited Successfully");

                    }catch (Exception E){
                        E.printStackTrace();
                    }
                    setVisible(false);
                    new main_classes(pin);
                }


            }
        });

       /* JButton b7 = new JButton("EXIT");
        b7.setForeground(Color.white);
        b7.setBackground(new Color(65,125,128));
        b7.setBounds(405,350,155,34);
        b7.setFont(new Font("Tahoma",Font.BOLD,12));
        image.add(b7);*/

        JButton b8 = new JButton("BACK");
        b8.setForeground(Color.white);
        b8.setBackground(new Color(65,125,128));
        b8.setBounds(700,350,155,34);
        b8.setFont(new Font("Tahoma",Font.BOLD,12));
        image.add(b8);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b8){
                 new main_classes(pin);
                 setVisible(false);

                }

            }
        });


        setSize(1550,1080);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);

    }


    public static void main(String[] args) {
        new Fast_cash("");

    }
}
