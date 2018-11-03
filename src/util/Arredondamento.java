/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Classe utilitária para arredondamento de valores
 * @author Gabriel Moreno
 * @version 1.0
 * @since 19-10-2018
 */
public class Arredondamento {
    
    public void arredonda(double num){
	int decimalPlace = 2;
	BigDecimal bd = new BigDecimal(num);
	bd = bd.setScale(decimalPlace,BigDecimal.ROUND_HALF_UP);
	num = bd.doubleValue();
	System.out.println(num);
    }
    
}

