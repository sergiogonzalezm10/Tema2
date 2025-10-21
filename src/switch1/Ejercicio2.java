package switch1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int dia;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número del día de la semana: ");
		dia = sc.nextInt();
		
		switch (dia) {
		case 1 -> {
		System.out.println("Lunes");
		}
		case 2 -> {
			System.out.println("Martes");
		}
		case 3 -> {
			System.out.println("Miércoles");
		}
		case 4 -> {
			System.out.println("Jueves");
		}
		
		case 5 -> {
			System.out.println("Viernes");
		}
		case 6 -> {
			System.out.println("Sábado");
		}
		case 7 -> {
			System.out.println("Domingo");
		}
					}
 }
}	
