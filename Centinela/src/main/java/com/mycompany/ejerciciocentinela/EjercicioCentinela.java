/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciocentinela;

import java.util.Scanner;

/**
 *
 * @author jona
 */
public class EjercicioCentinela {

    public static void main(String[] args) {
        System.out.println("Ingrese una palabra");
        
        Scanner teclado = new Scanner(System.in);
        
        String palabra = teclado.next();
        
        while(!palabra.equalsIgnoreCase("salir")){
            
            System.out.println("La palabra es: " + palabra);
            System.out.println("Ingrese una palabra");
            palabra = teclado.next();
        }
        
    }
}
