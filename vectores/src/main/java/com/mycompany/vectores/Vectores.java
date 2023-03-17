/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vectores;

import java.util.Scanner;

/**
 *
 * @author jona
 */
public class Vectores {

    public static void main(String[] args) {
       //Declaracion
       
       int vector [] = new int [4];
       
       //Asignacion manual del vector
       
       vector[0] = 2;
       vector[1] = 35;
       vector[2] = 48;
       vector[3] = 157;
      
       //Recorrido
       for(int i=0; i<vector.length; i++){
           System.out.println("Estoy en el indice " + i);
           System.out.println("Tengo guardado un " + vector[i]);
           System.out.println("------------------------------");
       }
       
       
       
        //Declaracion 2       
       int vector2 [] = new int [4];
       
       //Asignacion por teclado
       Scanner teclado = new Scanner(System.in);
       
       //Recorrido para la recarga
       for(int i=0; i<vector2.length; i++){
           System.out.println("Ingrese el valor del indice " + i);
           vector2[i] = teclado.nextInt();
       }
       
       
       
    }
}
