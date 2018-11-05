/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.*;

/**
 * Essa classe é gerenciamento da ArrayList no qual irá receber os parametros dinamicamente
 * @author André Kitano
 * @version 1.0
 * @since 19-10-2018
 */
public class ListM<T>{
    private ArrayList<T> list = new ArrayList<T>();

    /**
     * Metodo para obter a lista do tipo objeto
     * @return the list
     */
    public ArrayList<T> getList() {
        return list;
    }
    
    /**
     * isInsert faz a inserção da lista
     * @param t O parametro do tipo Object
     */
    public void isInsert(T t){ 
        getList().add(t); 
    }
    
    /**
     * IsList ira listar o conteudo da lista
     */
    public void isList(){
        for(T t: getList()){
             System.out.println(t);
        }
    }
    
    /**
     * isDelete faz o delete de um dado na lista
     * @param t O parametro do tipo Object
     */
    public void isDelete(T t){
        getList().remove(t);
    }
    
    /**
     * isEmpty checa se a lista ta vazia
     */
    public void isEmpty(){ 
        if(getList().isEmpty()){
            System.out.println("Lista está vazia");
        }else{
            System.out.println("Lista não está vazia");
        }
    }
}
