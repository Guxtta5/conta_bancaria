package conta.model;

public class contaCorrente extends conta {

	private float limete;
	
	 public contaCorrente(int numero, int agencia, String tipo, String titular, float saldo, float limete) {
		
		super(numero, agencia, tipo, titular, saldo);
	}

	public float getLimete() {
		return limete;
	}

	public void setLimete(float limete) {
		this.limete = limete;
	}
	
	@Override
	
	public boolean sacar(float valor) {
		if(this.getSaldo() + this.getLimete() < valor) {
			System.out.println("\nSeu saldo é insuficiente");
			return false;
	}
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("\nValor sacado com sucesso");
		return true;
}
}