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
public class Tarea_2_Ejercicio_14 {
    
    public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
        
    System.out.print("Ingrese Un Número Entero: ");
    int NumeroEntero = sc.nextInt();

    if ((NumeroEntero % 2) == 0) 
    {
      System.out.print("El número Ingresado Es Par");
    } else 
    {
      System.out.print("El número Ingresado Es Impar");
    }

    if ((NumeroEntero % 5) == 0) 
    {
      System.out.println(" Y Es Divisible Entre 5.");
    } else 
    {
      System.out.println(" Y No Es Divisible Entre 5.");
    }
  }
    
}
