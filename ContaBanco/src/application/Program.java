package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Por favor, digite o número da Agência !");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.println("Por favor, digite o nome da Agência !");
		String agencia = sc.nextLine();
		System.out.println("Por favor, digite seu nome !");
		String nomeCliente = sc.nextLine();
		System.out.println("Por favor, digite o saldo !");
		double saldo = sc.nextDouble();
		
		System.out.println("\"Olá "+ nomeCliente +", obrigado por criar uma conta em "
				+ "nosso banco, sua agência é " + agencia + ", conta " + numero + 
				" e seu " + "saldo "+ saldo + " já está disponível para saque\".");
	}
}
