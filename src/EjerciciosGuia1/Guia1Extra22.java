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
public class Guia1Extra22 {
     public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
         System.out.println("Ingrese el tamaño de su matriz");
         int n=read.nextInt(); int m=read.nextInt();
        int mat[][]=new int [n][m];
        int sum=0;
         System.out.println("Se rellena la matriz y se suman sus elementos");
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < m; j++) {
                 mat [i][j]=(int)(Math.random()*100);
                 sum+=mat[i][j];
             }
         }
         System.out.println("Se muestra la matriz");
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < m; j++) {
                 System.out.print(mat[i][j]+" ");
             }
             System.out.println(" ");
         }
         System.out.println("La suma de elementos de la matriz es "+sum);
     }
}
