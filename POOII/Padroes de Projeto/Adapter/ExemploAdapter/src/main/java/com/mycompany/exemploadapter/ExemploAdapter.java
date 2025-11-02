/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploadapter;

/**
 *
 * @author marci
 */
public class ExemploAdapter {

    public static void main(String[] args) {
        PagamentoNovo novo = new PagamentoNovo();
        PagamentoAntigo adaptado = new PagamentoAdapter(novo);

        adaptado.pagarComCartao("1234-5678-9012-3456");
    }
}
