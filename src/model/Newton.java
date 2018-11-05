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
 *
 * @author Delmar
 * @author Cainan
 * 
 */
public class Newton {
    private double fx;
    private double dfx;
    private double xi;
    private double xxi;
    private double n;

    private Formulas f = new Formulas();
    
    public Newton(double x, double y){
        setN(x);
        setFx(getN());
        setDfx(getN());
        setXi();
        setXxi(getN(), getXi());
    }
    
    /**
     * 
     * @return the fx
     */
    public double getFx() {
        return fx;
    }

    /**
     * @param fx the fx to set
     */
    public void setFx(double fx) {
        this.fx = f.cubo(fx);
    }

    /**
     * @return the dfx
     */
    public double getDfx() {
        return dfx;
    }

    /**
     * @param dfx the dfx to set
     */
    public void setDfx(double dfx) {
        this.dfx = f.cuboDerivada(dfx);
    }

    /**
     * @return the xi
     */
    public double getXi() {
        return xi;
    }

    /**
     * @param xi the xi to set
     */
    public void setXi() {
        this.xi = (getN() - (getFx() / getDfx()));  ;
    }

    /**
     * @return the xxi
     */
    public double getXxi() {
        return xxi;
    }

    /**
     * @param xxi the xxi to set
     */
    public void setXxi(double xxi, double x) {
        this.xxi = f.margemErro(xxi,x);
    }

    /** Getters e Setters
     * @return the n
     */
    public double getN() {
        return n;
    }

    /**
     * @param n the n to set
     */
    public void setN(double n) {
        this.n = n;
    }
   
    public static DefaultTableModel getTableModel(ListM l){
        List<Newton> lista = l.getList();
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Iterações"); modelo.addColumn("dF(Xi)");
        modelo.addColumn("Xi");modelo.addColumn("X(i+1)");
        modelo.addColumn("F(Xi)"); modelo.addColumn("X(i+1)-Xi");
        double i = 0;
        for(Newton n: lista){
            Double[] g = {i++, n.getN(), n.getFx(), n.getDfx(), n.getXi(), n.getXxi()};
            modelo.addRow(g);
        }
        return modelo;
    }
    
    @Override
    public String toString() {
        return "[Numero: " + this.n + "]";
    }
}
