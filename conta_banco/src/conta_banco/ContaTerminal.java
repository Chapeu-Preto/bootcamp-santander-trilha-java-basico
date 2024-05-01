package conta_banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		//Exibir as mensagens para o nosso usuário
		System.out.println("     Bora Abrir tua conta ?   ");
		System.out.println("                              ");
		System.out.println("Digite Seu Nome: ");
		String nome = scanner.nextLine();
		System.out.println("Digite sua Agência: ");
		String agencia = scanner.nextLine();
		System.out.println("Digite o Número da Sua Conta: ");
		int conta = scanner.nextInt();
		System.out.println("Digite Seu saldo: ");
		double saldo = scanner.nextDouble();
		System.out.println("                              ");
		System.out.println("                              ");
		
		System.out.println("Olá " + nome + " ! ");
		System.out.println("Obrigado por abrir uma conta em nosso banco.");
		System.out.println("                                            ");
		System.out.println("             Dados Bancarios                ");
		System.out.println("                                            ");
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("Saldo: " + saldo);
		System.out.println("                                            ");
        System.out.println("Seu saldo já está disponível para saque");
		
		
	}

}
