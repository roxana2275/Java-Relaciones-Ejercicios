/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Usuario
 */
public class RevolverDeAgua {
    private int posicionActual;
    private int posicionDeAgua;

    public RevolverDeAgua() {
    }

    public RevolverDeAgua(int posicionActual, int posicionDeAgua) {
        this.posicionActual = posicionActual;
        this.posicionDeAgua = posicionDeAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionDeAgua() {
        return posicionDeAgua;
    }

    public void setPosicionDeAgua(int posicionDeAgua) {
        this.posicionDeAgua = posicionDeAgua;
    }

    @Override
    public String toString() {
        return "RevolverDeAgua{" + "posicionActual=" + posicionActual + ", posicionDeAgua=" + posicionDeAgua + '}';
    }
    
}
