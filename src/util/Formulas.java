/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.lang.Math;
import java.math.BigDecimal;

/**
 * Classe responsável pelas formulas Dicotomia e Newton Raphson
 * @author Gabriel Moreno  
 * @version 1.0
 * @since 19-10-2018
 */
public class Formulas {
    
    /**
     * Cubo calcula o valor de x ao cubo.
     * @param x O parâmetro do tipo double
     * @return retorna o valor de x³
     */
    public static double cubo(double x){
        double y = 0;
        y = Math.pow(x,3);
        y = arredonda(y);
        return y;
    }
    
    /**
     * funcDerivada é o calculo da função para o valor de x no metodo de Newton Rhapson
     * @param x1 É um parâmetro do tipo double
     * @return o valor de fn
     */
    public static double cuboDerivada(double x1) {
        double fn = 0;
        fn = (3 * (Math.pow(x1, 2)));
        fn = arredonda(fn);
        return fn;
    }

    /**
     * pm é calculo do ponto médio entre os valores de x1 e x2
     * @param x1 O parâmetro do tipo double
     * @param x2 O parâmetro do tipo double
     * @return retorna o valor medio 
     */
    public static double pm(double x1, double x2){
        double pm = 0;
        pm = (x1+x2)/2;
        pm = arredonda(pm);
        return pm;
    }
    
    /**
     * fpm é o calculo da função recebendo com valor o ponto médio
     * @param pm O parâmetro do tipo double
     * @return o valor de pm ao cubo 
     */
    public static double fpm(double pm){
        double fpm = 0;
        fpm = Math.pow(pm, 3);
        fpm = arredonda(fpm);
        return fpm;
    } 
    
    /**
     * margemErro é o módulo da subtração do segundo valor de x pelo primeiro valor de x
     * @param x1 O parâmetro do tipo double
     * @param x2 O parâmetro do tipo double
     * @return retorna a marge de erro;
     */
    public static double margemErro(double x1, double x2){
        double margemErro = 0;
        double resultado = 0;
        resultado = x1-x2;
        margemErro = Math.abs(resultado);
        margemErro = arredonda(margemErro);
        return margemErro;        
    }

    /**
     * newtonRp é o calculo para aproximar as raízes da equação recebendo camo parametros o valor inicial de x e o numero de interações
     * @param x O parâmetro do tipo object
     * @param y O parâmetro do tipo object
     * @return valor de interações ou retorna para uma recursividade
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
    
    /**
     * arredonda irá arredondar valores para duas casas depois da virgula
     * @param num recebe o valor do tipo double
     * @return num já arredondado
     */
    public static double arredonda(double num) {
        int decimalPlace = 2;
        BigDecimal bd = new BigDecimal(num);
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        num = bd.doubleValue();
        return num;
    }
}