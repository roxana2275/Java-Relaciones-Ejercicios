/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra.pkg2;

import entidades.Cine;
import servicios.ServicioCine;


/**
 *
 * @author Usuario
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCine sc = new ServicioCine();
        Cine cine = sc.cargarSala();
        sc.imprimirSala(cine);
    }
    
}
