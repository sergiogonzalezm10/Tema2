package while1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int numero;
        int contador = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        double mediaNegativos = 0;

        System.out.println("Introduce 10 números enteros (positivos, negativos o cero):");

        while (contador < 10) {
            System.out.print("Número " + (contador + 1) + ": ");
            numero = sc.nextInt();

            if (numero > 0) {
                sumaPositivos += numero;
            } else if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;
            } else {
                contadorCeros++;
            }

            contador++;
        }

        if (contadorNegativos > 0) {
            mediaNegativos = (double) sumaNegativos / contadorNegativos;
        }

        System.out.println("Resultados:");
        System.out.println("Suma de los números positivos: " + sumaPositivos);
        if (contadorNegativos > 0)
            System.out.println("Media de los números negativos: " + mediaNegativos);
        else
            System.out.println("No se introdujeron números negativos.");
        System.out.println("Cantidad de ceros introducidos: " + contadorCeros);

        sc.close();

	}

}
