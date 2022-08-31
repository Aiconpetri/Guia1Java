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
public class Guia1Extra8 {
     public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese numeros. Finalice con un multiplo de 5");
        int num=1; int cont=0; int contp=0; int conti=0;
         while (num%5!=0){
             num=read.nextInt();
             if (num>0){
                cont++;
                if(num%2==0){
                    contp++;
                }else{
                    conti++;
                }
             }
             if (num>0 && num%5==0){
                 break;
             }
         }
          System.out.println("La cantidad de numeros ingresada fue "+cont+" , la cantidad de numeros pares fue "+contp+" y la cantidad de numeros impares fue "+conti);   
     }
}
