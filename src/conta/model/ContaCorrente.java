package conta.model;

public class ContaCorrente extends Conta {

	private float limete;

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limete) {

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
		if (this.getSaldo() + this.getLimete() < valor) {
			System.out.println("\nSeu saldo é insuficiente");
			return false;
		}
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("\nValor sacado com sucesso");
		return true;
	}
	public void visualizar() {
		
	}
}