
import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        int grados,f;
        System.out.println("Ingrese la temperatura en grados centigrados para"
                + " calcular cuanto seria en grados fahrenheit");
        grados = leer.nextByte();
        f = ( 9 * grados / 5 )+32;
        System.out.println("La temperatura " + grados + "° en fahrenheit es: "
        + f + "°.");
   
    }
    
}
