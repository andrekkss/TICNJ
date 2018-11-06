/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import util.Formulas;
import util.ListM;

/**
 * Classe responsável por fazer as equações referentes ao método de Newton Raphson
 * @author Delmar
 * @author Cainan
 */
public class Newton {
    private double fx;
    private double dfx;
    private double xi;
    private double xxi;
    private double n;

    /**
     * Objeto instanciado Formulas
     */
    private Formulas f = new Formulas();
    
    /**
     * Método que recebe os valores necessários para realizar os calculos de Newton Raphson
     * @param x recebe um valor x do tipo double
     * @param y parâmetro y do tipo double
     */
    public Newton(double x, double y){
        setN(x);
        setFx(getN());
        setDfx(getN());
        setXi();
        setXxi(getN(), getXi());
    }
    
    /**
     * @return retorna função de x
     */
    public double getFx() {
        return fx;
    }

    /**
     * @param fx parâmetro que define o valor de função de x
     */
    public void setFx(double fx) {
        this.fx = f.cubo(fx);
    }

    /**
     * @return retorna a derivada da função de x
     */
    public double getDfx() {
        return dfx;
    }

    /**
     * @param dfx parâmetro da derivada da função x
     */
    public void setDfx(double dfx) {
        this.dfx = f.cuboDerivada(dfx);
    }

    /**
     * @return retorna o valor de Xi
     */
    public double getXi() {
        return xi;
    }

    /**
     * define o valor de Xi (n - (fx/dfx))
     */
    public void setXi() {
        this.xi = (getN() - (getFx() / getDfx()));  ;
    }

    /**
     * @return retorna o valor de Xx1
     */
    public double getXxi() {
        return xxi;
    }

    /**
     * define a margem de erro do valor Xxi
     * @param xxi parâmetro do tipo double
     * @param x parâmetro do tipo double
     */
    public void setXxi(double xxi, double x) {
        this.xxi = f.margemErro(xxi,x);
    }

    /**
     * retorna o valor de n
     */
    public double getN() {
        return n;
    }

    /**
     * @param n parâmetro n do tipo double
     */
    public void setN(double n) {
        this.n = n;
    }
   
    /**
     * Método que adiciona as colunas de interação, x1, f(x1), derivada de f(xi), e a margem de erro
     * @param l parâmetro ListM
     * @return retorna o modelo
     */
    public static DefaultTableModel getTableModel(ListM l){
        List<Newton> lista = l.getList();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Iterações"); 
        modelo.addColumn("Xi");
        modelo.addColumn("F(Xi)");
        modelo.addColumn("dF(Xi)");
        modelo.addColumn("X(i+1)");
        modelo.addColumn("X(i+1)-Xi");
        double i = 0;
        for(Newton n: lista){
            Double[] g = {i++, n.getN(), n.getFx(), n.getDfx(), n.getXi(), n.getXxi()};
            modelo.addRow(g);
        }
        return modelo;
    }
    
    /**
     * método toString que retorna o valor de n
     * @return retorna printLn
     */
    @Override
    public String toString() {
        return "[Numero: " + this.n + "]";
    }
}
