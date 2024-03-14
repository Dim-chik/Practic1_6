/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author ПК
 */
public class telephonique {
        private String brand;

    public telephonique (String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void newName() {
        char[] brandChars = brand.toCharArray();
                
        for (int i = 0; i < brandChars.length; i++) {
            if (brandChars[i] == 'o') brandChars[i] = 'a';
        }
        if (brandChars[0] == 'N' || brandChars[0] == 'n') {
            brand = new String(brandChars);
        }else{
            brand = new String(brandChars);
            brand = brand.toLowerCase();
        }
         

    } 
}
