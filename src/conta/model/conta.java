package conta.model;

public class conta {
	
	//atributos sendo inicializados com private para
	//que apenas essa classe possa ter acessoa a eles
	private int numero;
	private int agencia;
	private String tipo;
	private String titular;
	private float saldo;
	
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
	
	
}
