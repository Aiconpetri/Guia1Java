/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia1;

import java.util.Scanner;

/**
 *
 * @author Nahuel
 */
public class Ejercicio3 {
     public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese una frase"); String palabra=read.nextLine();
         System.out.println("Mayusculas= "+palabra.toUpperCase());
         System.out.println("Minusculas= "+palabra.toLowerCase());
         
     }
}
