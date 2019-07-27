/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea3;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Tarea_3_Ejercicio_24 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = sc.nextInt();
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
//serie de numeros
            for(int suma=1; suma<=(altura*2)-1; suma++){
                System.out.print(suma);
                for(int i =1; i<=suma;i++){
                if(suma > i){
                    
                    System.out.println(suma -=i);
                }
                }}
            System.out.println();
        }
    }
}
