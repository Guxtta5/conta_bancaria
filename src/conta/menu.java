package conta;

import conta.model.conta;

public class menu {

	public static void main(String[] args) {
		
		//istanciando um novo objeto de conta usando o a classe do objeto que ja criamos 
		conta novaConta = new conta();
		
		//passando os valores individualmente nesta nova Conta
		//chamndo o novo objeto criado e chamando nos set
		novaConta.setNumero(325468252);
		novaConta.setAgencia(4538);
		novaConta.setTipo("Poupança");
		novaConta.setTitular("Gustavo");
		novaConta.setSaldo(25000.0f);
		
		//usaremos os get agora para mostrar as informações que inserimos
		
		System.out.println("Número da Conta " + novaConta.getNumero());
		System.out.println("Número da Agencia " + novaConta.getAgencia());
		System.out.println("Tipo de Conta " + novaConta.getTipo());
		System.out.println("Titular da Conta " + novaConta.getTitular());
		System.out.println("Saldo na Conta " + novaConta.getSaldo());
	}

}
