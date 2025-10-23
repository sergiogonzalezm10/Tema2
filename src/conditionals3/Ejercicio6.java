package conditionals3;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int mes;
		int año;
		boolean bisiesto;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número del mes: ");
		mes = sc.nextInt();
		
		System.out.println("Introduce el año: ");
		año = sc.nextInt();
		
		bisiesto = ( año % 4  == 0 ) || (año % 100 == 0) || ( (año % 100 == 0) && (año % 400 == 0));
		
		if (bisiesto = true ) {
			System.out.println("Tu año es bisiesto");
			
			switch (mes) {
			case 1 -> {
				System.out.println("Enero: 31 días");
			} case 2 -> {
				System.out.println("Febrero: 29 días");
			} case 3 -> {
				System.out.println("Marzo: 31 días");
			} case 4 -> {
				System.out.println("Abril: 30 días");
			} case 5 -> {
				System.out.println("Mayo: 31 días");
			} case 6 -> {
				System.out.println("Junio: 30 días");
			} case 7 -> {
				System.out.println("Julio: 31 días");
			} case 8 -> {
				System.out.println("Agosto: 31 días");
			} case 9 -> {
				System.out.println("Septiembre: 30 días");
			} case 10 -> {
				System.out.println("Octubre: 31 días");
			} case 11 -> {
				System.out.println("Noviembre: 30 días");
			} case 12 -> {
				System.out.println("Diciembre: 31 días");
			} default -> {
				System.out.println("El año tiene 12 meses");
						 }
			}
			
		} else {
			System.out.println("Tu año no es bisiesto");
			System.out.println("Enero: 31 días");
			System.out.println("Febrero: 2 días");
			System.out.println("Marzo: 31 días");
			System.out.println("Abril: 30 días");
			System.out.println("Mayo: 31 días");
			System.out.println("Junio: 30 días");
			System.out.println("Julio: 31 días");
			System.out.println("Agosto: 31 días");
			System.out.println("Septiembre: 30 días");
			System.out.println("Octubre: 31 días");
			System.out.println("Noviembre: 30 días");
			System.out.println("Diciembre: 31 días");
		}
	}

}
