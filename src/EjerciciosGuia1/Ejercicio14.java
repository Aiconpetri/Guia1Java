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
public class Ejercicio14 {
    public static void main(String[] args) {
         Scanner read= new Scanner(System.in);
         System.out.println("Ingrese una cantidad de euros para convertirlos");
         int num=read.nextInt();System.out.println("Ingrese a que moneda desea convertirlos(libra,dolar,yen)"); String moneda=read.next();
         calculo(num, moneda);
    }
    public static void calculo(int num, String moneda){
        switch (moneda){
            case "libra":
                 System.out.println(num+"€ es igual a "+num*0.84+" "+moneda);
                 break;
            case "dolar":
                System.out.println(num+"€ es igual a "+num*1.28+" "+moneda);
                break;
            case "yen":
                System.out.println(num+"€ es igual a "+num*129.85+" "+moneda);
                break;
            default:
                System.out.println("No ingreso una moneda valida");
        }
       
    }
}

