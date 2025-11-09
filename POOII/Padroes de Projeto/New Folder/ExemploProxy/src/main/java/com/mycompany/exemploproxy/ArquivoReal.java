/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploproxy;

/**
 *
 * @author marci
 */
public class ArquivoReal implements Arquivo {

    private String caminho;

    public ArquivoReal(String c) {
        this.caminho = c;
        System.out.println("Carregando: " + c);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo: " + caminho);
    }
}
