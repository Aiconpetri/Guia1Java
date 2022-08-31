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
public class Ejercicio7 {
     public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Escriba eureka");
         String p=read.nextLine();
         if (p.equals("eureka")){
             System.out.println("Correcto");
         }else{
             System.out.println("Incorrecto");
         }  
     }
}
