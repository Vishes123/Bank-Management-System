package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SingUp3 extends JFrame {
    String formno;


    SingUp3(String formno){
        this.formno = formno;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 3 : -");
        l1.setFont(new Font("Tahoma",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Tahoma",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type");
        l3.setFont(new Font("Tahoma",Font.BOLD,18));
        l3.setBounds(100,140,200,40);
        add(l3);
        JRadioButton rb1 = new JRadioButton("Saving A/c");
        rb1.setBackground(new Color(215,252,252));
        rb1.setFont(new Font("Tahoma",Font.BOLD,16));
        rb1.setBounds(250,140,150,30);
        add(rb1);
        JRadioButton rb2 = new JRadioButton("Fix Deposit A/c");
        rb2.setBackground(new Color(215,252,252));
        rb2.setFont(new Font("Tahoma",Font.BOLD,16));
        rb2.setBounds(350,140,150,30);
        add(rb2);
        JRadioButton rb3 = new JRadioButton("Current A/c");
        rb3.setBackground(new Color(215,252,252));
        rb3.setFont(new Font("Tahoma",Font.BOLD,16));
        rb3.setBounds(500,140,150,30);
        add(rb3);
        JRadioButton rb4 = new JRadioButton("Deposit A/c");
        rb4.setBackground(new Color(215,252,252));
        rb4.setFont(new Font("Tahoma",Font.BOLD,16));
        rb4.setBounds(650,140,150,30);
        add(rb4);
        ButtonGroup buttonGroup =new ButtonGroup();
        buttonGroup.add(rb1);
        buttonGroup.add(rb2);
        buttonGroup.add(rb3);
        buttonGroup.add(rb4);

        JLabel cardNo = new JLabel("Card No");
        cardNo.setBounds(100,200,200,30);
        cardNo.setFont(new Font("Tahoma",Font.BOLD,18));
        add(cardNo);

        JLabel l5 = new JLabel("(Your 16-digit Card No)");
        l5.setBounds(100,230,250,20);
       l5.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-5462");
      l6.setBounds(330,200,300,30);
      l6.setFont(new Font("Tahoma",Font.BOLD,18));
        add(l6);

        JLabel l7 = new JLabel("(it would appear on atm card/cheque Book and Statement)");
        l7.setBounds(320,230,550,20);
      l7.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l7);

        JLabel l8 = new JLabel("PIN");
        l8.setBounds(100,270,200,30);
        l8.setFont(new Font("Tahoma",Font.BOLD,18));
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setBounds(330,270,300,30);
        l9.setFont(new Font("Tahoma",Font.BOLD,18));
        add(l9);

        JLabel l10 = new JLabel("(4-digit password)");
        l10.setBounds(100,300,250,20);
        l10.setFont(new Font("Tahoma",Font.BOLD,14));
        add(l10);

        JLabel l11 = new JLabel("Service Required");
        l11.setBounds(100,370,200,30);
        l11.setFont(new Font("Tahoma",Font.BOLD,18));
        add(l11);
        JCheckBox c1 = new JCheckBox("ATM Card");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Tahoma",Font.BOLD,16));
        c1.setBounds(100,420,200,30);
        add(c1);
        JCheckBox c2 = new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Tahoma",Font.BOLD,16));
        c2.setBounds(300,420,200,30);
        add(c2);
        JCheckBox c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Tahoma",Font.BOLD,16));
        c3.setBounds(100,460,200,30);
        add(c3);
        JCheckBox c4 = new JCheckBox("Email Alert");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Tahoma",Font.BOLD,16));
        c4.setBounds(300,460,200,30);
        add(c4);

        JCheckBox c5 = new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Tahoma",Font.BOLD,16));
        c5.setBounds(100,510,200,30);
        add(c5);
        JCheckBox c6 = new JCheckBox("E - Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Tahoma",Font.BOLD,16));
        c6.setBounds(300,510,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by decleares that the above entered details correct to best of my knlowledge" , true);
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Tahoma",Font.BOLD,12));
        c7.setBounds(100,580,600,20);
        add(c7);

        JLabel l12 = new JLabel(" Form No");
        l12.setBounds(670,10,100,30);
        l12.setFont(new Font("Thoma",Font.BOLD,18));
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setBounds(760,10,160,30);
        l13.setFont(new Font("Thoma",Font.BOLD,12));
        add(l13);


        JButton b1 = new JButton("SUBMIT");
        b1.setBackground(Color.black);
        b1.setFont(new Font("Thoma",Font.BOLD,16));
        b1.setForeground(Color.white);
        b1.setBounds(230,620,120,30);
        add(b1);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Atype = null;
                if (rb1.isSelected()){
                    Atype = "saving A/c";
                }else  if (rb2.isSelected()){
                    Atype = "Fix Deposit A/c";
                }else  if (rb3.isSelected()){
                    Atype = "Current";
                }else  if (rb4.isSelected()){
                    Atype = "Deposit A/c";
                }
                Random ran = new Random();
                long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
                String cardno = "" + Math.abs(first7);

                long first3 = (ran.nextLong()% 9000L)+1000L;
                String pin = ""+Math.abs(first3);

                String fac = "";
                if (c1.isSelected()){
                    fac += "ATM Card";
                }else if (c2.isSelected()){
                    fac += "Internet banking";
                }
                else if (c3.isSelected()){
                    fac += "Mobile Banking";
                }
                else if (c4.isSelected()){
                    fac += "Email Alert";
                }else if (c5.isSelected()){
                    fac += "Cheque Book";
                } else if (c6.isSelected()){
                fac += "E - Statement";
            }

                try{
                    if (e.getSource()==b1){
                        if (l3.equals("")){
                            JOptionPane.showMessageDialog(null,"Fill the all field");
                        }else {
                            Con c1 = new Con();
                            String q1 = "insert into singup3 values ('"+formno+"','"+Atype+"','"+cardno+"','"+pin+"', '"+fac+"')";
                            String q2 = "insert into login values ('"+formno+"','"+cardno+"','"+pin+"')";
                            c1.statement.executeUpdate(q1);
                            c1.statement.executeUpdate(q2);
                            JOptionPane.showMessageDialog(null,"Card No  : "+cardno+"\n pin : "+pin);
                            new deposite(pin);
                            setVisible(false);
                        }
                    }

                }catch (Exception E){
                    E.printStackTrace();
                }




            }
        });

        JButton b2 = new JButton("CANSEL");
        b2.setBackground(Color.black);
        b2.setFont(new Font("Thoma",Font.BOLD,16));
        b2.setForeground(Color.white);
        b2.setBounds(380,620,120,30);
        add(b2);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==b2){
                    setVisible(false);
                }

            }
        });




        getContentPane().setBackground(new Color(215,252,252));
        setSize(850,800);
        setLocation(300,20);
        setLayout(null);
        setVisible(true);

    }
    public static void main(String[] args) {
        new SingUp3(" ");

    }
}
