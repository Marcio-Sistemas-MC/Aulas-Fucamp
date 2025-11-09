/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplodecorator;

/**
 *
 * @author marcio
 */
public abstract class TextoDecorador implements Texto {

    protected Texto texto;

    public TextoDecorador(Texto t) {
        this.texto = t;
    }

    @Override
    public String render() {
        return texto.render();
    }
}
