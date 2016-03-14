package boletin22;

import java.util.Objects;

public class Libreria {
    private String nomeLibre;
    private String Autor;
    private int precio;
    private double unidades;

    public Libreria(String nomeLibre, String Autor, int precio, double unidades) {
        this.nomeLibre = nomeLibre;
        this.Autor = Autor;
        this.precio = precio;
        this.unidades = unidades;
        
    }

    @Override
    public String toString() {
        return "Libreria{" + "nomeLibre=" + nomeLibre + ", Autor=" + Autor + ", precio=" + precio + ", unidades=" + unidades + '}';
    }
    
    }