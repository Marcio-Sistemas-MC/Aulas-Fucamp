/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marcio
 */
public class Caixa implements IItemPedido {

    private List<IItemPedido> itens = new ArrayList<>();

    public void
            adicionar(
                    IItemPedido i) {
        itens.add(i);
    }

    @Override
    public double calcularCusto() {
        double total = 0;
        for (IItemPedido item : itens) {
            total += item.
                    calcularCusto();
        }
        return total;
    }
}
