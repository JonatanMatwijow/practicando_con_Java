/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrices;

import java.util.Scanner;

/**
 *
 * @author jona
 */
public class Matrices {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        //Declaracion
        int matriz [][] = new int [3][3];
        
        
        //Asignacion - Manual
        matriz[0][0] = 5;
        matriz[0][1] = 13;
        matriz[0][2] = 24;
        matriz[1][0] = 76;
        matriz[1][1] = 33;
        matriz[1][2] = 29;
        matriz[2][0] = 7;
        matriz[2][1] = 3;
        matriz[2][2] = 9;
        
        //Recorrido
        for (int f=0; f<3; f++){
            for(int c=0; c<3; c++){
                System.out.println("El valor de la posicion f:" + f + " c: " + c);
                System.out.println("es de: " + matriz[f][c]);
            }
        }
        
        
        //Asignacion - por consola
        
        //Declaracion
        int matriz2 [][] = new int [3][3];
        
        Scanner teclado = new Scanner (System.in);
        
        for (int fi=0; fi<3; fi++){
            for (int co=0; co<3; co++){
                System.out.println("Ingrese el valor de la posicion fi: " + fi + " co: " + co);
            matriz2[fi][co] = teclado.nextInt();
            System.out.println("es de: " + matriz2[fi][co]);
            }
        }
        
        
        
    }
}
