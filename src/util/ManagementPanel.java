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
 * Classe para gerenciar o component PCalculos.java
 * @author André Kitano
 * @since 20-10-2018
 * @version 1.0
 */
public class ManagementPanel{
    private static ListM listDicotomia = new ListM();
    private static ListM listNewtonRp = new ListM();
    private static double resultado;
    private static double resultadoX1;
    private static double resultadoX2;
    private static double resultadoX3;

    /**
     * @param aResultadoX1 o resultadoX1 
     */
    public static void setResultadoX1(double aResultadoX1) {
        resultadoX1 = aResultadoX1;
    }

    /**
     * @param aResultadoX2 o resultadoX2 
     */
    public static void setResultadoX2(double aResultadoX2) {
        resultadoX2 = aResultadoX2;
    }

    /**
     * @param aResultadoX3 o resultadoX3
     */
    public static void setResultadoX3(double aResultadoX3) {
        resultadoX3 = aResultadoX3;
    }
 
    /**
     * Método para retorno da lista trabalhada no calculo de Dicotomia
     * @return a listDicotomia
     */
    public static ListM getListDicotomia() {
        return listDicotomia;
    }

    /**
     * Método para retorno da lista trabalhada no calculo de Dicotomia
     * @return a listNewtonRp
     */
    public static ListM getListNewtonRp() {
        return listNewtonRp;
    }
    
    /**
     * seta o resultado de dicotomia
     * @param aproxi seta a aproximação
     * @param rx1 seta a resposta de x1
     * @param rx2 seta a resposta de x2
     */
    public void getResultDicotomia(JLabel aproxi, JLabel rx1, JLabel rx2){
        aproxi.setText(String.valueOf(resultado));
        rx1.setText(String.valueOf(resultadoX1));
        rx2.setText(String.valueOf(resultadoX2));
    }
    
    /**
     * metodo para setar o resultado do Newton
     * @param aprox seta aproximação
     * @param x1 seta x1
     */
    public void getResultNewton(JLabel aprox, JLabel x1){
        aprox.setText(String.valueOf(resultado));
        x1.setText(String.valueOf(resultadoX3));
    }

    /**
     * Metodo para setar o resultado dos calculos
     * @param aResultado recebe resultado
     */
    public static void setResultado(double aResultado) {
        resultado = aResultado;
    }
   
    /**
     * Metodo para gerenciar a troca dos paineis
     * @param panel recebe o painel
     * @param comp recebe o component para inserir
     */
    public void SwitchPanel(JPanel panel, Component comp){
        panel.removeAll();
        panel.setLayout(new BorderLayout());
        panel.add(comp);
        panel.validate();
    }

    /**
     * Metodo para deixar os Botoes transparentes
     * @param button recebe o Botao no qual irá receber o layout
     */
    public void transparentButton(JButton button){
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
    }
   
    /**
     * Método para reconhecimento da troca em Dicotomia, no qual devolve os valores para um novo objeto e insere na lista
     * @param x recebe um array de objeto do tipo Double
     * @param y recebe a quantidade de interações
     * @return 0 para finalizar o o metodo
     * @version 0.5
     */
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
                setResultadoX1(d.getX1());
                setResultadoX2(d.getX2());
                getListDicotomia().isInsert(d);
                return troca(vl, y - 1);
            } else {
                Double x1, x2, fx1;
                x1 = x[4]; x2 = x[1];
                fx1 = x[5];
                Dicotomia d = new Dicotomia(x2, x1, fx1, false);
                Double[] vl = {d.getX1(),d.getX2(),d.getFx1(),d.getFx2(),d.getPm(),d.getFpm(),d.getError()};
                setResultado(d.getError());
                setResultadoX1(d.getX1());
                setResultadoX2(d.getX2());
                getListDicotomia().isInsert(d);
                return troca(vl, y - 1);
            }
        }
        return 0;
    }
   
    /**
     * Metodo para devolver o table-model e ativar o metodo da troca Dicotomia
     * Neste metodo tbm ativa os calculos de Dicotomia
     * @param x1 valor de x1 do tipo double
     * @param x2 valor de x2 do tipo double
     * @param y valor para interações
     * @return a Table-model
     */
    public static DefaultTableModel isDicotomia(double x1, double x2, double y){
        Dicotomia d = new Dicotomia(x1, x2);      
        getListDicotomia().isInsert(d);
        Double[] dt = {d.getX1(), d.getX2(), d.getFx1(), d.getFx2(), d.getPm(), d.getFpm(), d.getError()};
        troca(dt, y);
        return d.getTableModel(getListDicotomia());
    }  
   
    /**
     * Metodo para devolver o listaNewton e ativar o metodo da troca Newton
     * @param x recebe um array de objeto do tipo Double
     * @param y recebe a quantidade de interações
     * @return 0 para finalizar o metodo
     */
    public static double trocaNewton(Double[] x, double y) {
        if (y == 0) {
            getListNewtonRp().isList();
        } else {
            Double fxi;
            fxi = x[3];
            Newton n = new Newton(fxi, y);
            Double[] vl = {n.getN(), n.getFx(), n.getDfx(), n.getXi(), n.getXxi()};
            setResultado(n.getXxi());
            setResultadoX3(n.getXi());
            getListNewtonRp().isInsert(n);
            return trocaNewton(vl, y - 1);
        }
        return 0;
    }
   
    /**
     * Metodo para devolver o table-model e ativar o metodo da troca Newton
     * Neste metodo tbm ativa os calculos de Newton
     * @param x recebe o valor do tipo double
     * @param y recebe a quantidade de interações
     * @return Table-Model
     */
    public static DefaultTableModel isNewton(double x, double y) {
        Newton n = new Newton(x, y);
        getListNewtonRp().isInsert(n);
        Double[] dt = {n.getN(), n.getFx(), n.getDfx(), n.getXi(), n.getXxi()};
        trocaNewton(dt, y);
        return n.getTableModel(getListNewtonRp());
    }
   
    /**
     * Método para remover e limpar listas e o Table-model
     * esse metodo roda apos toda inserção ou apos o click no botao "Limpar"
     * @param dm recebe o Table
     * @param list recebe a lista
     */
    public void removeAllRows(JTable dm, String list){
       if(list == "Dicotomia"){ getListDicotomia().getList().clear(); }else{ getListNewtonRp().getList().clear(); }
       DefaultTableModel model = (DefaultTableModel) dm.getModel();
        while(model.getRowCount() > 0){
            for(int i = 0; i< model.getRowCount(); i++){
                model.removeRow(i);
            }
        }
    }
 
    /**
     * Metodo para chamar a calculadora do Windows
     */
    public void isCalculator(){
        try{
           Runtime.getRuntime().exec("C:\\Windows\\System32\\calc.exe");
        }catch(Exception e){
           System.out.println(e);
      }
   }
}