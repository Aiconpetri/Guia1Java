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
public class Guia1Extra5 {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese su tipo de socio(A,B,C)");
         String letra=read.next();
         letra=letra.toUpperCase();
         System.out.println("Ahora ingrese el costo de su tratamiento");
         int num=read.nextInt();
         switch (letra){
             case "A":
                 System.out.println("Su tratamiento queda en $"+num*0.5+" ya que tiene 50% de descuento");
                 break;
             case "B":
                 System.out.println("Su tratamiento queda en $"+(num-(num*0.35))+" ya que tiene 35% de descuento");
                 break;
             case "C":
                 System.out.println("Su tratamiento se mantiene en $"+num+" ya que no tiene descuento");
                 break;
             default:
                 System.out.println("No ingreso un tipo correcto");
                break;         
         }
    }
}
