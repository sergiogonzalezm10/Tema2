package buclefor;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		        int numero;
		        boolean esPrimo = true;
		        		
		        Scanner sc = new Scanner(System.in);
		        
		        System.out.print("Introduce un número entero positivo: ");
		        numero = sc.nextInt();

		        // Un número menor o igual a 1 no es primo
		        if (numero <= 1) {
		            esPrimo = false;
		        } else {
		            // Comprobar divisores desde 2 hasta numero-1
		            for (int i = 2; i < numero; i++) {
		                if (numero % i == 0) {
		                    esPrimo = false;
		                    break;
		                }
		            }
		        }

		        if (esPrimo) {
		            System.out.println(numero + " es primo.");
		        } else {
		            System.out.println(numero + " NO es primo.");
		        }

		        sc.close();
		    }
		}
