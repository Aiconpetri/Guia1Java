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
public class Ejercicio21 {
      public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         int [][] mat1=new int [3][3];int [][] mat2=new int[10][10];
          System.out.println("Llene la matriz de 3x3");
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  mat1 [i][j]=read.nextInt();
              }
          }
          System.out.println("Llene la matriz de 10x10");
          for (int i = 0; i < 10; i++) {
              for (int j = 0; j < 10; j++) {
                  mat2 [i][j]=read.nextInt();
              }
          }
          for (int i = 0; i < 3; i++) {
              for (int j = 0; j < 3; j++) {
                  System.out.print("["+mat2[i][j]+"]");
              }
              System.out.println(" ");
          }
          for (int i = 0; i < 10; i++) {
              for (int j = 0; j < 10; j++) {
                  System.out.print("["+mat2[i][j]+"]");
              }
              System.out.println(" ");
          }
          for (int i = 0; i < 10; i++) {
              for (int j = 0; j < 10; j++) {
                  if (mat1[0][0]==mat2[i][j]){
                      if (mat1[0][1]==mat2[i][j+1]){
                        if (mat1[0][2]==mat2[i][j+2]){
                             if (mat1[1][0]==mat2[i+1][j]){
                                 if (mat1[1][1]==mat2[i+1][j+1]){
                                     if (mat1[1][2]==mat2[i+1][j+2]){
                                         if (mat1[2][0]==mat2[i+2][j]){
                                             if (mat1[2][1]==mat2[i+2][j+1]){
                                                 if (mat1[2][2]==mat2[i+2][j+2]){
                                                     System.out.println("La matriz se encuentra contenida");
                                                     System.out.println("La matriz se encuentra en las posiciones "+i+"-"+j+"  "+i+"-"+(j+1)+"  "+i+"-"+(j+2)+"  "+(i+1)+"-"+j+"  "+(i+1)+"-"+(j+1)+"  "+(i+1)+"-"+(j+2)+"  "+(i+2)+"-"+j+"  "+(i+2)+"-"+(j+1)+"  "+(i+2)+"-"+(j+2));
                                                     break;
                                                 } 
                                             } 
                                        } 
                                    } 
                                  } 
                              } 
                           }   
                        } 
                      }
                  }
              }
          }
      }

