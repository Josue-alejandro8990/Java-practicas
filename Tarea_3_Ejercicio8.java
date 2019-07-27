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
public class Tarea_3_Ejercicio8 {
     public static void main (String[] args) {
         Scanner s=new Scanner (System. in );
         
        System.out.println("Dame un numero ; ");
         int a= Integer.parseInt(s.nextLine());
         System.out.println("La tabla de multiplicar de "+a+" es ;");
         for(int x=1;x<=12;x++)
             
         {
             int multiplicar= a *x;
             System.out.println(multiplicar);
         }  
    }
}
