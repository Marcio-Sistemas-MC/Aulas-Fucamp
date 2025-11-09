/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author marcio
 */
public class Main {

    public static void main(String[] args) {
        Caixa caixaPrincipal = new Caixa();
        caixaPrincipal.adicionar(new Produto(10.0)); 

        Caixa caixaInterna = new Caixa();
        caixaInterna.adicionar(new Produto(5.0));  
        caixaPrincipal.adicionar(caixaInterna);

        // Custo total: 10.0 + 5.0 = 15.0 (recursão automática!)
        double custo = caixaPrincipal.calcularCusto();
        System.out.println("Custo: " + custo);
    }
}
