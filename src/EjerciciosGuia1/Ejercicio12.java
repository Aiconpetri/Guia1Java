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
public class Ejercicio12 {
        public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         int c=0; int f=0;
         String p="";
         while (!p.equals("&&&&&")){
             System.out.println("Ingrese una palabra de 5 caracteres que empiece por X y termine en O. Salga con &&&&&");
             p=read.nextLine();
             char A= p.charAt(p.length()-1);
             if (p.length()==5 && p.substring(0,1).equals("x") && A=='o'){
                c++;
             }else{
                 f++;
             }
         }
            System.out.println("La cantidad de palabras correctas fue "+c +" y la cantidad de palabras incorrectas fue "+ (f-1));
        }
}
