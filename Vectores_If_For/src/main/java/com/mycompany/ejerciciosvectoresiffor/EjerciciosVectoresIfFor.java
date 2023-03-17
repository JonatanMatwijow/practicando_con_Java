/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosvectoresiffor;

import java.util.Scanner;

/**
 *
 * @author jona
 */

/*

*/

public class EjerciciosVectoresIfFor {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
       
        int vector[] = new int [15];
        
        Scanner teclado =new Scanner(System.in);
        
        //cargar vector
        for(int i=0; i<15; i++){
            System.out.println("Ingrese el numero para el vector");
            vector[i] = teclado.nextInt();
        }
        
        //Recorrer y contar cuantos numero 3 tengo
        int cont = 0;
        
        for(int i=0; i<15; i++){
            if(vector[i] == 3){
                cont = cont + 1;
                
            }  

        }
        System.out.println("En el vector, hay numero 3 la cantidad de " + cont);
    }
}
