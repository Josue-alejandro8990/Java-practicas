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
public class Tarea_2_Ejercicio_13 {
    
     public static void main (String[] args) {

     Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Ingrese El Primer Número: ");
        n1 = sc.nextInt();
        System.out.print("Ingrese El Segundo Número: ");
        n2 = sc.nextInt();
        System.out.print("Ingrese El Tercer Número: ");
        n3 = sc.nextInt();
        if (n1 > n2) 
        {
            if (n1 > n3) 
            {
                System.out.println("El mayor es: " + n1);
            } else 
            {
                System.out.println("el mayor es: " + n3);
            }
        } 
        if (n2 > n3) 
        {
            System.out.println("el mayor es: " + n2);
        } 
        else 
        {
            System.out.println("el mayor es: " + n3);
        }    
    }
    
}
