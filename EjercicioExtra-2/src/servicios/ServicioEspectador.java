/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidades.Espectador;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class ServicioEspectador {

    public ArrayList cargarEspectadorAleatorio() {

        ArrayList<Espectador> espectadores = new ArrayList<>();
        String[] nombres = {"Francisco Javier Elías Lozano","Timoteo Juliá","Baudelio Morera Silva","Haroldo de Vélez","Calixto Tejero Casas","Eugenio Estrada Pavón","Montserrat de Salvà","Irene Azucena Ledesma Sanjuan","Ana Sánchez","Ramón Frías Cañete","Irma Amo-Saavedra","Matías Jose Francisco Ribes Cerdán","Cayetano Eustaquio Carreño Chamorro","Hipólito Lucena Echeverría","Jose Carlos Narváez Hernandez","Timoteo Narváez Vilalta","Victor Alonso González","Manolo Bravo","Rosalva Luna Pedrero","Mario Donaire Huerta","Fermín Maza Marin","Marisa Belda Iborra","Vilma Pozo Suarez","Celestino de Sainz","Rocío Salamanca Pintor","Wálter Escobar Yuste","Flavio Cebrián Farré Borrás","Julio César Gomis Vallés","Rafa Alonso Cuesta Llanos","Jimena Moles Murcia","Tamara Pedraza Baró","Rosalva Monreal","Nicolás Ferrándiz Bayo","Ainoa Dionisia Bas Bas","Amarilis Marín Sobrino","Georgina Huguet Milla","Simón del Ortuño","Chuy Fortuny Escudero","Rosa Leon Bas","Maricela Frías Barrena","Moreno Izquierdo Segovia","Guiomar Desiderio Escalona Vergara","Nereida del Alvarez","Amparo Mascaró-Collado","Hernando Marquez Vidal","Leyre Pastor Tomas","Charo Baquero Sánchez","Heraclio Reguera Acero"};
              
        
        
        for (int i = 0; i < 48; i++) {
            Espectador auxiliar = new Espectador();
            auxiliar.setNombre(nombres[i]);
            auxiliar.setEdad((int) Math.floor(Math.random() * (100 - 1 + 1) + 1));
            auxiliar.setSaldo((int) Math.floor(Math.random() * (2400 - 1 + 1) + 1));
            espectadores.add(auxiliar);
        }
        return espectadores;
    }
    
    public Espectador cargarEspectador(){
        Scanner leer = new Scanner (System.in);
        Espectador espectador = new Espectador();
        System.out.println("Ingrese el nombre:");
        espectador.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad");
        espectador.setEdad(leer.nextInt());
        System.out.println("Ingrese el saldo");
        espectador.setSaldo(leer.nextInt());
        
        return espectador;
    }

}
