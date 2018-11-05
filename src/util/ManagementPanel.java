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
     * @code  x1 = x[0]; x2 = x[4]; fx2 = x[5];
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
   
    /**
     * Metodo para devolver o table-model e ativar o metodo da troca Dicotomia
     * Neste metodo tbm ativa os calculos de Dicotomia
     * @param x1 valor de x1 do tipo double
     * @param x2 valor de x2 do tipo double
     * @param y valor para interações
     * @param l JLabel no qual irá setar a resposta final.
     * @return a Table-model
     */
    public static DefaultTableModel isDicotomia(double x1, double x2, double y,  JLabel l){
        Dicotomia d = new Dicotomia(x1, x2);      
        getListDicotomia().isInsert(d);
        Double[] dt = {d.getX1(), d.getX2(), d.getFx1(), d.getFx2(), d.getPm(), d.getFpm(), d.getError()};
        troca(dt, y);
        l.setText(String.valueOf(resultado));
        return d.getTableModel(getListDicotomia());
    }  
   
    /**
     * Metodo para devolver o listaNewton e ativar o metodo da troca Newton
     * @code  fxi = x[3];
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
            setResultado(n.getXi());
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
     * @param l JLabel no qual irá setar a resposta final.
     * @return Table-Model
     */
    public static DefaultTableModel isNewton(double x, double y, JLabel l) {
        Newton n = new Newton(x, y);
        getListNewtonRp().isInsert(n);
        Double[] dt = {n.getN(), n.getFx(), n.getDfx(), n.getXi(), n.getXxi()};
        trocaNewton(dt, y);
        l.setText(String.valueOf(resultado));
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