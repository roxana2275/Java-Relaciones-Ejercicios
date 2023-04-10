/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cine {
    private ArrayList<Asiento> sala;
    private double precio;
    private Pelicula pelicula;

    public Cine(ArrayList<Asiento> sala, double precio, Pelicula pelicula) {
        this.sala = sala;
        this.precio = precio;
        this.pelicula = pelicula;
    }

    public Cine() {
    }

    public ArrayList<Asiento> getSala() {
        return sala;
    }

    public void setSala(ArrayList<Asiento> sala) {
        this.sala = sala;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Cine{" + "sala=" + sala + ", precio=" + precio + ", pelicula=" + pelicula + '}';
    }


    
}
