/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;
/**
 *
 * @author ПК
 */
public class Mavenproject1 {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre name telephone: ");
        String brandInput = input.nextLine();

        telephonique telephonique = new telephonique(brandInput);
        telephonique.newName();

        System.out.println("New name telephone: " + telephonique.getBrand());
    }
}
