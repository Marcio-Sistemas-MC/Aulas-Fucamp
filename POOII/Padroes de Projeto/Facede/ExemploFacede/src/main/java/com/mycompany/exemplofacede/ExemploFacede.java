/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemplofacede;

import com.mycompany.exemplofacede.fachada.HomeTheaterFacade;

/**
 *
 * @author marci
 */
public class ExemploFacede {

    public static void main(String[] args) {
        HomeTheaterFacade cinema = new HomeTheaterFacade();

        // Uma única chamada coordena tudo
        cinema.iniciarCinema();  // Ligar TV, aumentar som, etc.
        
        cinema.finalizarCinema();
    }
}
