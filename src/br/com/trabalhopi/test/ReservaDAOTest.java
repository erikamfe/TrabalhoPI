package br.com.trabalhopi.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.trabalhopi.core.Cliente;
import br.com.trabalhopi.core.GuiaTurismo;
import br.com.trabalhopi.core.Reserva;
import br.com.trabalhopi.core.DAO.ReservaDAO;

public class ReservaDAOTest {

	@Test
	public void testeReserva() {
		ReservaDAO reservaDAO = new ReservaDAO();
		Cliente cliente = new Cliente();
		GuiaTurismo guia = new GuiaTurismo();
		Reserva reserva = new Reserva();
		
		reserva.setCliente(cliente);
		reserva.setGuia(guia);
		reservaDAO.addReserva(reserva);
		
		Assert.assertTrue(reserva.getGuia().equals(guia));
		
	}
}
