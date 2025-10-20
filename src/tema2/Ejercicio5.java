package tema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		final String PIEDRA = "PIEDRA";
		final String PAPEL = "PAPEL";
		final String TIJERA = "TIJERA";
		
		String jugada1;
		String jugada2;
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Movimiento jugador1 (PIEDRA , PAPEL O TIJERA): ");
	jugada1 = sc.next();
	System.out.println("Movimiento jugador2 (PIEDRA , PAPEL O TIJERA): ");
	jugada2 = sc.next();

	if (!jugada1.equals(PIEDRA) && !jugada1.equals(PAPEL) && !jugada1.equals(TIJERA)) {
		System.out.println("Solo puedes utilizar PIEDRA , PAPEL O TIJERA");
		
		} else if (!jugada2.equals(PIEDRA) && !jugada2.equals(PAPEL) && !jugada2.equals(TIJERA)) {
		System.out.println("Solo puedes utilizar PIEDRA , PAPEL O TIJERA");
		
	} else if (jugada1.equals(jugada2)) { 
		System.out.println("Empate : " + jugada1 + " Y " + jugada2);
		
	} else if (jugada1.equals(PIEDRA) && jugada2.equals(TIJERA)	|| jugada1.equals(PAPEL) && jugada2.equals(PIEDRA)|| jugada1.equals(TIJERA) && jugada2.equals(PAPEL)) {
		System.out.println("Gana el jugador 1");
		
	} else {
		System.out.println("Gana el jugador 2");
	}
	
	sc.close();
	
	
	
	}
}
