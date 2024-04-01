package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class deposite extends JFrame {
    String pin;
    deposite(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,700, Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(-70,-10,1550,700);
        add(image);

        JLabel l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setBounds(460,180,400,35);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Tahoma",Font.BOLD,16));
        image.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(460,230,320,25);
        t1.setFont(new Font("Tahoma",Font.BOLD,22));
        t1.setBackground(new Color(65,125,128));
        t1.setForeground(Color.white);
       image.add(t1);

       JButton b1 = new JButton("DEPOSIT");
       b1.setBounds(700,300,150,35);
       b1.setBackground(new Color(65,125,128));
       b1.setForeground(Color.white);
       image.add(b1);
       b1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
            try {
                String amount = t1.getText();
                Date date = new Date();
                if (e.getSource()==b1){
                    if (t1.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Please Entre the Amount you Want to Deposit");

                    }else {
                        Con c = new Con();
                        c.statement.executeUpdate("insert into bank values ('"+pin+"', '"+date+"','deposite' , '"+amount+"')");
                        JOptionPane.showMessageDialog(null,"Rs "+amount+"Deposit Successfully");
                        setVisible(false);
                        new main_classes(pin);
                    }
                }

            }catch (Exception E){
                E.printStackTrace();
            }


           }
       });

        JButton b2 = new JButton("CANSEL");
        b2.setBounds(700,340,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.white);
        image.add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource()==b2){
                    setVisible(false);
                    new main_classes(pin);
                }

            }
        });


        setSize(1550,1080);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new deposite("");

    }
}
