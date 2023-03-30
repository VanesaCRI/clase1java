
package javaapplication1;

import java.util.Scanner;


public class Ej4Guia2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese su cantidad de grados centigrados");
        int cent = leer.nextInt();
        double far = 32 + ( 9 * cent / 5);
        System.out.println("La equivalencia de " + cent + " centigrados, es " + far );
        
    }

}
