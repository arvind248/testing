/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class game extends MouseAdapter
{      
    JButton b1; 
    
          game(){
           
		JFrame f=new JFrame("simple swing");    
          	f.setSize(500,500);    
		f.setLayout(null);    
		f.setVisible(true);    
            
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
               
                b1 =new JButton("Click me");
                b1.setBounds(0,0,100,40);
                b1.addMouseListener(this);
                f.add(b1);
                
                
        
        }
        
        
          public static void main(String  args[]) {
          
          new game();
          
          
          }


         public void mouseEntered(MouseEvent e)
         {
                    Random r=new Random();
                  
                     int x= r.nextInt(400);
                     int y=r.nextInt(400);
                     System.out.println(x +" "+y);
                     b1.setBounds(x, y,100,40);
                     
                                
         }       

} 