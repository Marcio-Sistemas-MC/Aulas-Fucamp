/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemploproxy;

/**
 *
 * @author marci
 */
public class ExemploProxy {

    public static void main(String[] args) {
        Arquivo arquivo = new ProxyArquivo("imagem.jpg");
        // Nada é carregado ainda!

        arquivo.exibir();
        // Agora sim: "Carregando: imagem.jpg"
    }
}
