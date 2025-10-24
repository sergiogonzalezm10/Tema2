package ifelse;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número 1: ");
		num1 = sc.nextInt();
		System.out.println("Introduce el número 2: ");
		num2 = sc.nextInt();
		System.out.println("Introduce el número 3: ");
		num3 = sc.nextInt();
		
		
		if (num1 + num2 == num3) {
			System.out.println("La suma del número 1 y número 2 es igual al número 3");

		} else if ( num1 + num3 == num2) {
			System.out.println("La suma del número 1 y número 3 es igual al número 2");
		
		} else if ( num2 + num3 == num1) {
			System.out.println("La suma del número 2 y número 3 es igual al número 1");
		
		} else {
			System.out.println("La suma entre dos de algunos de estos números no da de resultado el valor del otro");
		}
		
		sc.close();
	}
}
