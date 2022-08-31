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
public class Guia1Extra4 {
     public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese un numero del 1 al 10");
         int num=read.nextInt();
         while (num<=0 || num>=11){
             System.out.println("El numero ingresado debe estar entre 1 y 10");
             num=read.nextInt();
         }
         switch (num){
             case 1:
                 System.out.println("El numero "+num+" es I en numeros romanos");
                 break;
             case 2:
                 System.out.println("El numero "+num+" es II en numeros romanos");
                 break;
             case 3:
                 System.out.println("El numero "+num+" es III en numeros romanos");
                 break;
             case 4:
                 System.out.println("El numero "+num+" es IV en numeros romanos");
                 break;
             case 5:
                 System.out.println("El numero "+num+" es V en numeros romanos");
                 break;
             case 6:
                 System.out.println("El numero "+num+" es VI en numeros romanos");
                 break;
             case 7:
                 System.out.println("El numero "+num+" es VII en numeros romanos");
                 break;
             case 8:
                 System.out.println("El numero "+num+" es VIII en numeros romanos");
                 break;
             case 9:
                 System.out.println("El numero "+num+" es IX en numeros romanos");
                 break;
             case 10:
                 System.out.println("El numero "+num+" es X en numeros romanos");
                 break;
         }
     }
}
