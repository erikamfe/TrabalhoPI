package br.com.trabalhopi.core;

import java.math.BigDecimal;
import java.util.Date;

public class GuiaTurismo {
	
	
	private String nomeGuia;
	private Sexo sexo;
	private Date dataNascimento;
	private BigDecimal valorCobrado;
	private int numeroPessoasAtendida;
	private String horarioAtendimentoGuia;
	private String carroGuia;
	
	public String getNomeGuia() {
		return nomeGuia;
	}
	
	public void setNomeGuia(String nomeGuia) {
		this.nomeGuia = nomeGuia;
	}
	
	public Sexo getSexo() {
		return sexo;
	}
	
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public BigDecimal getValorCobrado() {
		return valorCobrado;
	}
	
	public void setValorCobrado(BigDecimal valorCobrado) {
		this.valorCobrado = valorCobrado;
	}
	
	public int getNumeroPessoasAtendida() {
		return numeroPessoasAtendida;
	}
	
	public void setNumeroPessoasAtendida(int numeroPessoasAtendida) {
		this.numeroPessoasAtendida = numeroPessoasAtendida;
	}
	
	public String getHorarioAtendimentoGuia() {
		return horarioAtendimentoGuia;
	}
	
	public void setHorarioAtendimentoGuia(String horarioAtendimentoGuia) {
		this.horarioAtendimentoGuia = horarioAtendimentoGuia;
	}
	
	public String getCarroGuia() {
		return carroGuia;
	}
	
	public void setCarroGuia(String carroGuia) {
		this.carroGuia = carroGuia;
	}
	
}
