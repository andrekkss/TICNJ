/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.math.BigDecimal;

/**
 * Classe utilitária para arredondamento de valores
 * @author Gabriel Moreno
 * @version 1.0
 * @since 19-10-2018
 */
public class Arredondamento {
    
    public static double arredonda(double num) {
        int decimalPlace = 2;
        BigDecimal bd = new BigDecimal(num);
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        num = bd.doubleValue();
        return num;
    }
}