/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosGuia1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Nahuel
 */
public class Ejercicio9 {
       public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
           System.out.println("Escribe una palabra que inicie y termine con la misma letra"); 
           String p= read.nextLine();
        String a=p.substring(0,1);
        char b=p.charAt(p.length()-1);
           String c= String.valueOf(b);
           c=toLowerCase(c);a=toLowerCase(a);
           if (a.equals(c)){
               System.out.println("Correcto");
           
     }else{
               System.out.println("Incorrecto");
           }  
    }
}
