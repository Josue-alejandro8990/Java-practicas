/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2.ejercicios.tarea2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tarea_2_Ejercicio6 {
 
    final static double g = 9.81;
    public static void main (String[] args) {
    int altura;
        
        
    System.out.print("Ingrese La Altura Desde La Que Cae El Objeto: ");
    Scanner h = new Scanner(System.in);
    altura = h.nextInt();

    double s = Math.sqrt(2*altura/g);

    System.out.printf("El Objeto Tardo %.2f Segundos En Caer.\n", s);
  }
    
}
