package dowhile;

import java.util.Scanner;

public class Ejercicio5 {
	
	 public static void main(String[] args) {
	    
	        int minimo = 1;
	        int maximo = 100;
	        int intento;
	        String respuesta;
	        
	        Scanner sc = new Scanner(System.in);
	        
	        
	        System.out.println("Piensa un número entre 1 y 100");
	        System.out.println("El ordenador intentará adivinarlo");
	     
	        do {
	          
	            intento = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
	            System.out.println("¿Es " + intento + " tu número?");
	            System.out.print("Escribe (mayor/menor/igual): ");
	            respuesta = sc.next().toLowerCase();

	            if (respuesta.equals("mayor")) {
	                minimo = intento + 1;          
	            } else if (respuesta.equals("menor")) {
	                maximo = intento - 1; 
	            } else if (!respuesta.equals("igual")) {
	                System.out.println("Por favor, responde solo con 'mayor', 'menor' o 'igual'.");
	            }

	        } while (!respuesta.equals("igual"));

	        System.out.println("¡HAS ACERTADO! El número era " + intento + ".");
	        sc.close();
	    }
}
