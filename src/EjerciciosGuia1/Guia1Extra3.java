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
public class Guia1Extra3 {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese una vocal");
         String letra=read.next();
         letra=letra.toLowerCase();
         if (letra.equals("a")||letra.equals("e")||letra.equals("i")||letra.equals("o")||letra.equals("u")){
             System.out.println("La letra ingresada es una vocal");
         }else{
             System.out.println("La letra ingresada no es una vocal");
         }
    }
}
