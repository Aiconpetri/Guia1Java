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
public class Ejercicio11 {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese dos numeros enteros positivos");
         double num1=read.nextInt(); double num2=read.nextInt(); double result; double div;
         boolean band =false;
        int option;
         do{
             System.out.println("Menu");
                 System.out.println("1=Sumar");
                 System.out.println("2=Restar");
                 System.out.println("3=Multiplicar");
                 System.out.println("4=Dividir");
                 System.out.println("5=Salir");
                 System.out.println("Elija opcion:");option=read.nextInt();
                 switch (option){
                     case 1:
                         result=num1+num2;
                         System.out.println("La suma de los numeros es "+result);
                         break;
                     case 2: 
                         result= num1-num2;
                         System.out.println("La resta de los numeros es "+result);
                         break;
                     case 3:
                         result= num1*num2;
                         System.out.println("La multiplicacion de los numeros es "+result);
                         break;
                     case 4:
                         div=num1/num2;
                         System.out.println("La division de los numeros es "+div);
                         break;
                     case 5:
                         System.out.println("¿Desea salir del programa?");
                         break;
                     default:
                         System.out.println("No eligio una opcion valida dentro del menu");    
                         break;
                 }
                 if (option==5){
                      String elegir=read.next();
                                if ("Si".equals(elegir)|| "si".equals(elegir)){
                                    band=true;
                                }
                 }
         }while (!band);
    } 
}
