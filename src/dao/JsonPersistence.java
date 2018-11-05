/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.google.gson.*;
import java.io.*;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import model.*;
import util.ListM;

/**
 *
 * @author andre
 */
public class JsonPersistence{
   private Gson gson = new GsonBuilder().setLenient().create();
   static private ArrayList<Dicotomia> listaDicotomia;
   static private ArrayList<Newton> listaNewton;

   /**
    * @param listaDicotomia the listaDicotomia to set
    */
   public static void setListaDicotomia(ListM l) {
       l.isList();
       listaDicotomia = l.getList();
   }

   /**
    * @param listaNewton the listaNewton to set
    */
   public static void setListaNewton(ListM l) {
        listaNewton = l.getList();
   }
    
   public void writeJSON(String arquivo) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo, true));
        if(arquivo == "json/historicod.json"){
            Type type = new TypeToken<ArrayList<Dicotomia>>(){}.getType();
            String json = gson.toJson(listaDicotomia, type);
            writer.write(json);
            listaDicotomia.clear();
        } else {
            Type type = new TypeToken<ArrayList<Newton>>(){}.getType();
            String json = gson.toJson(listaNewton, type);
            writer.write(json);
            listaNewton.clear();
        }   
        writer.close();
   }
   
    public DefaultTableModel montaTabelaDicotomia() throws FileNotFoundException{
        Type type = new TypeToken<List<Dicotomia>>(){}.getType(); 
        Reader reader = new FileReader("json/historicod.json");
        List<Dicotomia> listad = gson.fromJson(reader, type);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("X1"); modelo.addColumn("f(X1)");
        modelo.addColumn("X2"); modelo.addColumn("f(x2)");
        modelo.addColumn("PM = X1+X2/2"); modelo.addColumn("f(PM)");
        modelo.addColumn("|X2 - X1|");
        for(Dicotomia d: listad){
            Double[] g = {d.getX1(), d.getFx1(), d.getX2(), d.getFx2(), d.getPm(), d.getFpm(), d.getError()};
            modelo.addRow(g);
        }
        return modelo;
    }
    
     public DefaultTableModel montaTabelaNewton() throws FileNotFoundException{
        Type type = new TypeToken<List<Newton>>(){}.getType(); 
        Reader reader = new FileReader("json/historicon.json");
        List<Newton> listan = gson.fromJson(reader, type);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Iterações"); modelo.addColumn("dF(Xi)");
        modelo.addColumn("Xi"); modelo.addColumn("X(i+1)");
        modelo.addColumn("F(Xi)"); modelo.addColumn("X(i+1)-Xi");
        double i = 0;
        for(Newton n: listan){
            Double[] g = {i++, n.getN(), n.getFx(), n.getDfx(), n.getXi(), n.getXxi()};
            modelo.addRow(g);
        }
        return modelo;
    }
     
     
}