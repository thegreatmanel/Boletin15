/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin21;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author balva
 */
public class OrdenarPablabras {
   private final String[] palabras=new String[5];
   public void cargarArray(){;
       for(int i =0;i<palabras.length;i++){
           palabras[i]=JOptionPane.showInputDialog("Palabras " +(i+1) +":");
       }
   }
   public void ordenarArray(){
       Arrays.sort(palabras);
   }
   public void  gardarFicheiro(){
       ordenarArray();
       PrintWriter escritor=null;
       try{
           escritor = new PrintWriter(new File("src/boletin_21/comotesalgadelapolla.txt"));
           for(int i =0;i<palabras.length;i++){
               escritor.println(i+1 +" " +palabras[i]);
           }
       }catch(FileNotFoundException e){
           JOptionPane.showMessageDialog(null,"Archivo non encontrados");
       }finally{
           escritor.close();
       }
   }
}
