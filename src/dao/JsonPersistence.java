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
 * Classe responsavel pelo JSON para guardar no historico.
 * @author André Kitano
 * @since 05-11-2018
 * @version 1.0
 */
public class JsonPersistence{
   private Gson gson = new GsonBuilder().setLenient().create();
   static private ArrayList<Dicotomia> listaDicotomia;
   static private ArrayList<Newton> listaNewton;

   /**
    * Seta ListaDicotomia através de um objeto do tipo ListM
    * @param l objeto herda a lista do tipo Objeto
    */
   public static void setListaDicotomia(ListM l) {
       l.isList();
       listaDicotomia = l.getList();
   }

   /**
    * Seta ListaNewton através de um objeto do tipo ListM
    * @param  l objeto herda a lista do tipo Objeto
    */
   public static void setListaNewton(ListM l) {
        listaNewton = l.getList();
   }
    
   /**
    * Faz a escrita no arquivo json no qual usára a lista do tipo Dicotomia ou Newton
    * @param arquivo receberá nesta variavel o caminho do arquivo
    * @throws IOException caso o arquivo JSON não exista ou arquivo incopativel dispara a Exeception
    */
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
   
   /**
    * Faz a leitura do arquivo JSON historyd(dicotomia) e devolve uma table-model
    * @return modelo no qual é um table-model
    * @throws FileNotFoundException caso o arquivo JSON não seja encontrado dispara a Exeception
    */
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
    
    /**
    * Faz a leitura do arquivo JSON historyn(Newton) e devolve uma table-model
    * @return modelo no qual é um table-model
    * @throws FileNotFoundException caso o arquivo JSON não seja encontrado dispara a Exeception
    */
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