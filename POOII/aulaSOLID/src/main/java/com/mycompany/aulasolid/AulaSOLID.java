/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aulasolid;

/**
 *
 * @author marci
 */
public class AulaSOLID {

   public static void interagirComAnimal(Animal animal) {
        try {
            System.out.println("O animal faz: " + animal.fazerBarulho());
        } catch (Exception e) {
            System.out.println("Erro ao fazer barulho: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal peixe = new Peixe();

        interagirComAnimal(cachorro);
        interagirComAnimal(gato);
        interagirComAnimal(peixe);
    }
}