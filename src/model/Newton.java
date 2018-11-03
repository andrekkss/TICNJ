/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Delmar
 * @author Cainan
 * 
 */
public class Newton {

    private double n;
    
    /** 
     * Método construtor
     * @param n 
     */
    public Newton(double n){
        setN(n);
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
    
    
    public void derivada (){
        
    }
    
    @Override
    public String toString() {
        return "[Numero: " + this.n + "]";
    }
}
