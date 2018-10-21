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
}
