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
public class Ejercicio10 {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese el numero al que quiera llegar");
         int num=read.nextInt();
         System.out.println("Ahora ingrese numeros que se iran sumando hasta llegar al limite");
         int suma=0;
         int num2;
         while (suma<=num){
             suma=suma+read.nextInt();
         }
         System.out.println("Ha superado el limite");
    }
}
