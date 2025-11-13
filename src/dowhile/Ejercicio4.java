package dowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num = 0;
		int numMult;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		numMult = sc.nextInt();
		
		do {
			System.out.println(numMult + " x " + num + " = " + (numMult * num));
			num++; 
		} while (num <= 10);
		
		sc.close();
		
	}

}
