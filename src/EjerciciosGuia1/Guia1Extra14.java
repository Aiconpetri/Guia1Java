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
public class Guia1Extra14 {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese la cantidad de familias que desea promediar");
         int num=read.nextInt(); int vecH[]=new int [num];int sum=0;int edad;
         for (int i = 0; i <vecH.length; i++) {
             System.out.println("Ingrese la cantidad de hijos de la familia n°"+(i+1));
             vecH[i]=read.nextInt();
        }
         for (int i = 0; i < vecH.length; i++) {
             for (int j = 0; j < vecH[i]; j++) {
                 if (j==0){
                 System.out.println("Ingrese las edades de los hijos de la familia n°"+(i+1));
                 }
                 System.out.println("Edad del hijo n°"+(j+1));
                 sum+=read.nextInt();
             }
             System.out.println("El promedio de las edades de los hijos de la familia n°"+(i+1)+" es "+sum/vecH[i]);
             sum=0;
        }
    }
}
