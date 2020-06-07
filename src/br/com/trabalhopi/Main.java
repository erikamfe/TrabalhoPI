package br.com.trabalhopi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import br.com.trabalhopi.core.Cliente;
import br.com.trabalhopi.core.Endereco;
import br.com.trabalhopi.core.GuiaTurismo;
import br.com.trabalhopi.core.Reserva;
import br.com.trabalhopi.core.Sexo;
import br.com.trabalhopi.core.DAO.ClienteDAO;
import br.com.trabalhopi.core.DAO.GuiaDAO;
import br.com.trabalhopi.core.DAO.ReservaDAO;

public class Main {
	private static Scanner scan = new Scanner(System.in);	

	
	public static void main(String[] args) throws Exception {
		ClienteDAO clienteDAO = new ClienteDAO();
		GuiaDAO guiaDAO = new GuiaDAO();
		ReservaDAO reservaDAO = new ReservaDAO();
		
		Cliente cliente = criarCliente();
		GuiaTurismo guia = cadastrarGuia();
		Reserva reserva = criarReserva(cliente, guia);
		clienteDAO.cadastrarCliente(cliente);
		guiaDAO.addGuia(guia);
		reservaDAO.addReserva(reserva);
	}
	
	private static Cliente criarCliente() throws ParseException {
		Cliente cliente = new Cliente();
		System.out.println("Digite o nome do cliente: ");
		cliente.setNome(scan.nextLine());
		System.out.println("Digite o email: ");
		cliente.setEmail(scan.nextLine());
		System.out.println("Digite o numero de telfone: ");
		cliente.setTelefone(scan.nextLine());
		System.out.println("Digite a senha: ");
		cliente.setSenha(scan.nextLine());
		System.out.println("Digite a data de nascimento: ");
		cliente.setDataNascimento(new SimpleDateFormat("dd/MM/yyyy").parse(scan.nextLine()));
		cliente.setEndereco(cadastrarEndereco());
		return cliente;
	}
	
	private static Endereco cadastrarEndereco() {
		Endereco endereco = new Endereco();
		System.out.println("Digite seu estado: ");
		endereco.setEstado(scan.nextLine());
		System.out.println("Digite sua cidade: ");
		endereco.setCidade(scan.nextLine());
		System.out.println("Digite sua rua: ");
		endereco.setRua(scan.nextLine());
		System.out.println("Digite o numero da casa: ");
		endereco.setNumero(scan.nextInt());
		return endereco;
	}
	
	private static GuiaTurismo cadastrarGuia() {
		GuiaTurismo guia = new GuiaTurismo();
		System.out.println("Digite o nome do guia: ");
		guia.setNomeGuia(scan.nextLine());
		System.out.println("Digite o sexo do guia M/F: ");
		guia.setSexo(Sexo.valueOf(scan.next().charAt(0)).get());
		System.out.println("Digite o valor cobrado do guia: ");
		guia.setValorCobrado(scan.nextBigDecimal());
		System.out.println("Digite a quantidade de pessoas atendida: ");
		guia.setNumeroPessoasAtendida(scan.nextInt());
		System.out.println("Digite o horario de atendimento do guia: ");
		guia.setHorarioAtendimentoGuia(scan.nextLine());
		return guia;
	}
	
	private static Reserva criarReserva(Cliente cliente, GuiaTurismo guia) throws ParseException {
		Reserva reserva = new Reserva();
		reserva.setCliente(cliente);
		reserva.setGuia(guia);
		System.out.println("Digite a data Inicio da reserva: ");
		reserva.setDataInicio(new SimpleDateFormat("dd/MM/yyyy").parse(scan.nextLine()));
		System.out.println("Digite a data fim da reserva: ");
		reserva.setDataFim(new SimpleDateFormat("dd/MM/yyyy").parse(scan.nextLine()));
		System.out.println("Digite o local da reserva: ");
		reserva.setLocal(scan.nextLine());
		return reserva;
	}
}
