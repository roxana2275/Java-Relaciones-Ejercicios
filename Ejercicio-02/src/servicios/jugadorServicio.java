/*
 Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.
 */
package servicios;

import entidades.Jugador;
import entidades.RevolverDeAgua;


/**
 *
 * @author Usuario
 */
public class jugadorServicio {

    public boolean disparo(RevolverDeAgua rev){

        Jugador jug = new Jugador();
        revolverDeAguaServicios rs = new revolverDeAguaServicios();
        System.out.println("El jugador "+jug.getNombre()+ " dispara");
        if(rs.mojar(rev)==true){
            jug.setMojado(true);
            System.out.println("El jugador"+jug.getNombre()+" se mojó");
        }else{
            jug.setMojado(false);
            System.out.println("El jugdor "+jug.getNombre()+" no se mojó, pasar el revolver al siguiente ");
        }
        return jug.getMojado();
    }
}
  