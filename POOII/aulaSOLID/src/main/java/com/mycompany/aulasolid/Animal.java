/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulasolid;

/**
 *
 * @author marci
 */
// Classe base abstrata
abstract class Animal {
    public abstract String fazerBarulho() throws Exception;
}

// Subclasse Cachorro
class Cachorro extends Animal {
    @Override
    public String fazerBarulho() {
        return "Au Au!";
    }
}

// Subclasse Gato
class Gato extends Animal {
    @Override
    public String fazerBarulho() {
        return "Miau!";
    }
}

// Subclasse Peixe
class Peixe extends Animal {
    @Override
    public String fazerBarulho() throws Exception {
        // Peixes não fazem barulho audível
        throw new Exception("Peixes não fazem barulho audível!");
    }
}



