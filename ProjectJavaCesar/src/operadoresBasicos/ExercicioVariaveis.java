package operadoresBasicos;

import java.util.Scanner;

public class ExercicioVariaveis {
	private static final Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		double num1;
		double num2;
		double media;
		
		System.out.println("Num 1: ");
		num1 = sc.nextInt();
		System.out.println("Num 2: ");
		num2 = sc.nextInt();
		media = (num1 + num2) / 2;
		System.out.println("A média dos valores é de: " + media);
		sc.close();
	}
}
