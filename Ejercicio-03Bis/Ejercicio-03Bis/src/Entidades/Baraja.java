/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;


/**
 *
 * @author Usuario Final
 */
public class Baraja {
    private ArrayList< Carta> carta;
    private ArrayList<Carta> usadas;

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> carta, ArrayList<Carta> usadas) {
        this.carta = carta;
        this.usadas = usadas;
    }

    public ArrayList<Carta> getCarta() {
        return carta;
    }

    public void setCarta(ArrayList<Carta> carta) {
        this.carta = carta;
    }

    public ArrayList<Carta> getUsadas() {
        return usadas;
    }

    public void setUsadas(ArrayList<Carta> usadas) {
        this.usadas = usadas;
    }

    @Override
    public String toString() {
        return "Baraja{" + "carta=" + carta + ", usadas=" + usadas + '}';
    }

}
