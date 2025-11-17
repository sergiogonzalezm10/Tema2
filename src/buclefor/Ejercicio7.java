package buclefor;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
				// Variable para almacenar el número introducido
		        int numero;
		        //Variable para indicar si el número es primo
		        boolean esPrimo = true;
		        
		        //Inicio escáner
		        Scanner sc = new Scanner(System.in);
		        
		        
		        //Pedimos al usuario que introduzca un número
		        System.out.print("Introduce un número entero positivo: ");
		        numero = sc.nextInt();

		        // Si un número menor o igual a 1 no es primo.
		        if (numero <= 1) {
		            esPrimo = false;
		        } else {
		        	 
		        	// Comprobamos si el número es primo
		            for (int i = 2; i < numero; i++) {
		                if (numero % i == 0) {
		                    esPrimo = false;
		                }
		            }
		        }

		        // Imprimimos el resultado
		        if (esPrimo) {
		            System.out.println(numero + " es primo.");
		        } else {
		            System.out.println(numero + " NO es primo.");
		        }
		        
		        //Cierre escáner
		        sc.close();
		    }
		}
