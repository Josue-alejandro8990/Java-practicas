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
public class Tarea_3_Ejercicio9 {
     public static void main (String[] args) {
         
         Scanner s=new Scanner (System. in );
         System.out.print("Dame el numero ; ");
         int a =Integer.parseInt(s.nextLine());
         System.out.println("El número " + a + " tiene " + Integer.toString(a).length() + " dígitos");
        
    }
}
