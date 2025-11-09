/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplofacede.fachada;

import com.mycompany.exemplofacede.componentessimples.*;

/**
 *
 * @author marcio
 */
public class HomeTheaterFacade {

    private TV tv;
    private SistemaSom som;

    public HomeTheaterFacade() {
        this.tv = new TV();
        this.som = new SistemaSom();
    }

    public void iniciarCinema() {
        tv.ligar();
        som.aumentarVolume();
    }
    
    public void finalizarCinema() {
        tv.desligar();
    }
}
