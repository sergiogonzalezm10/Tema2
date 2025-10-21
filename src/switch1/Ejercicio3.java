package switch1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		double num1;
		double num2;
		String eleccion;
		double suma;
		double resta;
		double mult;
		double div;
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextDouble();
		
		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextDouble();
		
		System.out.println("Selecciona una opcion: ");
		System.out.println("A. SUMAR LOS NÚMEROS");
		System.out.println("B. RESTAR LOS NÚMEROS");
		System.out.println("C. MULTIPLICAR LOS NÚMEROS");
		System.out.println("D. DIVIDIR LOS NÚMEROS");
		eleccion = sc.next();
		
		switch (eleccion) {
		case "A" , "a" -> {
		suma = num1 + num2; 
		System.out.println("La suma es: " + suma);
		}
		case "B","b" -> {
			resta = num1 - num2;
			System.out.println("La resta es: " + resta);
		}
		case "C","c" -> {
			mult = num1 * num2;
			System.out.println("La multiplicación es: " + mult);
		}
		case "D","d" -> {
			if (num2!=0) {
			div = num1 / num2;
			System.out.println("La división es: " + div);
			} else {
				System.out.println("No se puede dividir entre 0");
			}
		}
		default ->
		System.out.println("Elección incorrecta");
						}
		sc.close();
	}
}
