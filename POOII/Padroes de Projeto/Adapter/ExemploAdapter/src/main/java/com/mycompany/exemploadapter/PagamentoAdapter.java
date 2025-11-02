/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploadapter;

/**
 *
 * @author marcio
 */
public class PagamentoAdapter implements PagamentoAntigo {
    private PagamentoNovo pagamentoNovo;

    public PagamentoAdapter(PagamentoNovo pagamentoNovo) {
        this.pagamentoNovo = pagamentoNovo;
    }

    @Override
    public void pagarComCartao(String numeroCartao) {
        pagamentoNovo.processarPagamento(numeroCartao, 100.0); // valor fixo para simplificação
    }
}
