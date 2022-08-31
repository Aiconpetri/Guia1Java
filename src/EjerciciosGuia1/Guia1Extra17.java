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
public class Guia1Extra17 {
      public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
          System.out.println("Ingrese un numero para saber si es primo");
          int num=read.nextInt();
          boolean compro=primo(num);
          if (compro==true){
              System.out.println("El numero es primo");
          } else{
              System.out.println("El numero no es primo");
          }
      }
      public static boolean primo(int n){
          int cont=0; boolean band;
          for (int i = 0; i < n; i++) {
              if (n%(i+1)==0){
                  cont++;
              }
          }
          band=cont==2;
         return band; 
      }
}
