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
public class Guia1Extra16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        persona(read);
    }
    public static void persona(Scanner read){
        int cont=1;String nom; int edad;String des;
        do{
            System.out.println("Ingrese el nombre de la persona n°"+cont);
            nom=read.next();
            System.out.println("Ingrese la edad de "+nom);
            edad=read.nextInt();
            if (edad>=18){
                System.out.println("Nombre: "+nom);
                System.out.println("Edad: "+edad);
                System.out.println("Mayor de edad");
            }else{
                System.out.println("Nombre: "+nom);
                System.out.println("Edad: "+edad);
                System.out.println("Menor de edad");
            }
            System.out.println("¿Desea ingresa los datos de otra persona?");
            des=read.next();
            des=des.toLowerCase();
            cont++;
        }while (!des.equals("no"));
    }    
}
