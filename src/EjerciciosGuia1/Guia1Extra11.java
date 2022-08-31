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
public class Guia1Extra11 {
  public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese un numero para saber cuantos digitos tiene");
         int cont=0; int num=read.nextInt();
         if (num<0){
             num=num*(-1);
         }
         if (num==0){
             cont++;
         }
       while (num>0){
           num=num/10;
           cont++;
      }
       System.out.println("El numero ingresado es de "+cont+" digitos");
  }
}
