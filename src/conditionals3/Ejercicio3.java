package conditionals3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

       
       final char[] LETRASDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
                            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 
                            'C', 'K', 'E'};

        System.out.println("Introduce el número de DNI (8 dígitos): ");
        int numeroDNI = scanner.nextInt();

       
        if (numeroDNI < 10000000 || numeroDNI > 99999999) {
            System.out.println("El número del DNI debe tener 8 dígitos.");
        } else {
            int resto = numeroDNI % 23;
            char letra = LETRASDNI[resto];
            System.out.println("La letra del DNI es: " + letra);
            System.out.println("DNI completo: " + numeroDNI + letra);
        }

        scanner.close();
    }
}