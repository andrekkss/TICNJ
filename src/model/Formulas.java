/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.lang.Math;

/**
 * Classe responsável pelas formulas Dicotomia e Newton Raphson
 * @author Gabriel Moreno
 * @version 1.0
 * @since 19-10-2018
 */
public class Formulas {
    
    public  double cubo(double x){
        double y = 0;
        y = Math.pow(x,3);
        return y;
    }
    
    /**
     * pm é calculo do ponto médio entre os valores de x1 e x2
     * @param x1 O parâmetro do tipo object
     * @param x2 O parâmetro do tipo object
     *
     */
    public static double pm(double x1,double x2){
        double pm = 0;
        pm = (x1+x2)/2;
        return pm;
    }
    /**
     * fpm é o calculo da função recebendo com valor o ponto médio
     * @param pm O parâmetro do tipo object
     *
     */
    public static double fpm(double pm){
        double fpm = 0;
        fpm = Math.pow(pm, 3);
        return fpm;
    } 
    
    /**
     * margemErro é o módulo da subtração do segundo valor de x pelo primeiro valor de x
     * @param x1
     * @param x2
     *
     */
    public static double margemErro(double x1, double x2){
        double margemErro = 0;
        double resultado = 0;
        resultado = x1-x2;
        margemErro = Math.abs(resultado);
        return margemErro;        
    }

    /**
     * newtonRp é o calculo para aproximar as raízes da equação recebendo camo parametros o valor inicial de x e o numero de interações
     * @param x O parâmetro do tipo object
     * @param y O parâmetro do tipo object
     *
     */
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
