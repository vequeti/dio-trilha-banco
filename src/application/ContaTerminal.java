package application;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer numeroConta;
		String agencia;
		String nomeCliente;
		Double saldo;
		
		System.out.print("Por favor, digite o numero da conta: ");
		numeroConta = sc.nextInt();
		System.out.println("Por favor, digite o numero da agencia: ");
		agencia = sc.next();
		System.out.println("Por favor, digite seu nome: ");
		sc.nextLine();
		nomeCliente = sc.nextLine();
		System.out.println("Por favor, digite seu saldo: ");
		saldo = sc.nextDouble();
		
		
		System.out.println("Ola " + nomeCliente + 
		", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
		+ ", conta " + numeroConta
		+ " e seu saldo " + saldo
		+ " já está disponível para saque");
		sc.close();
	}
}