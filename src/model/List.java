/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 * Essa classe para gerenciamento da ArrayList no qual irá receber os parametros dinamicamente
 * @author andre
 * @version 1.0
 * @since 19-10-2018
 */
public class List<T>{
    private ArrayList<T> list = new ArrayList<T>();

    /**
     * Essa função faz a inserção da lista
     * @param t O parametro do tipo Object
     */
    public void isInsert(T t){ 
        list.add(t); 
    }
    
    /**
     * IsList ira listar o conteudo da lista
     */
    public void isList(){
        for(T t: list){
            System.out.println(t);
        }
    }
    /**
     * Essa função faz o delete de um dado na lista
     * @param t O parametro do tipo Object
     */
    public void isDelete(T t){
        list.remove(t);
    }
    
    /**
     * Essa função checa se a lista ta vazia
     */
    public void isEmpty(){ 
        if(list.isEmpty()){
            System.out.println("Lista está vazia");
        }else{
            System.out.println("Lista não está vazia");
        }
    }
}
