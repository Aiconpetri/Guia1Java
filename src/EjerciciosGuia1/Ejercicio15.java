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
public class Ejercicio15 {
     public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         int[] vec =new int[100];
         for (int i = 0; i < vec.length; i++) {
           vec[i]=i+1;
         }
         for (int i =99; i >=0; i--) {
             System.out.print(""+vec[i]+",");
         }
     }
}
                  