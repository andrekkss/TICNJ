package controller;

import view.PrincipalFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * repositorio https://github.com/andrekkss/TICNJ
 * Classe responsável por inicializar o programa 
 * @author André Kitano
 * @since 19-10-2018
 */
public class Principal {

    /**
     * método main
     * @param args the command line arguments
     */
    public static void main(String[] args){       
        PrincipalFrame tela = new PrincipalFrame();
        tela.setVisible(true); 
    }
}
