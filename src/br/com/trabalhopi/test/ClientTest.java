package br.com.trabalhopi.test;

import org.junit.Test;

import br.com.trabalhopi.core.Cliente;
import org.junit.Assert;

public class ClientTest {
	
	@Test
	public void testeClient(){
		Cliente cliente = new Cliente();
		
		cliente.setNome("Joao");
		cliente.setEmail("Joao@teste.com");
		cliente.setSenha("123456");
		cliente.setTelefone("(31)9-1234-5678");
		
		Assert.assertTrue(cliente.getNome().equals("Joao"));
		Assert.assertFalse(cliente.getEmail().equals("test@test.com"));
		Assert.assertTrue(cliente.getTelefone().equals("(31)9-1234-5678"));
	}
}
