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
public class Ejercicio6 {
     public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese un numero");
         int num=read.nextInt();
         if (num%2==0){
             System.out.println("El numero es par");
         }else{
             System.out.println("El numero es impar");
         }
     }
}
