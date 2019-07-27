/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semana2.ejercicios.tarea3;
import java.util.Scanner;

/**
 *
 * @author USUARIOTC
 */
public class Tarea_3_Ejercicio_10 {
     public static void main (String[] args) {
          Scanner s = new Scanner(System.in);
         int b=0,num=5;
         int suma=0;
         int numero=5;
          System.out.println("Para salir ingresa cero");
          while(num!=0){
              System.out.println("Ingresa un numero");
                  numero=Integer.parseInt(s.nextLine());
              if ( numero>=0)
              {
               suma=suma+numero;
              b++;
              }
              else 
              {
                System.out.println("La media de los valores ingresados es ;"+suma/(b));  
              }   
          }
         
     }
        
    }

