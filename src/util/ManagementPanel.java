/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author andre
 * @since 20-10-2018
 * @version 1.0
 * 
 */
public class ManagementPanel extends javax.swing.JFrame {
    
   public void SwitchPanel(JPanel panel, Component comp){
        panel.setLayout(new BorderLayout());
        panel.add(comp);
        panel.validate();
   }

   public void transparentButton(JButton button){
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
   }
   
   public void isCalculator(){
        try{
           Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe");
        }catch(Exception e){
           System.err.println("Deu pau!" + e );
      }
   }
}