/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Predator
 */
public class Sumusinggui extends JFrame implements ActionListener{
 
     public static JButton b;
     public static JLabel l1,l2,l3;
     public static JTextField t1,t2,t3;
    
    Sumusinggui()
    {
        this.setSize(500,500);
        this.setTitle("Sum of two number");
        this.setLocation(500,200);
        this.getContentPane().setBackground(Color.YELLOW);
        
        this.setLayout(null);
        
        l1=new JLabel("Enter First Number");
        l1.setFont(new Font ("Raleway",Font.BOLD,22));
        t1=new JTextField(10000);
        l1.setBounds(150,20,220,30);
        t1.setBounds(150,70,200,30);
        
        l2=new JLabel("Enter Second Number");
        l2.setFont(new Font ("Raleway",Font.BOLD,20));
        t2=new JTextField(10000);
        l2.setBounds(150,120,220,30);
        t2.setBounds(150,170,200,30);
        
        b=new JButton("Sum");
        b.setBounds(150,220,200,30);
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.addActionListener(this);
         
        l3=new JLabel("Sum of Two Number ");
        l3.setFont(new Font ("Raleway",Font.BOLD,21));
        t3=new JTextField(10000);
        l3.setBounds(150,270,220,30);
        t3.setBounds(150,320,200,30);
        
        
        
        
        
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(t1);
        this.add(t2);
        this.add(t3);
        this.add(b);
        
        this.setVisible(true);
        
        
        
        
    
    
    }
    public void actionPerformed(ActionEvent ae)
    {
        int x,y,sum;
        x=Integer.parseInt(t1.getText());
        y=Integer.parseInt(t2.getText());
        
        sum=x+y;
        
        t3.setText(String.valueOf(sum));
    }
    
    public static void main(String[] args)
    {
        
       Sumusinggui obj= new Sumusinggui();
    }
    
}
