package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {

	// CRUD DA CONTA

	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listarTodos() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletar(int numero) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void tranferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void cadastrar(Conta conta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Conta conta) {
		// TODO Auto-generated method stub

	}

	public Conta buscarNaCollection(int numero) {
		for (var conta : listaContas) {
			if(conta.getNumero() == numero) {
				return conta;
			}
		}
		
		return null;
	}

	@Override
	public void artualizar(Conta conta) {
		// TODO Auto-generated method stub
		
	}

}