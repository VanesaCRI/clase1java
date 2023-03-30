
package javaapplication1;

import java.util.Scanner;


public class Ej5Guia2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println(" Ingrese su numero ");
        int num1 = leer.nextInt();
        int Dob1 = num1 * 2;
        int tri1 = num1 * 3;
        double raiz = Math.sqrt(num1);
        System.out.println("su numero es " + num1);
        System.out.println("El doble de su numero es " + Dob1 + ", el triple es " + tri1 );
        System.out.println("Y su raiz cuadrada es " + raiz);
        
    }

}
