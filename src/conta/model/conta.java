package conta.model;

public class conta {
	
	//atributos sendo inicializados com private para
	//que apenas essa classe possa ter acesso a eles
	private int numero;
	private int agencia;
	private String tipo;
	private String titular;
	private float saldo;
	
	//metodo contrudor cheio e um vazio 
	
	public conta(int numero, int agencia, String tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public conta() {}
	
	//foi criado o método get e set para cada atributo
	public int getNumero() { //get é o que retornar os dados
		return numero;
	}
	public void setNumero(int numero) { //set que recebe o parametro e atribui o valor dentro do objeto
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo ) {
		this.tipo = tipo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean sacar(float valor) {
		if (this.getSaldo() < saldo) {
			System.out.println("\n Saldo Insufisiente");
		}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	public void depositar(float valorDepositado) {
		this.setSaldo(this.getSaldo() + valorDepositado);
	}
	public void mesAniversario(int dataAniversario) {
		this.setTitular(this.getTitular() + dataAniversario);
	}
}
