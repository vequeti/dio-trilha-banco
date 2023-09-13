package application;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Integer numeroConta;
		String agencia;
		String nomeCliente;
		Double saldo;
		
		System.out.print("Por favor, digite o numero da conta: ");
		numeroConta = sc.nextInt();
		System.out.println("Por favor, digite o numero da agencia: ");
		agencia = sc.next();
		System.out.println("Por favor, digite seu nome: ");
		nomeCliente = sc.next();
		System.out.println("Por favor, digite seu saldo: ");
		saldo = sc.nextDouble();
		
		
		System.out.println("Ola!" + nomeCliente);
		sc.close();
	}
}