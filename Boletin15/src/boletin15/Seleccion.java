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
public class Seleccion {
    int id;
    int edad;
    String nome;
    String apelido;
    
    public void concentrarse(){
       System.out.println("Concentrase a seleccion");
      }
    public void viaxar(){
    System.out.println("Viaxa a selecion");

}

    @Override
    public String toString() {
        return "Seleccion{" + "id=" + id + ", edad=" + edad + ", nome=" + nome + ", apelido=" + apelido + '}';
    }

}