/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P2.semana2.tarea1;

import java.util.Scanner;

/**
 *
 * @author Josue Garcia
 */
public class Tarea_1_Ejercicio7 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
        double bi,iva = 0.12, total, iva2;
        System.out.print("total de la Base imponible: "); bi = s.nextDouble();
        iva2 = bi * iva;
        total = bi + iva2;
        System.out.println("Base imponible: " + bi + "\nIVA: " + iva2 + "\nTotal de factura: " + total);
        
    }
    
}
