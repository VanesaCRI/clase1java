
package javaapplication1;

import java.util.Scanner;


public class EJ3Guia2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese su frase");
     String frase1 = leer.nextLine();
     
     System.out.println("Su frase en minusculas " + frase1.toLowerCase() + ", Y su frase en mayusculas " + frase1.toUpperCase());
    }
    
}
