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
public class Guia1Extra15 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para trabajar con ellos");
        int num1 = read.nextInt();
        int num2 = read.nextInt();
        int op;
        int retorno;
        double retornoD;
        String des = "No";
        System.out.println("¿Que desea hacer con los numeros?");
        do {
            System.out.println("MENU\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir");
            op = read.nextInt();
            switch (op) {
                case 1:
                    System.out.println("La suma de los numeros es " + (retorno = suma(num1, num2)));
                    break;
                case 2:
                    System.out.println("La resta de los numeros es " + (retorno = resta(num1, num2)));
                    break;
                case 3:
                    System.out.println("La multiplicacion de los numeros es " + (retorno = mult(num1, num2)));
                    break;
                case 4:
                    System.out.println("La division de los numeros es " + (retornoD = div(num1, num2)));
                    break;
                case 5:
                    System.out.println("¿Desea salir?");
                    des = read.next();
                    des = des.toLowerCase();
                    break;
                default:
                    System.out.println("Ingrese un numero dentro del menu");
                    break;
            }
        } while (!des.equals("si"));
    }

    public static int suma(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }

    public static int resta(int n1, int n2) {
        int res = n1 - n2;
        return res;
    }

    public static int mult(int n1, int n2) {
        int mul = n1 * n2;
        return mul;
    }

    public static double div(double n1, double n2) {
        double divi = n1 / n2;
        return divi;
    }
}
