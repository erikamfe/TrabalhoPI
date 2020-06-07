package br.com.trabalhopi.core.DAO;

import java.util.ArrayList;
import java.util.List;

import br.com.trabalhopi.core.Reserva;

public class ReservaDAO {

private List<Reserva> reservas = new ArrayList<>();
	
	public void addReserva(Reserva reserva) {
		reservas.add(reserva);
	}
}
