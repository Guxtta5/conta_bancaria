package conta.repository;

import conta.model.Conta;

public interface ContaRepository{

	// crud de conta
	public void procurarPorNumero(int numero);

	public void listarTodos();

	public void cadastrar(Conta conta);

	public void artualizar(Conta conta);

	public void deletar(int numero);

	// metodos bancarios
	public void sacar(int numero, float valor);

	public void depositar(int numero, float valor);

	public void tranferir(int numeroOrigem, int numeroDestino, float valor);
}