/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplodecorator;

/**
 *
 * @author marci
 */
public class TextoSimples implements Texto {

    private String conteudo;

    public TextoSimples(String c) {
        this.conteudo = c;
    }

    @Override
    public String render() {
        return conteudo;
    }
}
