/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplodecorator;

/**
 *
 * @author marci
 */
public class ItalicoDecorador extends TextoDecorador {

    public ItalicoDecorador(Texto t) {
        super(t);
    }

    public String render() {
        return "*" + texto.render() + "*" ; 
    }
}
