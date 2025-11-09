/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemplodecorator;

/**
 *
 * @author marci
 */
public class ExemploDecorator {

    public static void main(String[] args) {
        // Texto simples
        Texto texto = new TextoSimples("POO - II");  
        System.out.println(texto.render());
        
        // Adicionar negrito
        texto = new NegritoDecorador(texto);  
        System.out.println(texto.render());
        
        // Adicionar itálico (sobre negrito)
        texto = new ItalicoDecorador(texto); 
        System.out.println(texto.render());
    }
}
