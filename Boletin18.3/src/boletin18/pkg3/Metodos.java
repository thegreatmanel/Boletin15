/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin18_2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author nlopezjimenez
 */
public class Metodos {
    int notas[]=new int[2];
    String nombres[]= new String[2];
    String nome;
    
    
    
    public void CargarArray(){
        Scanner aux = new Scanner(System.in);
        for(int i=0;i<notas.length;i++){
            System.out.print("Nombre del alumno : ");
            nombres[i]=aux.next();
            System.out.print("Nota del alumno : ");
            notas[i]=aux.nextInt();
      
        }
        
    }
    public void aprobadosSuspensos(){
        int contador_aprobado=0;
        int contador_suspenso=0;
        
         for(int i=0;i<notas.length;i++){
            if(notas[i]>=5){
                contador_aprobado++;
                
    
            }else{
                contador_suspenso++;
            }
            
    }
         JOptionPane.showMessageDialog(null,"Numero de aprobados ="+contador_aprobado);
         JOptionPane.showMessageDialog(null,"Numero de suspensos ="+contador_suspenso);
    }
    public void NotaMedia(){
         int acum_notas=0;
        for(int i =0;i<notas.length;i++){
            acum_notas+=notas[i];
        }
        JOptionPane.showMessageDialog(null,"Media de clase: " + acum_notas/notas.length);
    }
    public void notaAlta(){
        int notaAlta=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>notaAlta){
                notaAlta=notas[i];
            }
        }
        JOptionPane.showMessageDialog(null,"Nota más alta: " + notaAlta);
    }
   
       
    
    public void visualizarNotaConcreta(){
        System.out.print("Alumno para consultar nota:");
        Scanner obx = new Scanner(System.in);
        String nome = obx.next();
        for(int i=0;i<nombres.length;i++){
            if(nome.equalsIgnoreCase(nombres[i])){
            System.out.print("La nota del alumno : " + nombres[i] + " es de " + notas[i]);
        }
    }
    }
    public void listaAprobados(){
         for(int i=0;i<notas.length;i++){
            if(notas[i]>=5){
                System.out.print(" Alumnos aprobados : "+nombres[i]);
            }
    }
}
    public void listaCreciente(){
        int i,aux,j;
        String y;
        for(i=0;i<nombres.length;i++){
            for(aux=i+1;aux<notas.length;aux++){
                if(notas[i]>notas[aux]){
                    j=notas[i];
                    notas[i]=notas[aux];
                    notas[aux]=notas[j];
                    
                    y=nombres[i];
                    nombres[i]=nombres[j];
                    nombres[j]=y;
                }
            }
        }}
}



