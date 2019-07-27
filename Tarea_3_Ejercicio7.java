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
public class Tarea_3_Ejercicio7 {
     public static void main (String[] args) {
         int contraseña=8990;
         int a=1;
         int maximo=4;
         while(a<=maximo)
         {
             Scanner s=new Scanner (System. in );
         System.out.println("Por favor ingresa la contraseña; ");
         int ingresar = Integer.parseInt(s.nextLine());
         if (ingresar==contraseña)
         {
             System.out.println("La caja Fuerte se ha abierto satisfactoriamente! ");
         }
         else 
         {
             System.out.println("Lo siento esa no es la combinación! ");
            
         }
         maximo--;
         
         
             
         }
         
         
         
          
         
        
    }
}
