
package quiz.application;


import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{
    
    JButton rules,exit;
    JTextField tfname;
    
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading=new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Pacifico",Font.BOLD,40));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel name=new JLabel("Enter your name");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
        name.setForeground(Color.BLUE);
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(735,200,300,20);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        rules=new JButton("Rules");
        rules.setBounds(735,270,120,25);
        rules.setBackground(Color.BLUE);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        exit=new JButton("Exit");
        exit.setBounds(915,270,120,25);
        exit.setBackground(Color.BLUE);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);
        
        
        
	setSize(1200,500);
	setLocation(200,150);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== rules){
            String name=tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource()==exit){
            setVisible(false);
        }
        
    }

    
    public static void main(String[] args){
        new Login();
    }
    
}