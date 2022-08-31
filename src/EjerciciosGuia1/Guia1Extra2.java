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
public class Guia1Extra2 {
      public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
          System.out.println("Ingrese 4 numeros");
          int A=read.nextInt();int B=read.nextInt();int C=read.nextInt();int D=read.nextInt();
          System.out.println("Se muestra A,B,C y D: "+A+" "+B+" "+C+" "+D);
          int X=C;C=A;A=D;D=B;B=X;
          System.out.println("Ahora se muestra A,B,C y D modificados: "+A+" "+B+" "+C+" "+D);
      }
}
