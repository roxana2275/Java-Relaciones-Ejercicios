/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeraciones;

/**
 *
 * @author Usuario
 */
public enum Tamanio {
    PEQUENIO(1, 10), MEDIANO(11, 25), GRANDE(25, 50), GIGANTE(50, 100);

    private Integer pesoMinimo;
    private Integer pesoMaximo;

    private Tamanio(Integer pesoMinimo, Integer pesoMaximo) {
        this.pesoMinimo = pesoMinimo;
        this.pesoMaximo = pesoMaximo;
    }

    public Integer getPesoMinimo() {
        return pesoMinimo;
    }

    public void setPesoMinimo(Integer pesoMinimo) {
        this.pesoMinimo = pesoMinimo;
    }

    public Integer getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(Integer pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

}
