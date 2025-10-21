package switch1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		String tirada1;
		String tirada2;		
		int num1;			
		int num2;
						
		System.out.println("Introduce el valor del dado en la primera tirada(UNO, DOS, etc): ");
		tirada1 = sc.next();
				
		System.out.println("Introduce el valor del dado en la segunda tirada (UNO, DOS, etc): ");
		tirada2 = sc.next();
				
				
		num1 = switch (tirada1) {
		case "UNO","uno" -> {
			yield 1;
		}
		case "DOS", "dos" -> {
			yield 2;
		}
		case "TRES", "tres" -> {
			yield 3;
		}
		case "CUATRO","cuatro" -> {
			yield 4;
		}
		case "CINCO", "cinco" -> {
			yield 5;
		}
		case "SEIS", "seis" -> {
			yield 6;
		}
		default -> {
			System.out.println("La primera tirada no es válida");
				yield 0;
		}
				};
				
				num2 = switch (tirada2) {
				case "UNO","uno" -> {
					yield 1;
				}
				case "DOS", "dos" -> {
					yield 2;
				}
				case "TRES", "tres" -> {
					yield 3;
				}
				case "CUATRO","cuatro" -> {
					yield 4;
				}
				case "CINCO", "cinco" -> {
					yield 5;
				}
				case "SEIS", "seis" -> {
					yield 6;
				}
				default -> {
					System.out.println("La segunda tirada no es válida");
					yield 0;
				}
				};

			
				System.out.println("La suma es: "+(num1+num2));
				
				sc.close();
			}

		}
