
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abril
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num; int num1; int suma;
        System.out.println("Ingrese un numero");
        num = leer.nextByte();
        System.out.println("Ingrese otro numero para sumar al anterior");
        Scanner leer1 = new Scanner(System.in);
        num1 = leer1.nextByte();
        suma = (num+num1);
        System.out.println("El resultado de la suma es: "+ suma +".");
    }
    
}
