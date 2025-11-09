/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulasolid;

/**
 *
 * @author marci
 */
public class User {
    private String username;
    private String email;
    private String password;
    // Construtor
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    // Método para validar o usuário
    public boolean validateUser() {
        // Validação do nome de usuário
        if (username == null || username.length() < 3) {
            System.out.println("Erro: Nome de usuário inválido.");
            return false;
        }
        // Validação do email
        if (email == null || !email.contains("@") || !email.contains(".")) {
            System.out.println("Erro: Email inválido.");
            return false;
        }
        // Validação da senha
        if (password == null || password.length() < 8) {
            System.out.println("Erro: Senha muito curta.");
            return false;
        }
        return true;
    }
    // Método para salvar no "banco de dados"
    public boolean saveToDatabase() {
        // Simulação de lógica de conexão e inserção
        if (validateUser()) {
            System.out.println("Salvando usuário " + username + "...");
            return true;
        }
        return false;
    }
    // Método para retornar informações do usuário
    public String getUserInfo() {
        return "Username: " + username + ", Email: " + email;
    }
}
