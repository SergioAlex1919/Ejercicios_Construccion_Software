/**Ejercicio 2 de Guia Serie de ejercicios básicos: SUMA DE DOS NÚMEROS DESDE  HASTAS EL 100
 * ENTRADA CON DOS NUNEROS Y ESPACIO 
 * @autor (Sergio Diaz) 
 * @version (version_0 2-Ago-2017)
 */
import java.util.Scanner; // Se Importa la libreria de la clase Scanner
public class Ejercicio_3
{
    public static void main(String[] args)
    {
        int a = 0;                                  // Se declara una variable tipo entero y se inicializa en 0.
        int b = 0;                                  // Se declara una variable tipo entero y se inicializa en 0.
        int c = 0;                                  // Se declara una variable tipo entero y se inicializa en 0.
        Scanner Z= new Scanner(System.in);                       // Se declara Objeto Z Tipo Scanner y qque tome el valor de la entrada nueva del tecaldo.
        System.out.println("Ingrese número menor de 100  ");     // Sentencia para que aparezca en pantalla el ingreso del número menor a 100
        a = Z.nextInt();                                         // Se asigan el valor de Z a la variable a.
        if(a >= 100 )                                            // Condición que el número sera menor a 100
        {                                            
            System.out.println("Ingrese número menor de 100 por favor  "); // Si la condición se cumple aparecen en pantalla que digite el valor en el rangop solicitado
        }
        else                                                    // Condición doble si no se cumple la anterior hacer lo siguiente:                                             
        {
            b = Z.nextInt();                                    // Asignar el valor de Z a la variable b
            if (b >= 100 )                                      // Condición que el número sera menor a 100
            {             
                System.out.println("Ingrese número menor de 100 por favor  "); // Si la condición se cumple aparecen en pantalla que digite el valor en el rangop solicitado
            }
            else                                                // Condición doble si no se cumple la anterior hacer lo siguiente:  
            {
                c = a+b;                                       // Se efectúa la operación solicitada (suma de las 2 entradas).
                System.out.println("El resultado es " +c);     // Se efectúa Salida en pantalla del valor de la variable C.
            }
        }

        
    }
}

