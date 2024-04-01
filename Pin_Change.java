package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Pin_Change extends JFrame {
    String pin;
    Pin_Change(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,700, Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(-70,-10,1550,700);
        add(image);

        JLabel l1 = new JLabel("CHANGE YOUR PIN");
        l1.setBounds(560,150,400,35);
        l1.setForeground(Color.white);
        l1.setFont(new Font("Tahoma",Font.BOLD,16));
        image.add(l1);



        JLabel l2 = new JLabel("New Pin");
        l2.setBounds(430,220,400,35);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Tahoma",Font.BOLD,16));
        image.add(l2);

        JPasswordField p1 = new JPasswordField();
        p1.setForeground(Color.white);
        p1.setBackground(new Color(65,125,128));
        p1.setFont(new Font("Tahoma",Font.BOLD,22));
        p1.setBounds(510,225,320,25);
        image.add(p1);


        JLabel l3 = new JLabel("Re_Enter New Pin");
        l3.setBounds(430,260,400,35);
        l3.setForeground(Color.white);
        l3.setFont(new Font("Tahoma",Font.BOLD,16));
        image.add(l3);

        JPasswordField p3 = new JPasswordField();
        p3.setForeground(Color.white);
        p3.setBackground(new Color(65,125,128));
        p3.setFont(new Font("Tahoma",Font.BOLD,22));
        p3.setBounds(590,265,240,25);
        image.add(p3);



        JButton b1 = new JButton("CHANGE");
        b1.setBounds(700,300,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.white);
        image.add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               try {
                   String pin1 = p1.getText();
                   String pin_C = p3.getText();
                   if (!pin1.equals(pin_C)){
                       JOptionPane.showMessageDialog(null,"write the same values");
                       return;

                   }
                   if (e.getSource()==b1){
                       if (p1.getText().equals("")){
                           JOptionPane.showMessageDialog(null,"Enter New Pin");
                           return;
                       }
                       if (p3.getText().equals("")){
                           JOptionPane.showMessageDialog(null,"Re_Enter New Pin");
                           return;
                       }
                       Con c = new Con();
                       String q1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"' ";
                       String q2 = "update login set oin = '"+pin1+"'  where oin =  '"+pin+"' ";
                       String q3 = "update singup3 set pin = '"+pin1+"'  where pin =  '"+pin+"' ";

                       c.statement.executeUpdate(q1);
                       c.statement.executeUpdate(q2);
                       c.statement.executeUpdate(q3);
                       JOptionPane.showMessageDialog(null,"Pin Change Successfully");
                       System.out.println(false);
                       new main_classes(pin);
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
                    new main_classes(pin);
                    setVisible(false);
                }



            }
        });


        setSize(1550,1080);
        setLayout(null);
        setLocation(0,0);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Pin_Change("");

    }
}
