/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulasolid;

/**
 *
 * @author marci
 */
class Rectangle {
    protected int width;
    protected int height;

    public void setWidth(int width) { this.width = width; }
    public void setHeight(int height) { this.height = height; }
    public int getArea() { return width * height; }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width; // Quadrado: largura e altura iguais
    }

    @Override
    public void setHeight(int height) {
        this.width = height;
        this.height = height; // Quadrado: largura e altura iguais
    }
}
// Código cliente espera poder alterar largura e altura
// independentemente, mas Square viola essa expectativa

