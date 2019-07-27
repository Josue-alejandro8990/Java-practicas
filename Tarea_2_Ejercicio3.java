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
public class Tarea_2_Ejercicio3 {
 
    public static void main(String[] args) 
    {
        // TODO code application logic here
    String Dia;
        
    System.out.println("Escriba Un Numero Del 1 al 7: ");
    Scanner sc = new Scanner(System.in);
    int DiaDeLaSemana = sc.nextInt();
       
    if (DiaDeLaSemana == 1)
    {    
    Dia = "Lunes";
    System.out.println("El Numero Que Eligio Es Del Dia "+Dia);   
    }
    
    if (DiaDeLaSemana == 2)
    {    
    Dia = "Martes";
    System.out.println("El Numero Que Eligio Es Del Dia "+Dia);   
    }
    
    if (DiaDeLaSemana == 3)
    {    
    Dia = "Miercoles";
    System.out.println("El Numero Que Eligio Es Del Dia "+Dia);   
    }
    
    if (DiaDeLaSemana == 4)
    {    
    Dia = "Jueves";
    System.out.println("El Numero Que Eligio Es Del Dia "+Dia);   
    }
    
    if (DiaDeLaSemana == 5)
    {    
    Dia = "Viernes";
    System.out.println("El Numero Que Eligio Es Del Dia "+Dia);   
    }
    
    if (DiaDeLaSemana == 6)
    {    
    Dia = "Sabado";
    System.out.println("El Numero Que Eligio Es Del Dia "+Dia);   
    }
    
    if (DiaDeLaSemana == 7)
    {    
    Dia = "Domingo";
    System.out.println("El Numero Que Eligio Es Del Dia "+Dia);   
    }
    
    if (DiaDeLaSemana >= 8)
    {
    System.out.println("Solo Puede Escoger Numeros Del 1 al 7");
    }
    
    }
    
}
