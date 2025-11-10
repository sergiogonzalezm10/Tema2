package dowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int num = 1;
		int numFinal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número : ");
		numFinal = sc.nextInt();
		
		do {
			System.out.print(num + " " );
			num++;
		} while (num <= numFinal);

		sc.close();
		
	}

}
