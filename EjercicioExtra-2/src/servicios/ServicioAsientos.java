/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Asiento;
import enumeraciones.Columnas;
import enumeraciones.Filas;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ServicioAsientos {
 

    public ArrayList cargarAsientos(){
        ArrayList<Asiento> asientos = new ArrayList();

        for (Filas auxFil : Filas.values()) {
            for (Columnas auxCol : Columnas.values()) {
                Asiento auxAsiento = new Asiento(auxFil,auxCol,null);
                asientos.add(auxAsiento);
            }
        }
        return asientos;
    }
    public boolean asientoOcupado(Asiento asiento){
        if(asiento.getEspectador()==null){
            return true;
        }else{
            return false;
        }
    }

}
