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
public class Ejercicio9_2 {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
           System.out.println("Escribe una palabra que inicie con la letra A"); 
           String p= read.nextLine();
           if (p.substring(0,1).equals("A")){
               System.out.println("Correcto");
           }else{
               System.out.println("Incorrecto");
           }
}
}
