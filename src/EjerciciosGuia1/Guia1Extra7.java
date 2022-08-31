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
public class Guia1Extra7 {
      public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
          System.out.println("¿Cuantos numeros desea ingresar?");
          int n=read.nextInt();int cont=0;int min=0; int max=0; int num;int sum=0;
          while (cont<n){
              if (cont==0){
              System.out.println("Ingrese numeros para saber el mayor, el menor y el promedio");
              }
              num=read.nextInt();
              if (cont==0){
                  min=num;
              }
              if (num>max){
                  max=num;
              }
              if (num<min && cont>0){
                  min=num;
              }
              sum=sum+num;
              cont++;
          }
          System.out.println("El numero mas grande es "+max+" y el numero mas pequeño es "+min+" ,el promedio de numeros ingresados es "+(sum/cont));
      }
}
