package br.com.trabalhopi.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.trabalhopi.core.GuiaTurismo;

public class GuiaTest {

	@Test
	public void testeGuia(){
		GuiaTurismo guia = new GuiaTurismo();
		
		guia.setNomeGuia("Maria");
		guia.setCarroGuia("Fox");
		guia.setNumeroPessoasAtendida(5);
		
		Assert.assertTrue(guia.getNomeGuia().equals("Maria"));
		Assert.assertFalse(guia.getCarroGuia().equals("Fox"));
		
	}
}
