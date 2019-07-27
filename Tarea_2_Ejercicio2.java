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
public class Tarea_2_Ejercicio2 {
    
    public static void main (String[] args) {
        
    float hora;
    String saludo;
        
    System.out.println("Ingrese La Hora: ");
    Scanner sc = new Scanner(System.in);
    hora = sc.nextFloat();
       
    if (hora >= 6 && hora <= 12)
    {
    saludo = "Buenos Dias";   
    System.out.println(saludo);   
    }
    
    if (hora >= 13 && hora <= 20)
    {
    saludo = "Buenos Tardes";   
    System.out.println(saludo);   
    }
    
    if (hora <= 5 || (hora >= 21 && hora <= 24))
    {
    saludo = "Buenos Noches";   
    System.out.println(saludo);   
    }

    if (hora >= 25)
    {
    System.out.println("Solo Puede Elegir Numeros Del 1 Hasta El 24");   
    }
    }
}
