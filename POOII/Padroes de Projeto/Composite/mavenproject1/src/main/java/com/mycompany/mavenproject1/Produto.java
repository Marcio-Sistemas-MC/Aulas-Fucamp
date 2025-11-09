/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author marcio
 */
public class Produto implements IItemPedido {
    private double preco;
    
    public Produto(
        double p) { 
        this.preco = p; 
    }
    
    @Override
    public double 
    calcularCusto() {
        return preco;
    }
}
