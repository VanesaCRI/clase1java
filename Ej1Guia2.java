
package javaapplication1;

import java.util.Scanner;

public class Ej1Guia2 {

   
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("El resultado de la suma es : " + suma);  
        
    }

}
