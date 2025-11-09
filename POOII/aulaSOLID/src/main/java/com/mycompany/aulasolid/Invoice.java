/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulasolid;

/**
 *
 * @author marci
 */
public class Invoice {

    private double amount;
    private String customerType;

    public Invoice(double amount, String customerType) {
        this.amount = amount;
        this.customerType = customerType;
    }

    public double calculateDiscountedAmount() {
        double discount = 0;
        if (customerType.equals("Regular")) {
            discount = amount * 0.05; // 5% de desconto
        } else if (customerType.equals("VIP")) {
            discount = amount * 0.10; // 10% de desconto
        } else if (customerType.equals("Corporate")) {
            discount = amount * 0.15; // 15% de desconto
        }
        return amount - discount;
    }

    public double getAmount() {
        return amount;
    }

    public String getCustomerType() {
        return customerType;
    }
}
