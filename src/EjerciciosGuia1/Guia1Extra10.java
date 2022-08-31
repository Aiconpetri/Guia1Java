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
public class Guia1Extra10 {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         int num=(int)(Math.random()*10); int num1=(int)(Math.random()*10);
         int num2=num1*num;int num3;
          System.out.println("Trate de adivinar el numero");
         do{
         num3=read.nextInt();
         if (num3!=num2){
             System.out.println("El numero ingresado no es el correcto, ingrese otro");
         }
         }while (num3!=num2);
        System.out.println("Has encontrado el numero");      
    }
}
