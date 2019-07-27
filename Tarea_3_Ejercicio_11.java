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
public class Tarea_3_Ejercicio_11 {
     public static void main (String[] args) {
          Scanner s = new Scanner(System.in);
          int num=5;
          int b=1;
          System.out.print("Damen un numero : ");
          int a= Integer.parseInt(s.nextLine());
          
          while(b<=num )
          {
              num--;
              a++;
              System.out.print("El cuadrado es ;" +Math.pow(a,2));
              System.out.println("El cubo es ; "+Math.pow(a,3));
          }
          
         
         
        
    }
}
