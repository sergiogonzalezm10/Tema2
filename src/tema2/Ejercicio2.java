package tema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
	double num;

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Introduce número:");
	num = sc.nextDouble();
	
	if (num <= -1 || num >= 1) {
		System.out.println("El número no es casi-cero");
	} else { 
		System.out.println("El número es casi-cero");
	}

	sc.close();
	}

}
