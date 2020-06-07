package br.com.trabalhopi.core;

import java.math.BigDecimal;
import java.util.Date;


public class Reserva {
	
	private Date dataInicio;
	private Date dataFim;
	private String local;
	private Cliente cliente;
	private GuiaTurismo guia;
	private BigDecimal valorTotal;
	
	public Date getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Date getDataFim() {
		return dataFim;
	}
	
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	public String getLocal() {
		return local;
	}
	
	public void setLocal(String local) {
		this.local = local;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public GuiaTurismo getGuia() {
		return guia;
	}
	
	public void setGuia(GuiaTurismo guia) {
		this.guia = guia;
	}
	
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
