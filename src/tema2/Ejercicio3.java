package tema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double x;
		double x1;
		double x2;
		double raiz;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce valor a: ");
		a = sc.nextDouble();
		System.out.println("Introduce valor b: ");
		b = sc.nextDouble();
		System.out.println("Introduce valor c: ");
		c = sc.nextDouble();
		
		raiz = b*b - 4*a*c;
		
		if (raiz > 0 )  {
		x1 = (-b + Math.sqrt(raiz))/ (2 * a);
		x2 = (-b - Math.sqrt(raiz))/ (2 * a);
		System.out.println("Soluciones reales:");
		System.out.println("X = " + x1);
		System.out.println("X = " + x2);
	
		} else if (raiz == 0) {
        x = -b / (2 * a);
        System.out.println("Hay una única solución real:");
        System.out.println("x = " + x);
        
		} else {
			System.out.println("La ecuación no tiene soluciones reales.");
		}
		}
	}

