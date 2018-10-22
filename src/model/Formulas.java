/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.lang.Math;

/**
 * 
 * @author Gabriel Moreno
 * 
 */
public class Formulas {
    
    public  double fx1(double x1){
        double fx1 = 0;
        fx1 = Math.pow(x1,3);
        return fx1;
    }
    
    public static double fx2(double x2){
        double fx2 = 0;
        fx2 = Math.pow(x2, 3);
        return fx2;
    }
    
    public static double pm(double x1,double x2){
        double pm = 0;
        pm = (x1+x2)/2;
        return pm;
    }
    
    public static double fpm(double pm){
        double fpm = 0;
        fpm = Math.pow(pm, 3);
        return fpm;
    } 
    
    public static double margemErro(double x1, double x2){
        double margemErro = 0;
        double resultado = 0;
        resultado = x1-x2;
        margemErro = Math.abs(resultado);
        return margemErro;        
    }
    
    public static double newtonRp(double x, int y) {

        if (y < 0) {
            return x;
        } else {
            double n = 0;

            n = (x - (Math.pow(x, 3) / (3 * (Math.pow(x, 2)))));

            return newtonRp(n,y-1);
        }
    }
}
