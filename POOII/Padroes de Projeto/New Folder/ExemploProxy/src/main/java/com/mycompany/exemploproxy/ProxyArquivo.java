/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploproxy;

/**
 *
 * @author marci
 */
public class ProxyArquivo implements Arquivo {

    private String caminho;
    private ArquivoReal real;

    public ProxyArquivo(String c) {
        this.caminho = c;
        this.real = null;
    }

    @Override
    public void exibir() {
        if (real == null) {
            real = new ArquivoReal(caminho);
        }
        real.exibir();
    }
}
