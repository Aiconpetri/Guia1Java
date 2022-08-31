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
public class Guia1Extra6 {
      public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
          System.out.println("Ingrese cuantas personas va a promediar");
          int n=read.nextInt();double [] vec= new double [n]; int contC=0;double sumC=0;double sumT=0;
          for (int i = 0;i<vec.length; i++) {
              System.out.println("Ingrese la altura de la persona "+(i+1)+" en metros");
              vec[i]=read.nextDouble();
              if(vec[i]<1.60){
                  sumC=sumC+vec[i];
                  contC++;
              }
              sumT=sumT+vec[i];
          }
          System.out.println("El porcentaje de personas que miden menos de 1,60 es "+(contC*100/n)+"%");
          if (contC!=0){
             System.out.println("La altura promedio de las personas que miden menos de 1,60 es "+(sumC/contC)+"m"); 
          }
          System.out.println("La altura promedio de las personas que miden menos de 1,60 es "+(sumT/n)+"m");
      }
}
