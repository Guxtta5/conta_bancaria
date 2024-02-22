package conta;

import conta.model.conta;
import conta.model.contaCorrente;
import conta.model.contaPoupanca;

public class menu {

	public static void main(String[] args) {
		
		contaCorrente contaCorrente1 = new contaCorrente(56892532, 1000, "Conta Corrente", "Gustavo Barbosa dos santos", 5000.0f, 5000.0f);
			
		System.out.println("saldo inical " + contaCorrente1.getSaldo());
		contaCorrente1.sacar(20500);
		System.out.println("\nsaldo apos saque " + contaCorrente1.getSaldo());
		
		
		}

	/*
	 * istanciando um novo objeto de conta usando o a classe do objeto que ja
	 * criamos conta novaConta = new conta();
	 * 
	 * //passando os valores individualmente nesta nova Conta //chamndo o novo
	 * objeto criado e chamando nos sets novaConta.setNumero(325468252);
	 * novaConta.setAgencia(4538); novaConta.setTipo("Poupança");
	 * novaConta.setTitular("Gustavo"); novaConta.setSaldo(25000.0f);
	 * 
	 * //usaremos os gets agora para mostrar as informações que inserimos
	 * 
	 * System.out.println("Número da Conta " + novaConta.getNumero());
	 * System.out.println("Número da Agencia " + novaConta.getAgencia());
	 * System.out.println("Tipo de Conta " + novaConta.getTipo());
	 * System.out.println("Titular da Conta " + novaConta.getTitular());
	 * System.out.println("Saldo na Conta " + novaConta.getSaldo());
	 */
}
