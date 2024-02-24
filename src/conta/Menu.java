package conta;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

import conta.controller.ContaController;
import conta.model.Conta;
import conta.model.ContaPoupanca;
import conta.model.ContaCorrente;
import conta.util.Cores;

public class Menu {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int opcao, numero, agencia, tipo, aniversario;
		String titular;
		float limite, saldo;

		ContaController contas = new ContaController();

		System.out.println("Criar Contas");

		ContaCorrente cc1 = new ContaCorrente(contas.gerarNumeros(), 123, 1, "Matheus Barbosa", 3000f, 500.0f);
		contas.cadastrar(cc1);

		ContaCorrente cc2 = new ContaCorrente(contas.gerarNumeros(), 124, 1, "Maria de Lourde", 1300f, 100.0f);
		contas.cadastrar(cc2);

		ContaPoupanca cp1 = new ContaPoupanca(contas.gerarNumeros(), 125, 2, "Isabel Jesus", 2500f, 12);
		contas.cadastrar(cp1);

		ContaPoupanca cp2 = new ContaPoupanca(contas.gerarNumeros(), 125, 2, "Gustavo Barbosa", 5000f, 15);
		contas.cadastrar( cp2 );

		contas.listarTodas();

		while (true) {
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                    BANCO DO HORIZEN                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todas as Contas               ");
			System.out.println("            3 - Buscar Conta por Numero              ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sacar                                ");
			System.out.println("            7 - Depositar                            ");
			System.out.println("            8 - Transferir valores entre Contas      ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("             Entre com a opção desejada:             ");

			try {
				opcao = ler.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				ler.nextLine();
				opcao = 0;
			}

			if (opcao == 9) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\nBanco horizen - O seu Futuro muda aqui!");
				sobre();
				ler.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n");

				System.out.println("Digite o numero da agência: ");
				agencia = ler.nextInt();
				System.out.println("Digite o nome do titular");
				ler.skip("\\R?");
				titular = ler.nextLine();

				do {
					System.out.println("Digite o tipo da Conta (1-CC ou 2-CP):");
					tipo = ler.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Qual é o sado da conta R$:");
				saldo = ler.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito R$:");
					limite = ler.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumeros(), agencia, tipo, titular, saldo, limite));
				}
				case 2 -> {
					System.out.println("Qual o dia de aniversario: ");
					aniversario = ler.nextInt();
					contas.cadastrar(
							new ContaPoupanca(contas.gerarNumeros(), agencia, tipo, titular, saldo, aniversario));
				}
				}
				keyPress();
				break;

			case 2:
				System.out.println("Listar todas as Contas\n");
				contas.listarTodas();
				keyPress();
				break;

			case 3:
				System.out.println("Consultar dados da conta - por numero\n\n");

				System.out.println("Digite o número da conta: ");
				numero = ler.nextInt();

				contas.procurarPorNumero(numero);

				keyPress();
				break;
			case 4:

				System.out.println("Atualizar dados da Conta\n\n");

				System.out.println("Digite o número da conta: ");
				numero = ler.nextInt();

				var buscaConta = contas.buscarNaCollection(numero);

				if (buscaConta != null) {

					System.out.println("Digite o Numero da Agência: ");
					agencia = ler.nextInt();
					System.out.println("Digite o Nome do Titular: ");
					ler.skip("\\R?");
					titular = ler.nextLine();

					System.out.println("Digite o Saldo da Conta (R$): ");
					saldo = ler.nextFloat();

					tipo = buscaConta.getTipo();

					switch (tipo) {
					case 1 -> {
						System.out.println("Digite o Limite de Crédito (R$): ");
						limite = ler.nextFloat();
						contas.atualizar(new ContaCorrente(numero, agencia, tipo, titular, saldo, limite));
					}
					case 2 -> {
						System.out.println("Digite o dia do Aniversario da Conta: ");
						aniversario = ler.nextInt();
						contas.atualizar(new ContaPoupanca(numero, agencia, tipo, titular, saldo, aniversario));
					}
					default -> {
						System.out.println("Tipo de conta inválido!");
					}
					}

				} else
					System.out.println("\nConta não encontrada!");

				keyPress();
				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");

				System.out.println("Digite o número da conta: ");
				numero = ler.nextInt();

				contas.deletar(numero);

				keyPress();
				break;
			case 6:
				System.out.println("Sacar\n\n");

				keyPress();
				break;
			case 7:
				System.out.println("Depositar\n\n");

				keyPress();
				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");

				keyPress();
				break;
			case 9:
				System.out.println("\nOpção Inválida!\n");
			}
		}
	}

	private static void keyPress() {

	}

	private static void sobre() {

	}
}