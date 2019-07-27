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
public class Tarea_2_Ejercicio5 {
    
    static Scanner entrada = new Scanner(System.in);
    public static void main (String[] args) {
    
        int x, a, b;
        
        System.out.print("Favor Ingresar El Valor De A: ");
        a = entrada.nextInt();
        System.out.print("Favor Ingresar El Valor De B: ");
        b = entrada.nextInt();
        
        if (a !=0)
        {
        x = -b / a;
        System.out.println("Solucion De La Ecuacion: "+x);
        }   
        else if (b != 0)
        {
            System.out.println("Solucion Imposible");
        }
        else
        System.out.println("Solucion Indeterminada");
        }
}
