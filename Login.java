package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame {
    Login(){
        super("Bank Management System");

        JLabel l1 = new JLabel("WELCOME  TO  ATM");
        l1.setBounds(270,110,250,40);
        l1.setFont(new Font("Tahoma",Font.BOLD,25));
        l1.setForeground(Color.white);
        add(l1);
        JLabel l2 = new JLabel("Card No:");
        l2.setForeground(Color.white);
        l2.setFont(new Font("Tahoma",Font.BOLD,20));
        l2.setBounds(230,160,110,40);
        add(l2);
        JTextField t1 = new JTextField();
        t1.setBackground(Color.white);
        t1.setForeground(Color.black);
        t1.setFont(new Font("Tahoma",Font.BOLD,17));
        t1.setBounds(350,165,200,30);
        add(t1);

        JLabel l3 = new JLabel("PIN:");
        l3.setForeground(Color.white);
        l3.setFont(new Font("Tahoma",Font.BOLD,20));
        l3.setBounds(230,205,110,40);
        add(l3);
        JPasswordField t2 = new JPasswordField();
        t2.setBackground(Color.white);
        t2.setForeground(Color.black);
        t2.setFont(new Font("Tahoma",Font.BOLD,17));
        t2.setBounds(350,210,200,30);
        add(t2);

        JButton b1 = new JButton("SING IN");
        b1.setFont(new Font("Tahoma",Font.BOLD,15));
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.setBounds(320,265,100,30);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if (e.getSource()==b1){
                       if (l3.equals("")){
                           JOptionPane.showMessageDialog(null,"Please fill the pin");

                       }else if (l2.equals("")){
                           JOptionPane.showMessageDialog(null,"Please fill the card number");
                       }else {
                           Con c = new Con();
                           String cardno = t1.getText();
                           String pin = t2.getText();
                           String q = "select * from login where card_number = '"+cardno+"' and oin = '"+pin+"'";
                           ResultSet resultSet = c.statement.executeQuery(q);
                           if (resultSet.next()) {
                               setVisible(false);
                               new main_classes(pin);
                           }else {
                               JOptionPane.showMessageDialog(null,"Incorrect Card no or Pin");

                           }

                       }
                    }

                }catch (Exception E){
                    E.printStackTrace();
                }

            }
        });
        JButton b2 = new JButton("CLEAR");
        b2.setFont(new Font("Tahoma",Font.BOLD,15));
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.setBounds(450,265,100,30);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if (e.getSource()==b2){
                        t2.setText("");
                        t1.setText("");

                    }

                }catch (Exception E){
                    E.printStackTrace();
                }

            }
        });
        JButton b3 = new JButton("SING UP");
        b3.setFont(new Font("Tahoma",Font.BOLD,15));
        b3.setBackground(Color.black);
        b3.setForeground(Color.white);
        b3.setBounds(336,310,200,30);
        add(b3);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if (e.getSource()==b3){
                        new Singup();
                        setVisible(false);

                    }

                }catch (Exception E){
                    E.printStackTrace();
                }

            }
        });


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3  = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3  = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);


        setSize(850,480);
        setUndecorated(true);
        setLocation(280,150);
        setLayout(null);
        setVisible(true);



    }
    public static void main(String[] args) {
        new Login();

    }
}
