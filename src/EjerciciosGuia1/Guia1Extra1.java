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
public class Guia1Extra1 {
      public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
          System.out.println("Ingrese una cantidad de minutos para convertirlo en dias/horas");
          int min=read.nextInt();
          System.out.println(min+" minutos equivale a "+((min/60)/24)+" dias y "+(min/60)%24+" horas");
      }
}
