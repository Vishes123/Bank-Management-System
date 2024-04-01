package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SingUp2 extends JFrame {
    String formno;
    SingUp2(String formno){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3  = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Tahoma",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional details");
        l2.setFont(new Font("Tahoma",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion");
        l3.setBounds(100,120,100,30);
        l3.setFont(new Font("Thoma",Font.BOLD,18));
        add(l3);
        JComboBox comboBox =new JComboBox(  new String[]{"Hindu" , "Muslim" , "Sinkh" , "Crichan"});
        comboBox.setBounds(350,120,320,30);
        comboBox.setFont(new Font("Tahoma",Font.BOLD,18));
        comboBox.setBackground(new Color(255, 167, 45));
        add(comboBox);

        JLabel l4 = new JLabel("Category");
        l4.setBounds(100,170,100,30);
        l4.setFont(new Font("Thoma",Font.BOLD,18));
        add(l4);
        JComboBox comboBox2 =new JComboBox(  new String[]{"General" , "Obc" , "sc" , "st"});
        comboBox2.setBounds(350,170,320,30);
        comboBox2.setFont(new Font("Tahoma",Font.BOLD,18));
        comboBox2.setBackground(new Color(255, 167, 45));
        add(comboBox2);

        JLabel l5 = new JLabel("Income");
        l5.setBounds(100,220,100,30);
        l5.setFont(new Font("Thoma",Font.BOLD,18));
        add(l5);
        JComboBox comboBox3 =new JComboBox(  new String[]{"Null" , "<1, 50,000" , "<2,50,000" , "<5,00000" , "<10,00000"});
        comboBox3.setBounds(350,220,320,30);
        comboBox3.setFont(new Font("Tahoma",Font.BOLD,18));
        comboBox3.setBackground(new Color(255, 167, 45));
        add(comboBox3);

        JLabel l6 = new JLabel("Education qualification");
        l6.setBounds(100,270,200,30);
        l6.setFont(new Font("Thoma",Font.BOLD,18));
        add(l6);
        JComboBox comboBox4 =new JComboBox(  new String[]{"10" , "10th +2" , "Graduation" , "Other"});
        comboBox4.setBounds(350,270,320,30);
        comboBox4.setFont(new Font("Tahoma",Font.BOLD,18));
        comboBox4.setBackground(new Color(255, 167, 45));
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation");
        l7.setBounds(100,320,100,30);
        l7.setFont(new Font("Thoma",Font.BOLD,18));
        add(l7);
        JComboBox comboBox5 =new JComboBox(  new String[]{"Salaried" , "Self-Employee" , "Student" , "Other"});
        comboBox5.setBounds(350,320,320,30);
        comboBox5.setFont(new Font("Tahoma",Font.BOLD,18));
        comboBox5.setBackground(new Color(255, 167, 45));
        add(comboBox5);

        JLabel l8 = new JLabel("PAN No");
        l8.setBounds(100,370,100,30);
        l8.setFont(new Font("Thoma",Font.BOLD,18));
        add(l8);
        JTextField t1 = new JTextField();
        t1.setBounds(350,370,320,30);
        t1.setFont(new Font("Tahoma",Font.BOLD,18));
       t1.setBackground(new Color(255, 167, 45));
        add(t1);

        JLabel l9 = new JLabel("Aadhar No");
        l9.setBounds(100,420,100,30);
        l9.setFont(new Font("Thoma",Font.BOLD,18));
        add(l9);
        JTextField t2 = new JTextField();
        t2.setBounds(350,420,320,30);
        t2.setFont(new Font("Tahoma",Font.BOLD,18));
        t2.setBackground(new Color(255, 167, 45));
        add(t2);

        JLabel l10 = new JLabel("Senior citizen");
        l10.setBounds(100,470,150,30);
        l10.setFont(new Font("Thoma",Font.BOLD,18));
        add(l10);
        JRadioButton rb1 = new JRadioButton("Yes");
        rb1.setBounds(350,470,70,30);
        rb1.setBackground(new Color(252,208,76));
        rb1.setFont(new Font("Tahoma",Font.BOLD,18));
        add(rb1);
        JRadioButton rb2 = new JRadioButton("No");
        rb2.setBounds(500,470,70,30);
        rb2.setBackground(new Color(252,208,76));
        rb2.setFont(new Font("Tahoma",Font.BOLD,18));
        add(rb2);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rb1);
        buttonGroup.add(rb2);


        JLabel l11 = new JLabel(" Existing Account");
        l11.setBounds(100,520,170,30);
        l11.setFont(new Font("Thoma",Font.BOLD,18));
        add(l11);
        JRadioButton rb3 = new JRadioButton("Yes");
        rb3.setBounds(350,520,70,30);
        rb3.setBackground(new Color(252,208,76));
        rb3.setFont(new Font("Tahoma",Font.BOLD,18));
        add(rb3);
        JRadioButton rb4 = new JRadioButton("No");
        rb4.setBounds(500,520,70,30);
        rb4.setBackground(new Color(252,208,76));
        rb4.setFont(new Font("Tahoma",Font.BOLD,18));
        add(rb4);
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(rb3);
        buttonGroup1.add(rb4);

        JLabel l12 = new JLabel(" Form No");
        l12.setBounds(670,10,100,30);
        l12.setFont(new Font("Thoma",Font.BOLD,18));
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setBounds(760,10,30,30);
        l13.setFont(new Font("Thoma",Font.BOLD,18));
        add(l13);

        JButton next = new JButton("Next");
        next.setBackground(Color.black);
        next.setFont(new Font("Thoma",Font.BOLD,12));
        next.setForeground(Color.white);
        next.setBounds(570,600,160,30);
        add(next);
        next.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource()==next){

                    String Religion = (String) comboBox.getSelectedItem();
                     String Cetegory = (String) comboBox2.getSelectedItem();
                    String Income = (String) comboBox3.getSelectedItem();
                    String Education_q =(String) comboBox4.getSelectedItem();
                    String Occupation=(String) comboBox5.getSelectedItem();
                    String pan=t1.getText();
                    String Aadhar=t2.getText();
                    String Senior_c = null;
                    if (rb1.isSelected()){
                        Senior_c ="Yes";
                    }else if (rb2.isSelected()){
                        Senior_c = "No";
                    }
                    String Exesting_A = null;
                    if (rb3.isSelected()){
                        Exesting_A ="Yes";
                    }else if (rb4.isSelected()){
                        Exesting_A = "No";
                    }
                    try {
                    if (t1.getText().equals("") || t2.getText().equals("")){
                        JOptionPane.showMessageDialog(null,"Fill all the field ");
                    }else {
                        Con c1 = new Con();
                        String q = "insert into singup2 values('"+formno+"' , '" + Religion + "', '" + Cetegory + "' , '" + Income + "' , '" + Education_q + "' , '" + Occupation + "'  , '" + pan + "' , '" + Aadhar + "' , '" + Senior_c + "' , '" + Exesting_A + "')";
                        c1.statement.executeUpdate(q);
                        JOptionPane.showMessageDialog(null, "SingUp Added Successfully detail");
                        new SingUp3(formno);
                        setVisible(false);
                    }
                    }catch (Exception E){
                        E.printStackTrace();
                    }

                }
            }
        });





        setSize(850,750);
        setLayout(null);
        setLocation(300,50);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);


    }
    public static void main(String[] args) {
        new SingUp2("");

    }
}
