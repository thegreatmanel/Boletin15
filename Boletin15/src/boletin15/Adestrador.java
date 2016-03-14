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
public class Adestrador extends Seleccion {
    
    String idFederacion;
    public Adestrador(String idFederacion){
        this.idFederacion=idFederacion;
    }

    public void dirixirPartido(){  
    }
    public void dirixirAdestramento(){   
    }

    @Override
    public String toString() {
        return "Adestrador{" + "idFederacion=" + idFederacion + '}';
    }

    @Override
    public void viaxar() {
       System.out.println("Viaxan os adestradores");
    }


}