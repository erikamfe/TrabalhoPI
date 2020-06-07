package br.com.trabalhopi.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.trabalhopi.core.Cliente;
import br.com.trabalhopi.core.DAO.ClienteDAO;

public class ClienteDAOTest {
	
	@Test
	public void testeClientDAO(){
		Cliente cliente = new Cliente();
		ClienteDAO clienteDAO = new ClienteDAO();
		
		cliente.setNome("Joao");
		cliente.setEmail("Joao@teste.com");
		cliente.setSenha("123456");
		cliente.setTelefone("(31)9-1234-5678");
		clienteDAO.cadastrarCliente(cliente);
		
		Assert.assertTrue(clienteDAO.buscarClientes("Joao").size() == 1);
	}
}
