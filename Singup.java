package Bank.Management.System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Singup extends JFrame {
    Random ran = new Random();
    long first4= (ran.nextLong() % 9000L) +1000L;
    String first = "  " +Math.abs(first4);
    JDateChooser dateChooser;
    JButton next;
    JRadioButton rb1,rb2,rb3,rb4,rb5;
    Singup(){

        super("Singup");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel l1 = new JLabel("APPLICATION FROM NO:" + first);
        l1.setFont(new Font("Tahoma",Font.BOLD,38));
        l1.setBounds(160,20,600,40);
        l1.setForeground(Color.black);
        add(l1);

        JLabel l2 = new JLabel("PAGE 1");
        l2.setForeground(Color.black);
        l2.setBounds(360,70,600,30);
        l2.setFont(new Font("Tahoma",Font.BOLD,22));
        add(l2);

        JLabel l3 = new JLabel("PERSONAL DETAILS");
        l3.setFont(new Font("Tahoma",Font.BOLD,22));
        l3.setBounds(290,90,600,30);
        add(l3);

        JLabel name = new JLabel("Name");
        name.setBounds(100,150,100,30);
        name.setFont(new Font("Tahoma",Font.BOLD,20));
        add(name);
        JTextField textname = new JTextField();
        textname.setBounds(300,150,250,30);
        textname.setFont(new Font("Tahoma",Font.BOLD,14));
        add(textname);


        JLabel fname = new JLabel("Father Name:");
        fname.setBounds(100,200,150,30);
        fname.setFont(new Font("Tahoma",Font.BOLD,20));
        add(fname);
        JTextField textfname = new JTextField();
        textfname.setBounds(300,200,250,30);
        textfname.setFont(new Font("Tahoma",Font.BOLD,14));
        add(textfname);

        JLabel db = new JLabel(" Date of Birth:");
        db.setBounds(95,250,150,30);
        db.setFont(new Font("Tahoma",Font.BOLD,20));
        add(db);
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,250,250,30);
        dateChooser.setFont(new Font("Tahoma",Font.BOLD,14));
        add(dateChooser);

        JLabel gender = new JLabel(" Gender:");
        gender.setBounds(95,300,150,30);
        gender.setFont(new Font("Tahoma",Font.BOLD,20));
        add(gender);
        JRadioButton rb1 = new JRadioButton("Male");
        rb1.setBackground(new Color(222,255,228));
        rb1.setFont(new Font("Tahoma",Font.BOLD,17));
        rb1.setBounds(300,300,100,30);
        add(rb1);
        JRadioButton rb2 = new JRadioButton("Female");
        rb2.setFont(new Font("Tahoma",Font.BOLD,17));
        rb2.setBounds(440,300,100,30);
        rb2.setBackground(new Color(222,255,228));
        add(rb2);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rb1);
        buttonGroup.add(rb2);

        JLabel email = new JLabel("Email Address:");
        email.setBounds(100,350,170,30);
        email.setFont(new Font("Tahoma",Font.BOLD,20));
        add(email);
        JTextField textemail = new JTextField();
        textemail .setBounds(300,350,250,30);
        textemail .setFont(new Font("Tahoma",Font.BOLD,14));
        add(textemail );

        JLabel ms = new JLabel("Martial Status:");
        ms.setBounds(100,400,170,30);
        ms.setFont(new Font("Tahoma",Font.BOLD,20));
        add(ms);
        JRadioButton rb3 = new JRadioButton("Married");
        rb3.setBackground(new Color(222,255,228));
        rb3.setFont(new Font("Tahoma",Font.BOLD,17));
        rb3.setBounds(300,400,100,30);
        add(rb3);
        JRadioButton rb4 = new JRadioButton("Un Married");
        rb4.setFont(new Font("Tahoma",Font.BOLD,17));
        rb4.setBounds(420,400,150,30);
        rb4.setBackground(new Color(222,255,228));
        add(rb4);
        JRadioButton rb5 = new JRadioButton("Other");
        rb5.setFont(new Font("Tahoma",Font.BOLD,17));
        rb5.setBounds(570,400,150,30);
        rb5.setBackground(new Color(222,255,228));
        add(rb5);


        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rb3);
        buttonGroup1.add(rb4);
        buttonGroup1.add(rb5);

        JLabel city = new JLabel("City:");
      city.setBounds(100,450,170,30);
        city.setFont(new Font("Tahoma",Font.BOLD,20));
        add(city);
        JTextField textcity = new JTextField();
        textcity .setBounds(300,450,250,30);
        textcity .setFont(new Font("Tahoma",Font.BOLD,14));
        add(textcity );

        JLabel Adrs = new JLabel("Address:");
        Adrs.setBounds(100,500,170,30);
        Adrs.setFont(new Font("Tahoma",Font.BOLD,20));
        add(Adrs);
        JTextField textAdrs = new JTextField();
        textAdrs .setBounds(300,500,250,30);
        textAdrs .setFont(new Font("Tahoma",Font.BOLD,14));
        add(textAdrs );

        JLabel pin = new JLabel("Pin Code:");
        pin.setBounds(100,550,170,30);
        pin.setFont(new Font("Tahoma",Font.BOLD,20));
        add(pin);
        JTextField textpin = new JTextField();
        textpin .setBounds(300,550,250,30);
        textpin .setFont(new Font("Tahoma",Font.BOLD,14));
        add(textpin );

        JLabel state = new JLabel("State:");
        state.setBounds(100,600,170,30);
       state.setFont(new Font("Tahoma",Font.BOLD,20));
        add(state);
        JTextField textstate = new JTextField();
        textstate .setBounds(300,600,250,30);
        textstate .setFont(new Font("Tahoma",Font.BOLD,14));
        add(textstate );


       JButton next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Tahoma",Font.BOLD,13));
        next.setBounds(660,630,80,40);
        add(next);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==next){
                    String fromeno = first;
                    String name = textname.getText();
                    String fname = textfname.getText();
                    String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
                    String gender = null;
                    if (rb1.isSelected()){
                        gender = "Male";
                    }else if (rb2.isSelected()){
                        gender="Female";
                    }
                    String email = textemail.getText();
                    String marital = null;
                    if (rb3.isSelected()){
                        marital ="Married";
                    }else if (rb4.isSelected()){
                        marital="Unmarried";
                    }
                    else if (rb5.isSelected()){
                        marital="Other";
                    }
                    String Addras = textAdrs.getText();
                    String City = textcity.getText();
                    String PinCode = textpin.getText();
                    String State = textstate.getText();

                    try {
                        if (textname.getText().equals("")){
                            JOptionPane.showMessageDialog(null,"Fill all the field");
                        }else {
                            //Con con1 = new Con();
                            Con con1 =new Con();
                            String q = "insert into singup values('"+fromeno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+Addras+"','"+City+"','"+PinCode+"','"+State+"' )";
                            con1.statement.executeUpdate(q);
                            new SingUp2(fromeno);
                            setVisible(false);



                        }

                    }catch (Exception E){
                        E.printStackTrace();

                    }


                }
            }
        });


        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setUndecorated(false);
        setLocation(340,3);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Singup();

    }
}
