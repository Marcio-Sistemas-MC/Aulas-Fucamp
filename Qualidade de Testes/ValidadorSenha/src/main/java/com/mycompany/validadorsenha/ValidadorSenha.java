/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validadorsenha;

/**
 *
 * @author marci
 */
public class ValidadorSenha {

    // Exceção personalizada para clareza
    public static class SenhaInvalidaException extends RuntimeException {
        public SenhaInvalidaException(String mensagem) {
            super(mensagem);
        }
    }

    /**
     * Valida uma senha com base em regras específicas.
     * @param senha A string de senha a ser validada.
     * @return true se a senha for válida.
     * @throws SenhaInvalidaException se a senha não atender a alguma regra.
     */
    public boolean validar(String senha) {
        if (senha == null) {
            throw new IllegalArgumentException("A senha não pode ser nula.");
        }

        // Regra 1: Tamanho mínimo
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter no mínimo 8 caracteres.");
        }

        // Regra 2: Pelo menos uma letra maiúscula
        if (!senha.matches(".*[A-Z].*")) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos uma letra maiúscula.");
        }

        // Regra 3: Pelo menos um dígito
        if (!senha.matches(".*\\d.*")) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos um dígito.");
        }

        return true;
    }
}
