/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoia;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author jorge
 */
public class Vnt1 extends JFrame implements ActionListener {
    
    
    
    JTextArea txtHistoria = new JTextArea();
    JLabel lbUsuario = new JLabel ("Usuario:");
    JScrollPane scrollpane1=new JScrollPane(txtHistoria);
    
    
    ImageIcon ILogo = new ImageIcon(new ImageIcon("C:\\Users\\jorge\\Downloads\\confundido.png").getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH));
    ImageIcon IR1 = new ImageIcon(new ImageIcon("C:\\Users\\jorge\\Downloads\\circulo.png").getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH));
    ImageIcon IR2 = new ImageIcon(new ImageIcon("C:\\Users\\jorge\\Downloads\\luna-llena.png").getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH));
    ImageIcon IR3 = new ImageIcon(new ImageIcon("C:\\Users\\jorge\\Downloads\\circuloo.png").getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH));
 
    
    JButton btnR1=new JButton("Haces Residencia",IR1);
    JButton btnR2=new JButton("Haces Materias",IR2);
    JButton btnR3=new JButton("Te das de Baja",IR3);
    
    JLabel lbLogo=new JLabel(ILogo);

    
    
    public Vnt1(){
    
    super("Juego");
    setSize(700,700);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    
    BufferedImage img2=null;
    try
    {
    img2=ImageIO.read(new File("C:\\Users\\jorge\\Downloads\\camino.jpg"));
    }
    catch(IOException e)
    {
    e.printStackTrace();
    }
    Image dimg=img2.getScaledInstance(700,700,Image.SCALE_SMOOTH);
    ImageIcon imgicon=new ImageIcon(dimg);
    
    txtHistoria.disable();
    
    lbUsuario.setBounds(500,220,100,35);

    lbLogo.setBounds(250,260,200,200);

    btnR1.setBounds(50,500,200,70);
    btnR2.setBounds(250,500,200,70);
    btnR3.setBounds(450,500,200,70);
    txtHistoria.setBounds(140,100,400,150);
    
    txtHistoria.setText("(Estas en octavo semestre) Vaya que dia, tengo que ver que hare el proximo\n semestre tal vez nececito un descanso me siento cansado\n pero igual ya quiero acabar la carrera \n o podria no hacer la residencias y preparme mejor e irme del estado.");
   
    
    btnR1.addActionListener(this);
    btnR1.setActionCommand("Btn1");
    btnR2.addActionListener(this);
    btnR2.setActionCommand("Btn1");
    btnR3.addActionListener(this);
    btnR3.setActionCommand("btn1");
    
    

   this.add(btnR1);
   this.add(btnR2);
   this.add(btnR3);

   this.add(lbLogo);
   this.add(txtHistoria);
 

   
    
    
    
    
    this.add(new JLabel(imgicon));
    
    
    setVisible(true);
    show();
    
    
    
    }
    
    
    
    
    
    

    @Override
    public void actionPerformed(ActionEvent ev) {
      
        Object objeto=ev.getSource();
        
        if(objeto instanceof JButton){
            
            if(objeto==btnR1){
               
               Vnt1 ventana1=new Vnt1();
               VntFeliz ventana=new VntFeliz();
               ventana.show();
               this.setVisible(false);
               
            
            }else if(objeto==btnR2){
            
            }else if(objeto==btnR3){
            
             
                }
        
        }

        
    }
    
}
