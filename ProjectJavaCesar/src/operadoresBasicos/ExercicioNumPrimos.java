package operadoresBasicos;

import java.util.Scanner;

public class ExercicioNumPrimos {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int num1, num2, soma;
		
		
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		switch(soma) {
		case 1:
			System.out.println("Não é primo!");
			break;
		case 2:
			System.out.println("É primo!");
			break;
		case 3:
			System.out.println("É primo!");
			break;
		case 4:
			System.out.println("Não é primo!");
			break;
		case 5:
			System.out.println("É primo!");
			break;
		default:
			System.out.println("Não é primo!");
			break;
		
		}
	}
}
