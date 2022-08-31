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
public class Ejercicio18 {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         int[][] mat= new int [3] [3];
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                mat[i][j]=(int) (Math.random()*10);
             }
        }
         System.out.println("Se muestra la raiz normal");
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 System.out.print("["+mat[i][j]+"]");
             }
             System.out.println(" ");
        }
         System.out.println("Se muestra la raiz transpuesta");
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 System.out.print("["+mat[j][i]+"]");
             }
             System.out.println(" ");
        }
    }
}
