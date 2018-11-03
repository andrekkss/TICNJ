/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * Classe responsável por fazer as equações referentes a Dicotomia 
 * @since 19-10-2018
 * @author Caique
 * @author Gabriel
 * 
 */
public class Dicotomia {
    private double x1; private double x2;
    private double fx1; private double fx2;
    private double pm; private double fpm;
    private double error;

    Formulas f = new Formulas();

    public Dicotomia(double x1, double x2){
        setX1(x1);
        setX2(x2);
        setFx1(getX1());
        setFx2(getX2());
        setPm(getX1(), getX2());
        setFpm(getPm());
        setError(getX1(), getX2());
    }
    
    /**
     * @return the x1
     */
    public double getX1() {
        return x1;
    }

    /**
     * @param x1 the x1 to set
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }

    /**
     * @return the x2
     */
    public double getX2() {
        return x2;
    }

    /**
     * @param x2 the x2 to set
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }
    
    /**
     * @return the fpm
     */
    public double getFpm() {
        return fpm;
    }

    /**
     * @param fpm the fpm to set
     */
    public void setFpm(double fpm) {
        this.fpm = f.fpm(fpm);
    }

    /**
     * @return the fx1
     */
    public double getFx1() {
        return fx1;
    }

    /**
     * @param fx1 the fx1 to set
     */
    public void setFx1(double fx1) {
        this.fx1 = f.cubo(fx1);
    }

    /**
     * @return the fx2
     */
    public double getFx2() {
        return fx2;
    }

    /**
     * @param fx2 the fx2 to set
     */
    public void setFx2(double fx2) {
        this.fx2 = f.cubo(fx2);
    }

    /**
     * @return the pm
     */
    public double getPm() {
        return pm;
    }

    /**
     * @param pm the pm to set
     */
    public void setPm(double x1, double x2) {
        this.pm = f.pm(x1, x2);
    }

    /**
     * @return the error
     */
    public double getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(double x1, double x2) {
        this.error = f.margemErro(x1, x2);
    }

    @Override
    public String toString() {
        return "[x¹: " + getX1() +
                ", x²: " + getX2() +
                ", fx1: " + getFx1() +
                ", fx2: " + getFx2() +
                ", pm: " + getPm() +
                ", fpm: " + getFpm() +
                ", error: " + getError() + "]";
    }
}
