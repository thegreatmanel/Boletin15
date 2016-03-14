/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

/**
 *
 * @author Brais
 */
public class Xogador extends Seleccion {
    int dorsal;
    String demarcacion;
    
    public Xogador(int dorsal,String demarcacion){
        this.dorsal=dorsal;
        this.demarcacion=demarcacion;             
    }

    public void xogarPartido(){   
    }
    public void entrenar(){     
    }

    @Override
    public String toString() {
        return "Xogador{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

  @Override
public void viaxar(){
   System.out.println("Viaxan os xogadores");
}
}