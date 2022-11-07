/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectoia;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;



/**
 *
 * @author jorge
 */
public class ProyectoIA extends JFrame implements ActionListener {
    
    
    
    
    ImageIcon ILogo = new ImageIcon(new ImageIcon("C:\\Users\\jorge\\Downloads\\nueve (1).png").getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH));
    ImageIcon IAceptar = new ImageIcon(new ImageIcon("C:\\Users\\jorge\\Downloads\\boton-de-play.png").getImage().getScaledInstance(25,25, Image.SCALE_SMOOTH));
    ImageIcon ICancelar = new ImageIcon(new ImageIcon("C:\\Users\\jorge\\Downloads\\error.png").getImage().getScaledInstance(20,20, Image.SCALE_SMOOTH));
    
    JButton btnAceptar=new JButton("Jugar",IAceptar);
    JButton btnCancelar=new JButton("Salir",ICancelar);
    
    JLabel lbLogo=new JLabel(ILogo);
    
    
    public ProyectoIA(){
    
    
    super("Proyecto IA (Bandernacht)");
    setSize(350,350);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    
   
  
    BufferedImage img2=null;
    try
    {
    img2=ImageIO.read(new File("C:\\Users\\jorge\\Downloads\\tec.jpg"));
    }
    catch(IOException e)
    {
    e.printStackTrace();
    }
    Image dimg=img2.getScaledInstance(350,350,Image.SCALE_SMOOTH);
    ImageIcon imgicon=new ImageIcon(dimg);
    
    lbLogo.setBounds(80,35,200,200);
    
    btnAceptar.setBounds(50,300,110,35);
    btnCancelar.setBounds(170,300,110,35);
   
   
    
    btnAceptar.addActionListener(this);
    btnAceptar.setActionCommand("Btn1");
    btnCancelar.addActionListener(this);
    btnCancelar.setActionCommand("Btn1");
  
     
   this.add(lbLogo);
   this.add(btnAceptar);
   this.add(btnCancelar);
 
   this.add(new JLabel(imgicon));
   
   
   
   setVisible(true);
    show();
    
    
    
    
    
    
    }

    public static void main(String[] args) {
        
   
        ProyectoIA cl=new ProyectoIA();
       cl.pack();
       cl.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ev) {
        Object objeto=ev.getSource();
        
        if(objeto instanceof JButton){
            
            if(objeto==btnCancelar){
   
                JOptionPane.showMessageDialog(null, "Para que lo abres si no vas a jugar?");
                ProyectoIA cl = new ProyectoIA(); 
                cl.dispose();

            
            }else if(objeto==btnAceptar){
            
             JOptionPane.showMessageDialog(null, "Empieza el juego");
             
             Vnt1 Ventana = new Vnt1();
             Ventana.show();
                }
        
        }
        
        
    }
}

