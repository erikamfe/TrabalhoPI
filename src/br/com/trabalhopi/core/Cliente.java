package br.com.trabalhopi.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente {
	
	private String nome;
	private String email;
	private Endereco endereco;
	private String senha;
	private String telefone;
	private Date DataNascimento;
	private List<Reserva> reservas = new ArrayList<Reserva>();
	
	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Date getDataNascimento() {
		return DataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	
}
