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
public class Guia1Exra13 {
     public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese el tamaño de la escalera");
         int num=read.nextInt(); int cont=0;
         for (int i = 0; i < num; i++) {
             for (int j = 0; j < i+1; j++) {
                 cont++;
                 System.out.print(cont);
             }
             System.out.println("");
             cont=0;
         }
     }
}
