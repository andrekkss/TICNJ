/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
/**
 *
 * @author andre
 */
public class List<T> {
    ArrayList<T> list = new ArrayList<T>();
    
    public List (){}

    public void isInsert(T t){ 
        list.add(t); 
    }
    
    public void isEmpty(){ 
        if(list.isEmpty()){
            System.out.println("Lista está vazia");
        }else{
            System.out.println("Lista não está vazia");
        }
    }
}
