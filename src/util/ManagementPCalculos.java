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
public class ManagementPCalculos{
    private static ListM listDicotomia = new ListM();
    private static ListM listNewtonRp = new ListM();
    private static double resultado;

    /**
     * @return the listDicotomia
     */
    public static ListM getListDicotomia() {
        return listDicotomia;
    }

    /**
     * @return the listNewtonRp
     */
    public static ListM getListNewtonRp() {
        return listNewtonRp;
    }

    public static void setResultado(double aResultado) {
        resultado = aResultado;
    }
   
   public void SwitchPanel(JPanel panel, Component comp){
        panel.removeAll();
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
            getListDicotomia().isList();
        } else {
            if (x[5] > 0) {
                Double x1, x2, fx2;
                x1 = x[0]; x2 = x[4];
                fx2 = x[5];
                Dicotomia d = new Dicotomia(x1, x2, fx2, true);
                Double[] vl = {d.getX1(),d.getX2(),d.getFx1(),d.getFx2(),d.getPm(),d.getFpm(),d.getError()};
                setResultado(d.getError());
                getListDicotomia().isInsert(d);
                return troca(vl, y - 1);
            } else {
                Double x1, x2, fx1;
                x1 = x[4]; x2 = x[1];
                fx1 = x[5];
                Dicotomia d = new Dicotomia(x2, x1, fx1, false);
                Double[] vl = {d.getX1(),d.getX2(),d.getFx1(),d.getFx2(),d.getPm(),d.getFpm(),d.getError()};
                setResultado(d.getError());
                getListDicotomia().isInsert(d);
                return troca(vl, y - 1);
            }
        }
        return 0;
    }
   
   public static DefaultTableModel isDicotomia(double x1, double x2, double y,  JLabel l){
        Dicotomia d = new Dicotomia(x1, x2);      
        getListDicotomia().isInsert(d);
        Double[] dt = {d.getX1(), d.getX2(), d.getFx1(), d.getFx2(), d.getPm(), d.getFpm(), d.getError()};
        troca(dt, y);
        l.setText(String.valueOf(resultado));
        return d.getTableModel(getListDicotomia());
   }  
   
   public static double trocaNewton(Double[] x, double y) {
        if (y == 0) {
            getListNewtonRp().isList();
        } else {
            Double fxi;
            fxi = x[3];
            Newton n = new Newton(fxi, y);
            Double[] vl = {n.getN(), n.getFx(), n.getDfx(), n.getXi(), n.getXxi()};
            setResultado(n.getXi());
            getListNewtonRp().isInsert(n);
            return trocaNewton(vl, y - 1);
        }
        return 0;
    }
   
   public static DefaultTableModel isNewton(double x, double y, JLabel l) {
        Newton n = new Newton(x, y);
        getListNewtonRp().isInsert(n);
        Double[] dt = {n.getN(), n.getFx(), n.getDfx(), n.getXi(), n.getXxi()};
        trocaNewton(dt, y);
        l.setText(String.valueOf(resultado));
        return n.getTableModel(getListNewtonRp());
    }
   
   public void removeAllRows(JTable dm, String list){
       if(list == "Dicotomia"){ getListDicotomia().getList().clear(); }else{ getListNewtonRp().getList().clear(); }
       DefaultTableModel model = (DefaultTableModel) dm.getModel();
        while(model.getRowCount() > 0){
            for(int i = 0; i< model.getRowCount(); i++){
                model.removeRow(i);
            }
        }
   }
 
   public void isCalculator(){
        try{
           Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe");
        }catch(Exception e){
           System.err.println("Deu pau!" + e );
      }
   }
}