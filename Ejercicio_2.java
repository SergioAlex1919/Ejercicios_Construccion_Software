
/**Ejercicio 3 de Guia Serie de ejercicios básicos: SUMA DE DOS NÚMEROS
 * 
 * @autor (Sergio Diaz) 
 * @version (version_0 2-Ago-2017)
 */
import java.util.Scanner; // Se Importa la libreria de la clase Scanner

public class Ejercicio_2
{
    public static void main(String[] args)
    {
        int a = 0;                                  // Se declara una variable tipo double y se inicializa en 0.
        int b = 0;                                  // Se declara una variable tipo double y se inicializa en 0.
        int c = 0;                                  // Se declara una variable tipo double y se inicializa en 0.
        int d = 0; 
        
        Scanner Z= new Scanner(System.in);             // Se declara la variable Z tipo Scanner. Para adopotar el valor capturado por teclado 
        System.out.println("Ingrese número 1");        // Se imprime solicitud de ingreso de primer número
        a = Z.nextInt();                            // Se Asigna el valor a la variable a, del  primer número tipo Double
        System.out.println("Ingrese número 2");        // Se imprime solicitud de ingreso de segundo número
        b = Z.nextInt();                            // Se Asigna el valor a la variable b, del  segundo número tipo Double
        System.out.println("Ingrese número 3");        // Se imprime solicitud de ingreso de tercer número
        c = Z.nextInt();                            // Se Asigna el valor a la variable c, del  tercer número tipo Double
        d = a+b+c;                                     // Se efectúa la operación solicitada (suma de las 3 entradas).
        System.out.println("El resultado es " +d);     // Se imprime Resultado.
        
        
    }
}
