/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author Gabriel Moreno
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

