/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import model.Dicotomia;
import model.Newton;

/**
 *
 * @author andre
 * @since 20-10-2018
 * @version 1.0
 * 
 */
public class ManagementPanel extends javax.swing.JFrame {
   private static ListM listDicotomia = new ListM();
   
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
   
   public static double troca(Double[] x, double y) {
        if (y == 0) {
            listDicotomia.isList();
        } else {
            if (x[5] > 0) {
                Double x1, x2, fx2;
                x1 = x[0]; x2 = x[4];
                fx2 = x[5];
                Dicotomia d = new Dicotomia(x1, x2, fx2, true);
                Double[] vl = {d.getX1(),d.getX2(),d.getFx1(),d.getFx2(),d.getPm(),d.getFpm(),d.getError()};
                listDicotomia.isInsert(d);
                return troca(vl, y - 1);
            } else {
                Double x1, x2, fx1;
                x1 = x[4]; x2 = x[1];
                fx1 = x[5];
                Dicotomia d = new Dicotomia(x2, x1, fx1, false);
                Double[] vl = {d.getX1(),d.getX2(),d.getFx1(),d.getFx2(),d.getPm(),d.getFpm(),d.getError()};
                listDicotomia.isInsert(d);
                return troca(vl, y - 1);
            }
        }
        return 0;
    }
   
   public static DefaultTableModel isDicotomia(double x1, double x2, double y){
        Dicotomia d = new Dicotomia(x1, x2);      
        listDicotomia.isInsert(d);
        Double[] dt = {d.getX1(), d.getX2(), d.getFx1(), d.getFx2(), d.getPm(), d.getFpm(), d.getError()};
        troca(dt, y);
        return d.getTableModel(listDicotomia);
   }  
    
   public static DefaultTableModel isNewton(double x, double y){
       Newton n = new Newton(x, y);
       ListM l = new ListM();
       l.isInsert(n);
       int i;
       for(i=0; i<=y; i++){
       }
       return n.getTableModel(l);
   }
   
   public void removeAllRows(JTable dm){
     DefaultTableModel dtm = (DefaultTableModel) dm.getModel();
     dtm.setRowCount(0);
   }
 
   public void isCalculator(){
        try{
           Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe");
        }catch(Exception e){
           System.err.println("Deu pau!" + e );
      }
   }
}