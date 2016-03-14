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
public class  Masaxista extends Seleccion {
    String titulacion;
    int anosExperiencia;
    
    public Masaxista(String titulacion,int anosExperiencia){
        this.anosExperiencia=anosExperiencia;
        this.titulacion=titulacion;
    }
    public void darMasaxes(){    
    }

    @Override
    public String toString() {
        return "Masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxan os masaxistas");
    }}
    