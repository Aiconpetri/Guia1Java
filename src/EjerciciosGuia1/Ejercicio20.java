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
public class Ejercicio20 {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese el tamaño del cuadrado");
         int n=read.nextInt(); int cont1=0; int cont2=0; int cont3=0;
         int[][] mat=new int [n][n]; int b1=0; int [] vecC=new int [n];int [] vecD=new int [2];int [] vecF=new int [n] ;
         System.out.println("Llene la matriz con numeros del 1 al 9");
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 do{
                 mat[i][j]=read.nextInt();
                 if (mat[i][j]<1 || mat[i][j]>9){
                     System.out.println("Ingrese un numero entre 1 y 9");
                 }
                 }while (mat[i][j]<1 || mat[i][j]>9);
             }
        }
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 System.out.print("["+mat[i][j]+"]");
             }
             System.out.println(" ");
        }
         for (int i = 0; i < vecF.length; i++) {
            vecF[i]=0; 
        }
           for (int i = 0; i < vecC.length; i++) {
            vecC[i]=0; 
        }
             for (int i = 0; i < vecD.length; i++) {
            vecD[i]=0; 
        }
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 if (i==0){
                    b1=b1+mat[i][j]; 
                 }
                 vecC[i]=vecC[i]+mat[i][j];
             }
        }
               for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 vecF[i]=vecF[i]+mat[j][i];
             }
        }
              for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 if (i==j) {      
                 vecD[0]=vecD[0]+mat[i][j];
                 }
                 if (i==(n-1)-j){
                     vecD[1]=vecD[1]+mat[i][j];
                 }
             }
        }
           for (int j = 0; j < n; j++) {
            if (vecC[j]==b1){
              cont1++;  
            }
        }
             for (int j = 0; j < n; j++) {
            if (vecF[j]==b1){
             cont2++;  
            }
        }
               for (int j = 0; j < 2; j++) {
            if (vecD[j]==b1){
              cont3++; 
            }
        }
   if (cont1==3 && cont2==3 && cont3==2){
       System.out.println("La raiz es magica y la suma de sus lados es "+b1);
   } else {
       System.out.println("La raiz no es magica");
   }
    }
}
