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
public class Ejercicio19 {
     public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese el tamaño de la matriz");
         int n=read.nextInt();
         int [][] mat= new int [n][n]; int cont=0;
         System.out.println("Llne la matriz");
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 mat [i][j]=read.nextInt();
             }
         }
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 if (mat[i][j]==(mat[j][i]*-1)){
                     cont++;
                 }
             } 
         }
         if (cont==n){
             System.out.println("La matriz es anti simetrica");
         }else{
             System.out.println("La matriz no es anti simetrica");
         }
     }
}
