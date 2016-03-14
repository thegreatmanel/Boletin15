/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author El mingas
 */
public class Libreria {
 ArrayList<Libro> lectura =new ArrayList<Libro>();
 
 public void engadirLibro(Libro l){
     lectura.add(l);
 }
 public void vender(){
    int borrar=Integer.parseInt(JOptionPane.showInputDialog(null, "Posicion do elemento que desexa borrar"));
     lectura.remove(borrar);
 }

 public String amosar(){
        Collections.sort(lectura);
          String z="";
          for(Libro l:lectura){
              z +="\n" + l.toString();
          }
          return z;
         }
 public void borrar(){
     for(int i=0;i<lectura.size();i++){
         if(lectura.get(i).getNumeroUnidades()<1){
             lectura.remove(i);
         }}}
 public void Consultar(){
     String busca=JOptionPane.showInputDialog("Introduce Tiluto desexado");
     for(int i=0;i<lectura.size();i++){
         if(lectura.get(i).getTitulo().equalsIgnoreCase(busca)){
             JOptionPane.showMessageDialog(null,lectura.get(i).toString());
         }
     }
 }        
     
     
 
 }
 
 