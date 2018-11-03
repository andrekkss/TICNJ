package controller;

import model.Dicotomia;
import view.PrincipalFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
        PrincipalFrame tela = new PrincipalFrame();
        tela.setVisible(true);  */
        
        Dicotomia d = new Dicotomia(5.0, 2.0);
        System.out.println(d.toString());
    }
}
