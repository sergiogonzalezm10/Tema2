package ejerciciosbucle;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num;ç
		boolean esPrimo = true;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if (num <= 1) {
				esPrimo = false;
			}
			if (num % i == 0 && i != 1 && i != num) {
				esPrimo = false;
			}
			
		}
		
		

	}

}
