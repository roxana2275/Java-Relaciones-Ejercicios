/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enumeraciones.Columnas;
import enumeraciones.Filas;

/**
 *
 * @author Usuario
 */
public class Asiento {
    private Filas fila;
    private Columnas columna;
    private Espectador espectador;

    public Asiento() {
    }

    public Asiento(Filas fila, Columnas columna, Espectador espectador) {
        this.fila = fila;
        this.columna = columna;
        this.espectador = espectador;
    }



    public Columnas getColumna() {
        return columna;
    }

    public void setColumna(Columnas columna) {
        this.columna = columna;
    }

    public Filas getFila() {
        return fila;
    }

    public void setFila(Filas fila) {
        this.fila = fila;
    }


    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Asiento{" + "fila=" + fila + ", columna=" + columna + ", espectador=" + espectador + '}';
    }

}
