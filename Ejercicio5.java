
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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero para calcular el doble, el triple y la raiz del numero");
        num = leer.nextByte();
        System.out.println("El numero ingresado es: " + num + ". El doble es:" + 
                (num*2) + ". El triple es:" + (num*3) + ". Y la raiz es:" + (num*num));
    }
    
}
