package conta.model;

public class contaPoupanca extends conta {
	private int aniversario;

	public contaPoupanca(int numero, int agencia, String tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
}
