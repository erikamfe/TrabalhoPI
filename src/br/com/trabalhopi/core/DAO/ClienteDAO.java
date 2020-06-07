package br.com.trabalhopi.core.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.trabalhopi.core.Cliente;

public class ClienteDAO {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void cadastrarCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public List<Cliente> buscarClientes(String nome) {
		return this.clientes.stream().filter(client -> client.getNome().equals(nome)).collect(Collectors.toList());
	}
}
